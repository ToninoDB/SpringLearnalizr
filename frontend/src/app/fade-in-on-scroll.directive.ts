import {
  Directive,
  ElementRef,
  HostBinding,
  Input,
  OnInit,
  Renderer2,
} from '@angular/core';

@Directive({
  selector: '[appFadeInOnScroll]',
})
export class FadeInOnScrollDirective implements OnInit {
  @HostBinding('class.visible') isVisible = false;

  @Input('appFadeInOnScroll') enableFadeIn: boolean = true;

  constructor(private el: ElementRef, private renderer: Renderer2) {}

  ngOnInit(): void {
    if (!this.enableFadeIn) return; // 👉 salta la logica se disattivato

    const observer = new IntersectionObserver(
      (entries) => {
        entries.forEach((entry) => {
          if (entry.isIntersecting) {
            this.isVisible = true;
          } else {
            this.isVisible = false;
          }
        });
      },
      { threshold: 0.2 }
    );

    this.renderer.addClass(this.el.nativeElement, 'fade-in-section');
    observer.observe(this.el.nativeElement);
  }
}

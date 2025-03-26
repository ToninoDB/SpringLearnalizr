import {
  Directive,
  ElementRef,
  HostBinding,
  OnInit,
  Renderer2,
} from '@angular/core';

@Directive({
  selector: '[appFadeInOnScroll]',
})
export class FadeInOnScrollDirective implements OnInit {
  @HostBinding('class.visible') isVisible = false;

  constructor(private el: ElementRef, private renderer: Renderer2) {}

  ngOnInit(): void {
    const observer = new IntersectionObserver(
      (entries) => {
        entries.forEach((entry) => {
          if (entry.isIntersecting) {
            this.isVisible = true;
            observer.unobserve(this.el.nativeElement);
          }
        });
      },
      { threshold: 0.1 }
    );

    this.renderer.addClass(this.el.nativeElement, 'fade-in-section');
    observer.observe(this.el.nativeElement);
  }
}

import {
  Component,
  ElementRef,
  OnInit,
  ViewChild,
  AfterViewInit,
} from '@angular/core';
import { MainServiceService } from '../../services/main-service.service';
import { Capitolo } from '../../models/capitolo.model';
import { Router } from '@angular/router';

@Component({
  selector: 'app-capitoli-section',
  templateUrl: './capitoli-section.component.html',
  styleUrls: ['./capitoli-section.component.css'],
})
export class CapitoliSectionComponent implements OnInit, AfterViewInit {
  capitoli: Capitolo[] = [];
  selectedId: number = 0;

  @ViewChild('slider') slider!: ElementRef<HTMLDivElement>;

  constructor(private service: MainServiceService, private router: Router) {}

  ngOnInit(): void {
    this.service.getAllChapters().subscribe((data) => {
      this.capitoli = data;
      if (data.length > 0) {
        this.selectedId = data[0].id;
      }
    });
  }

  ngAfterViewInit(): void {
    // Scroll iniziale, se vuoi
    if (this.selectedId) {
      this.scrollToSlideById(this.selectedId);
    }
  }

  scrollToSlideById(id: number): void {
    this.selectedId = id;

    const target = document.getElementById('slide-' + id);
    const sliderElement = this.slider?.nativeElement;

    if (target && sliderElement) {
      const offsetLeft = target.offsetLeft - sliderElement.offsetLeft;
      sliderElement.scrollTo({
        left: offsetLeft,
        behavior: 'smooth',
      });
    }
  }

  vaiACapitolo(id: number): void {
    this.router.navigate(['/capitolo', id]);
  }
}

import { Component, ElementRef, OnInit, ViewChild } from '@angular/core';
import { MainServiceService } from '../../services/main-service.service';
import { Capitolo } from '../../models/capitolo.model';
import { Router } from '@angular/router';

@Component({
  selector: 'app-capitoli-section',
  templateUrl: './capitoli-section.component.html',
  styleUrls: ['./capitoli-section.component.css'],
})
export class CapitoliSectionComponent implements OnInit {
  capitoli: Capitolo[] = [];
  selectedIndex: number = 0;

  @ViewChild('slider') slider!: ElementRef;

  constructor(private service: MainServiceService, private router: Router) {}

  ngOnInit(): void {
    this.service.getAllChapters().subscribe((data) => {
      this.capitoli = data;
    });
  }

  scrollToSlide(index: number): void {
    this.selectedIndex = index;
    const sliderElement = this.slider.nativeElement;
    const slideWidth = sliderElement.offsetWidth;
    sliderElement.scrollTo({
      left: index * slideWidth,
      behavior: 'smooth',
    });
  }

  vaiACapitolo(id: number): void {
    this.router.navigate(['/capitolo', id]);
  }
}

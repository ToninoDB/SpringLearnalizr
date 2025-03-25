import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Capitolo } from 'src/app/models/capitolo.model';
import { MainServiceService } from 'src/app/services/main-service.service';

@Component({
  selector: 'app-capitoli-section',
  templateUrl: './capitoli-section.component.html',
  styleUrls: ['./capitoli-section.component.css'],
})
export class CapitoliSectionComponent implements OnInit {
  capitoli: Capitolo[] = [];

  constructor(private service: MainServiceService, private router: Router) {}

  ngOnInit(): void {
    this.service.getAllChapters().subscribe((data) => {
      this.capitoli = data;
    });
  }

  vaiACapitolo(id: number): void {
    this.router.navigate(['/capitolo', id]);
  }
}

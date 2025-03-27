import { Component, OnInit } from '@angular/core';
import { MainServiceService } from 'src/app/services/main-service.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
})
export class HomeComponent implements OnInit {
  capitoli: any[] = [];

  constructor(private service: MainServiceService) {}

  ngOnInit(): void {
    this.service.getAllChapters().subscribe((data) => {
      this.capitoli = data;
    });
  }
}

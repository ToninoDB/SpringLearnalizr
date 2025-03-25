import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { MainServiceService } from '../../services/main-service.service';
import { Capitolo } from '../../models/capitolo.model';

@Component({
  selector: 'app-capitolo',
  templateUrl: './capitolo.component.html',
  styleUrls: ['./capitolo.component.css'],
})
export class CapitoloComponent implements OnInit {
  capitolo!: Capitolo;

  constructor(
    private route: ActivatedRoute,
    private service: MainServiceService
  ) {}

  ngOnInit(): void {
    const id = Number(this.route.snapshot.paramMap.get('id'));
    this.service.getChapterById(id).subscribe((data) => {
      this.capitolo = data;
    });
  }
}

import { Component, OnInit } from '@angular/core';
import { Capitolo } from 'src/app/models/capitolo.model';
import { MainServiceService } from 'src/app/services/main-service.service';

@Component({
  selector: 'app-lista-capitoli',
  templateUrl: './lista-capitoli.component.html',
  styleUrls: ['./lista-capitoli.component.css'],
})
export class ListaCapitoliComponent implements OnInit {
  capitoli: Capitolo[] = [];

  constructor(private service: MainServiceService) {}

  ngOnInit(): void {
    this.service.getAllChapters().subscribe((capitoli) => {
      this.capitoli = capitoli;
    });
  }
}

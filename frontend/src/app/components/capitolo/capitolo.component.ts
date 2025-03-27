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
    //Recupera il capitolo selezionato dal route param
    //Estrae l'id dalla URL (es: /capitolo/3)
    const id = Number(this.route.snapshot.paramMap.get('id'));
    this.service.getChapterById(id).subscribe((data) => {
      this.capitolo = data;
    });
  }

  scrollToLezioneById(id: number): void {
    const element = document.getElementById('lezione-' + id);
    if (element) {
      element.scrollIntoView({ behavior: 'smooth' });
    }
  }

  scrollToPrimaLezione(): void {
    if (this.capitolo?.lezioni?.length) {
      const primoId = 'lezione-' + this.capitolo.lezioni[0].id;
      const el = document.getElementById(primoId);
      if (el) {
        el.scrollIntoView({ behavior: 'smooth' });
      }
    }
  }
}

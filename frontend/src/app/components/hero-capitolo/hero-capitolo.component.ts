import { Component, Input, Output, EventEmitter } from '@angular/core';
import { Lezione } from '../../models/lezione.model';

@Component({
  selector: 'app-hero-capitolo',
  templateUrl: './hero-capitolo.component.html',
  styleUrls: ['./hero-capitolo.component.css'],
})
export class HeroCapitoloComponent {
  @Input() capitoloId!: number;
  @Input() titolo!: string;
  @Input() descrizione!: string;
  @Input() lezioni: Lezione[] = [];

  //Prende lo scroll dal capitolo.component.html e lo applica al component hero-captiolo con l'evento (click) sul button (scroll.emit)
  @Output() scroll = new EventEmitter<void>();
}

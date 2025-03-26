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

  @Output() scrollToLezione = new EventEmitter<number>();
  @Output() scroll = new EventEmitter<void>();
}

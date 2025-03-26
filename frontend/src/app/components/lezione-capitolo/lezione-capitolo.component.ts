import { Component, Input } from '@angular/core';
import { Lezione } from 'src/app/models/lezione.model';

@Component({
  selector: 'app-lezione-capitolo',
  templateUrl: './lezione-capitolo.component.html',
  styleUrls: ['./lezione-capitolo.component.css'],
})
export class LezioneCapitoloComponent {
  //`Input`: decoratore che ci permette di **ricevere dati da un componente genitore**, in questo caso un oggetto `Lezione`.
  @Input() lezione!: Lezione;
}

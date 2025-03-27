import { Lezione } from 'src/app/models/lezione.model';

export interface Capitolo {
  id: number;
  titolo: string;
  descrizione: string;
  lezioni?: Lezione[];
}

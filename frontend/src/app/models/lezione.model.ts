import { Media } from './media.model';

export interface Lezione {
  id: number;
  titolo: string;
  contenuto: string;
  capitoloId: number;
  img_path: string;
}

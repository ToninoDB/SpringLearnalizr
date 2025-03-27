import { Component, Input } from '@angular/core';
import { Lezione } from '../../models/lezione.model';

@Component({
  selector: 'app-sidebar-menu-capitolo',
  templateUrl: './sidebar-menu-capitolo.component.html',
  styleUrls: ['./sidebar-menu-capitolo.component.css'],
})
export class SidebarMenuCapitoloComponent {
  @Input() lezioni: Lezione[] = [];
  @Input() capitoloId!: number;
  @Input() titoloCapitolo: string = '';

  menuAperto = false;

  toggleMenu(): void {
    this.menuAperto = !this.menuAperto;
  }

  scrollToLezione(id: number): void {
    const el = document.getElementById(`lezione-${id}`);
    if (el) {
      el.scrollIntoView({ behavior: 'smooth' });
    }
  }
}

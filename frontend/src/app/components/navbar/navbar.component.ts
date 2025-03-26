import { Component, HostListener } from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css'],
})
export class NavbarComponent {
  activeSection: string = 'hero';

  @HostListener('window:scroll', [])
  onWindowScroll() {
    const scrollY = window.scrollY;
    const sections = ['hero', 'capitoli', 'about'];

    for (const section of sections) {
      const el = document.getElementById(section);
      if (el) {
        const offsetTop = el.offsetTop;
        const offsetHeight = el.offsetHeight;

        if (
          scrollY >= offsetTop - 100 &&
          scrollY < offsetTop + offsetHeight - 100
        ) {
          this.activeSection = section;
          break;
        }
      }
    }
  }
}

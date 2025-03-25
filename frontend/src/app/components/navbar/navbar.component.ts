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
      const element = document.getElementById(section);
      if (element) {
        const offsetTop = element.offsetTop;
        const offsetHeight = element.offsetHeight;

        if (
          scrollY >= offsetTop - 50 &&
          scrollY < offsetTop + offsetHeight - 50
        ) {
          this.activeSection = section;
          break;
        }
      }
    }
  }
}

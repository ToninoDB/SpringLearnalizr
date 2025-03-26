import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { HttpClientModule } from '@angular/common/http';
import { NavbarComponent } from './components/navbar/navbar.component';
import { HeroSectionComponent } from './components/hero-section/hero-section.component';
import { CapitoliSectionComponent } from './components/capitoli-section/capitoli-section.component';
import { AboutSectionComponent } from './components/about-section/about-section.component';
import { CapitoloComponent } from './components/capitolo/capitolo.component';
import { FadeInOnScrollDirective } from './fade-in-on-scroll.directive';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    NavbarComponent,
    HeroSectionComponent,
    CapitoliSectionComponent,
    AboutSectionComponent,
    CapitoloComponent,
    FadeInOnScrollDirective,
  ],
  imports: [BrowserModule, HttpClientModule, AppRoutingModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}

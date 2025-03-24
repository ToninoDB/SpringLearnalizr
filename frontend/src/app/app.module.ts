import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { ListaCapitoliComponent } from './components/lista-capitoli/lista-capitoli.component';
import { DettagliCapitoloComponent } from './components/dettagli-capitolo/dettagli-capitolo.component';
import { DettagliLezioneComponent } from './components/dettagli-lezione/dettagli-lezione.component';
import { HttpClientModule } from '@angular/common/http';
import { NavbarComponent } from './components/navbar/navbar.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ListaCapitoliComponent,
    DettagliCapitoloComponent,
    DettagliLezioneComponent,
    NavbarComponent,
  ],
  imports: [BrowserModule, HttpClientModule, AppRoutingModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}

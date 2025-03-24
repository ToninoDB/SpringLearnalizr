import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { ListaCapitoliComponent } from './components/lista-capitoli/lista-capitoli.component';
import { DettagliCapitoloComponent } from './components/dettagli-capitolo/dettagli-capitolo.component';
import { DettagliLezioneComponent } from './components/dettagli-lezione/dettagli-lezione.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'chapters', component: ListaCapitoliComponent },
  { path: 'chapters/:id', component: DettagliCapitoloComponent },
  { path: 'lessons/:id', component: DettagliLezioneComponent },
  { path: '**', redirectTo: '' },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}

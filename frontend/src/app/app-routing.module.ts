import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { CapitoloComponent } from 'src/app/components/capitolo/capitolo.component'; // importa il componente che mostra il dettaglio

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'capitolo/:id', component: CapitoloComponent },
  { path: '**', redirectTo: '' },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}

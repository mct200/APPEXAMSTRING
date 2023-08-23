import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DeclarantListComponent } from './declarant-list/declarant-list.component';
import { DeclarantAddComponent } from './declarant-add/declarant-add.component';

const routes: Routes = [
  { path: 'declarants', component: DeclarantListComponent },
  { path: 'add-declarant', component: DeclarantAddComponent },
  // Ajoutez d'autres routes pour vos composants
  // Exemple: { path: 'update-declarant/:id', component: DeclarantUpdateComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DeclarantListComponent } from './declarant-list/declarant-list.component';
import { DeclarantAddComponent } from './declarant-add/declarant-add.component';
import { DeclarantUpdateComponent } from './declarant-update/declarant-update.component';
import { DeclarantDeleteComponent } from './declarant-delete/declarant-delete.component';


@NgModule({
  declarations: [
    AppComponent,
    DeclarantListComponent,
    DeclarantAddComponent,
    DeclarantUpdateComponent,
    DeclarantDeleteComponent
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { NavbarComponent } from './Componentes/navbar/navbar.component';
import { IniComponent } from './Componentes/ini/ini.component';
import { AtraccionComponent } from './Componentes/atraccion/atraccion.component';
import { FooterComponent } from './Componentes/footer/footer.component';
import { OffCanvasComponent } from './Componentes/off-canvas/off-canvas.component';
import { ReservaComponent } from './Componentes/reserva/reserva.component';
import { RouterModule, Routes } from '@angular/router';
import { LogInComponent } from './Componentes/log-in/log-in.component';

import {HttpClientModule} from '@angular/common/http';
import {FormsModule} from '@angular/forms';

const appRoutes:Routes=[
  {path:'', component:LogInComponent},
  {path:'zonas', component:IniComponent},
  {path:'reserva', component:ReservaComponent},
  
];

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    IniComponent,
    AtraccionComponent,
    FooterComponent,
    OffCanvasComponent,
    ReservaComponent,
    LogInComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(appRoutes),
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

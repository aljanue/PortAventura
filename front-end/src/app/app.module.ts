import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { IniComponent } from './ini/ini.component';
import { AtraccionComponent } from './atraccion/atraccion.component';
import { FooterComponent } from './footer/footer.component';
import { OffCanvasComponent } from './off-canvas/off-canvas.component';
import { ReservaComponent } from './reserva/reserva.component';
import { RouterModule, Routes } from '@angular/router';

const appRoutes:Routes=[
  {path:'', component:IniComponent},
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
    ReservaComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

import { Component } from '@angular/core';
import { Zona } from '../ini/zona.model';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent {
  todo:Zona={
    id: "todo",
    name: "Todas las atracciones",
    map:"portaventura.jpg"
  };
}

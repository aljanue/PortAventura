import { Component } from '@angular/core';
import { Zona } from './zona.model';

@Component({
  selector: 'app-ini',
  templateUrl: './ini.component.html',
  styleUrls: ['./ini.component.css']
})
export class IniComponent {
  zonas:Zona[]=[
    {name:"Portaventura Park. Mediterránia", id:"mediterranea", map:"mediterranea.jpeg"},
    {name:"Portaventura Park. Far West", id:"far-west", map:"far-west.png"},
    {name:"Portaventura Park. México", id:"mexico", map:"mexico.jpg"},
    {name:"Portaventura Park. China", id:"china", map:"china.jpg"},
    {name:"Portaventura Park. Polynesia", id:"polynesia", map:"polynesia.avif"},
    {name:"Ferrari Land", id:"ferrari", map:"ferrari.jpg"}
  ];
}

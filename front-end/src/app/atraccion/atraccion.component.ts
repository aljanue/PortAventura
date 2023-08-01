import { Component, Input } from '@angular/core';
import { Atraccion } from './atraccion.model';

@Component({
  selector: 'app-atraccion',
  templateUrl: './atraccion.component.html',
  styleUrls: ['./atraccion.component.css']
})
export class AtraccionComponent {
  @Input() zonaSeleccionada:String;
  atracciones:Atraccion[]=[
    {nombre:"Estació del Nord", zona:"Portaventura Park. Mediterránia", descripcion:"¡Pasajeros al tren!", altura:0, imagenUrl:"estacio-del-nord.avif", tiempo: 14},
    {nombre:"Furius Baco", zona:"Portaventura Park. Mediterránia", descripcion:"850 metros a toda velocidad", altura:1.40, imagenUrl:"furius-baco.avif", tiempo: 14},
    {nombre:"Port de la Drassana", zona:"Portaventura Park. Mediterránia", descripcion:"Un viaje de ensueño en barco", altura:0, imagenUrl:"port-de-la-drassana.avif", tiempo: 14},
    {nombre:"Stampida", zona:"Portaventura Park. Far West", descripcion:"¡Empieza el duelo!", altura:1.20, imagenUrl:"stampida.avif", tiempo: 14}
  ];
}

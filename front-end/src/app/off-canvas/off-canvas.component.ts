import { Component, Input } from '@angular/core';
import { Zona } from '../ini/zona.model';

@Component({
  selector: 'app-off-canvas',
  templateUrl: './off-canvas.component.html',
  styleUrls: ['./off-canvas.component.css']
})
export class OffCanvasComponent {
  @Input() zona:Zona;

}

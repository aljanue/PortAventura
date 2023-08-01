export class Atraccion{
    nombre:String="";
    descripcion:String="";
    imagenUrl:String="";
    zona:String="";
    altura:number=0;
    tiempo:number=0;

    constructor(nombre:String, descripcion:String, imagenUrl:String, zona:String, altura:number, tiempo:number){
        this.nombre=nombre;
        this.descripcion = descripcion;
        this.imagenUrl = imagenUrl;
        this.zona = zona;
        this.altura = altura;
        this.tiempo = tiempo;
    }
}
function Persona(nombre, apellido, altura) {
  this.nombre = nombre;
  this.apellido = apellido;
  this.altura = altura;
}

Persona.prototype.saludar = function () {
  console.log(`Hola me llamo ${this.nombre} ${this.apellido}`);
};

Persona.prototype.soyAlto = function () {
  return this.altura > 1.8;
};

var jean = new Persona("Jean", "Zambrano", 1.72);
var erika = new Persona("Erika", "Luna", 1.65);
var arturo = new Persona("Arturo", "Martinez", 1.89);

// En arrow function el this hace referencia a lo que esta fuera del prototipo, es decir, 
// al objeto window
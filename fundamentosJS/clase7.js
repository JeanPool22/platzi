var jean = {
  nombre: "Jean",
  apellido: "Zambrano",
  edad: 22,
};

var dario = {
  nombre: "Dario",
  apellido: "Gomez",
  edad: 28,
};

function imprimirNombreEnMayusculas(persona) {
  // var nombre = persona.nombre
  var { nombre } = persona;
  console.log(nombre.toUpperCase());
}

imprimirNombreEnMayusculas(jean);
imprimirNombreEnMayusculas(dario);
// imprimirNombreEnMayusculas({ nombre: "Pepito" });
// imprimirNombreEnMayusculas({ apellido: "Gomez" });

function imprimirNombreYEdad(persona) {
  var { nombre, edad } = persona;
  var one = `Hola, me llamo ${nombre} y tengo ${edad} años`;
  console.log(one);
}

imprimirNombreYEdad(jean);
imprimirNombreYEdad(dario);

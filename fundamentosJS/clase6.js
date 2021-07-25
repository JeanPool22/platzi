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

function imprimirNombreEnMayusculas({ nombre }) {
  console.log(nombre.toUpperCase());
}

imprimirNombreEnMayusculas(jean);
imprimirNombreEnMayusculas(dario);
// imprimirNombreEnMayusculas({ nombre: "Pepito" });
imprimirNombreEnMayusculas({ apellido: "Gomez"});

var jean = {
  nombre: "Jean",
  apllido: "Zambrano",
  edad: 22,
  ingeniero: true,
  cocinero: false,
  cantante: false,
  dj: false,
  guitarrista: false,
  drone: true,
};

var juan = {
  nombre: "Juan",
  apellido: "Vega",
  edad: 13,
};

function imprimirProfesiones(persona) {
  console.log(`${persona.nombre} es: `);
  if (persona.ingeniero) {
    console.log("Ingeniero");
  }
  if (persona.cocinero) {
    console.log("Cocinero");
  }
  if (persona.cantante) {
    console.log("Cantante");
  }
  if (persona.dj) {
    console.log("Dj");
  }
  if (persona.guitarrista) {
    console.log("Guitarrista");
  }
  if (persona.drone) {
    console.log("Piloto drone");
  }
}

const MAYORIA_DE_EDAD = 18;

// const esMayorDeEdad = (persona) => {
//   return persona.edad >= MAYORIA_DE_EDAD;
// };

// const esMayorDeEdad = persona => persona.edad >= MAYORIA_DE_EDAD;

const esMayorDeEdad = ({ edad }) => edad >= MAYORIA_DE_EDAD;

// const esMayorDeEdad = function (persona) {
//   return persona.edad >= MAYORIA_DE_EDAD;
// };

// function esMayorDeEdad(persona) {
//   return persona.edad >= MAYORIA_DE_EDAD;
// }

function imprimirSiEsMayorDeEdad(persona) {
  if (esMayorDeEdad(persona)) {
    console.log(persona.nombre + " es mayor de edad");
  } else {
    console.log(`${persona.nombre} es menor de edad`);
  }
}

function permitirAcceso(persona) {
  if (!esMayorDeEdad(persona)) console.log("Acceso denegado");
}

imprimirProfesiones(jean);
imprimirSiEsMayorDeEdad(jean);

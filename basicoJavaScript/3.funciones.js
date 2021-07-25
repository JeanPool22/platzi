// Declarativas

function miFuncion() {
  return 3;
}

miFuncion();

// Expresión

var miFuncion = function (a, b) {
  return a + b;
};

miFuncion();

/* ============================= */

function saludarEstudiante(estudiante) {
  console.log(`Hola ${estudiante}`); // template strings (Plantillas de cadena de texto)
}

function suma(a, b) {
  // está funcion recibe 2 parámetros, que se convierten en un placeholder de valores que se pueden utilizar dentro de la función.
  var resultado = a + b;
}

// Return, cómo regresamos un valor con una function.

function suma(a, b) {
  var resultado = a + b;
  return resultado;
}

function suma(a, b) {
  return a + b;
}

suma(20, 30);

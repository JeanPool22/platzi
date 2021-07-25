var jean = {
  nombre: "Jean",
  apellido: "Zambrano",
  edad: 22,
  peso: 60,
};

console.log(`Al inicio del año ${jean.nombre} pesaba ${jean.peso}kg`);

const INCREMENTO_PESO = 0.3;

const aumentarPeso = (persona) => (persona.peso += INCREMENTO_PESO);
const adelgazar = (persona) => (persona.peso -= INCREMENTO_PESO);
const comeMucho = () => Math.random() < 0.3;
const realizaDdeporte = () => Math.random() < 0.4;

const META = jean.peso - 3;
var dias = 0;

while (jean.peso > META) {
  if (comeMucho()) {
    aumentarPeso(jean);
  }
  if (realizaDdeporte()) {
    adelgazar(jean);
  }
  dias++;
}

console.log(`Pasaron ${dias} días hasta que ${jean.nombre} adelgazó 3kg`);

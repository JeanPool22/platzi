var jean = {
  nombre: "Jean",
  apellido: "Zambrano",
  edad: 22,
  peso: 60,
};

console.log(`Al inicio del año ${jean.nombre} pesaba ${jean.peso}kg`);

const INCREMENTO_PESO = 0.2;
const aumentarPeso = (persona) => (persona.peso += INCREMENTO_PESO);
const adelgazar = (persona) => (persona.peso -= INCREMENTO_PESO);

for (let i = 1; i <= 365; i++) {
  let random = Math.random();
  if (random < 0.25) {
    aumentarPeso(jean);
  } else if (random < 0.5) {
    adelgazar(jean);
  }
}

console.log(`Al final del año ${jean.nombre} pesaba ${jean.peso.toFixed(2)}kg`);

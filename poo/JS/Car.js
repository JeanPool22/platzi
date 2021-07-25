// function Car(license, driver) {
//   this.id;
//   this.license = license;
//   this.driver = driver;
//   this.passenger;
// }

// Car.prototype.printDateCar = function () {
//   console.log(this.driver);
//   console.log(this.driver.name);
//   console.log(this.driver.document);
// };

class Car {
  constructor(license, driver) {
    this.id;
    this.license = license;
    this.driver = driver;
    this.passenger;
  }

  printDateCar() {
    console.log(this.driver);
    console.log(this.driver.name);
    console.log(this.driver.document);
  }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        UberX uberx = new UberX("AMQ123", new Account("Andrés Herrera", "ANS123"), "Chevrolet", "sonic");
        uberx.setPassenger(2);
        uberx.printDataCar();

        // Car car2 = new Car("QWE564", new Account("Andrea Herrera", "ANS879"));
        // car2.passegenger = 3;
        // car2.printDataCar();
    }
}
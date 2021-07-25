public class ifStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnable = false;
        int fileSended = 3;

        if (isBluetoothEnable) {
            // Send file
            fileSended++;
            System.out.println("Archivo enviado");
            int i = 0;
            i++;
        } else {
            fileSended--;
            System.out.println("Por favor enciende tu bluetooth");
        }

        System.out.println(isBluetoothEnable);
        System.out.println(fileSended);
    }
}

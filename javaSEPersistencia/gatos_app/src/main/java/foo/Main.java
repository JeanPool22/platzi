package foo;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception{
        int opcionMenu = -1;
        String[] botones = { "1. Ver gatos", "2. Salir" };

        do {
            String opcion = (String) JOptionPane.showInputDialog(null, "Gatitos Java", "Menu Principal",
                    JOptionPane.INFORMATION_MESSAGE, null, botones, botones[0]);

            // Se valida que opción selecciona el usuario
            for (int i = 0; i < botones.length; i++) {
                if (opcion.equals(botones[i])) {
                    opcionMenu = i;
                }
            }

            switch (opcionMenu) {
            case 0:

                break;
            default:
                break;
            }
        } while (opcionMenu != 1);
    }
}

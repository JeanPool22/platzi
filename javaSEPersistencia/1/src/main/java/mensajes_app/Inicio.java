package mensajes_app;

import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int option = 0;

        do {
            System.out.println("---------------------");
            System.out.println(" Aplicación de mensajes ");
            System.out.println(" 1. Crear mensaje");
            System.out.println(" 2. Listar mensaje");
            System.out.println(" 3. Eliminar mensaje");
            System.out.println(" 4. Editar mensaje");
            System.out.println(" 5. Salir");
            // leemos la opción del usuario
            option = Integer.valueOf(sc.nextLine());

            switch (option) {
            case 1:
                MensajeService.crearMensaje();
                break;
            case 2:
                MensajeService.listarMensajes();
                break;
            case 3:
                MensajeService.borrarMensaje();
                break;
            case 4:
                MensajeService.editarMensaje();
                break;
            default:
                break;
            }
        } while (option != 5);
    }
}

package mensajes_app;

import java.util.Scanner;

public class MensajeService {

    public static void crearMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el mensaje: ");
        String mensaje = sc.nextLine();

        System.out.println("Digite el nombre del autor del mensaje: ");
        String nombre = sc.nextLine();

        Mensaje registro = new Mensaje();
        registro.setMensaje(mensaje);
        registro.setAutorMensaje(nombre);
        MensajeDAO.crearMensajeDB(registro);
    }

    public static void listarMensajes() {
        MensajeDAO.leerMensajesDB();
    }

    public static void borrarMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique el ID del mensaje a borrar: ");
        int id_mensaje = Integer.valueOf(sc.nextLine());
        MensajeDAO.borrarMensajeDB(id_mensaje);
    }

    public static void editarMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el nuevo mensaje: ");
        String mensaje = sc.nextLine();

        System.out.println("Digite el ID del mensaje que desea actualizar: ");
        int id_mensaje = Integer.valueOf(sc.nextLine());

        Mensaje actualizacion = new Mensaje();
        actualizacion.setIdMensaje(id_mensaje);
        actualizacion.setMensaje(mensaje);
        
        MensajeDAO.actualizarMesajeDB(actualizacion);
    }
}

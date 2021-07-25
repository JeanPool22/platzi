package mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MensajeDAO {

    public static void crearMensajeDB(Mensaje mensaje) {
        Conection dbConection = new Conection();

        try (Connection conection = dbConection.get_connection()) {
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO mensajes (mensaje, autor_mensaje) VALUES (?, ?)";
                ps = conection.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2, mensaje.getAutorMensaje());
                ps.executeUpdate();
                System.out.println("Mensaje creado correctamente");
            } catch (SQLException e) {
                System.out.println(e);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void leerMensajesDB() {
        Conection dbConection = new Conection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try (Connection conection = dbConection.get_connection()) {
            String query = "SELECT * FROM mensajes";
            ps = conection.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id_mensaje"));
                System.out.println("Mensaje: " + rs.getString("mensaje"));
                System.out.println("Autor: " + rs.getString("autor_mensaje"));
                System.out.println("Fecha: " + rs.getString("fecha_mensaje"));
                System.out.println();
            }

        } catch (SQLException e) {
            System.out.println("No se obtuvieron los mensajes");
            System.out.println(e);
        }
    }

    public static void borrarMensajeDB(int idMensaje) {
        Conection dbConection = new Conection();

        try (Connection conection = dbConection.get_connection()) {
            PreparedStatement ps = null;
            try {
                String query = "DELETE FROM mensajes WHERE id_mensaje = ?";
                ps = conection.prepareStatement(query);
                ps.setInt(1, idMensaje);
                ps.executeUpdate();
                System.out.println("El mensaje ha sido borrado");
            } catch (SQLException e) {
                System.out.println("No se pudo borrar el mensaje");
                System.out.println(e);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void actualizarMesajeDB(Mensaje mensaje) {
        Conection dbConection = new Conection();

        try (Connection conection = dbConection.get_connection()) {
            PreparedStatement ps = null;
            try {
                String query = "UPDATE mensajes SET mensaje = ? WHERE id_mensaje = ?";
                ps = conection.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setInt(2, mensaje.getIdMensaje());
                ps.executeUpdate();
                System.out.println("El mensaje se actualizó correctamente");
            } catch (SQLException e) {
                System.out.println("No es posible hacer la actualización");
                System.out.println(e);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}

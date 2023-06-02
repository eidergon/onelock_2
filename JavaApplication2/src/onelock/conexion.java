package onelock;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

public class conexion {

    static String[][] listaUsuarios;

    public static void conectarse() {
        int contadorBucle = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {

            /*
             * String url = "jdbc:mysql://10.206.69.198:12125/secur";
             * String username = "mysqldb";
             * String password = "0n3C0nt4ct*0511";
             * 
             */
            String url = "jdbc:mysql://localhost:3306/secur";
            String username = "root";
            String password = "admin";

            Connection conn = (Connection) DriverManager.getConnection(url, username, password);

            try {
                // Crear la declaración
                Statement declaracion = conn.createStatement();
                Statement declaracion2 = conn.createStatement();

                // Definir la consulta SQL
                String consulta = "SELECT * FROM login";

                // Ejecutar la consulta y obtener el resultado
                ResultSet resultadoConsulta = declaracion.executeQuery(consulta);
                ResultSet resultadoConsulta2 = declaracion2.executeQuery(consulta);

                //listaUsuarios = String[resultadoConsulta.size()][2];
                //here
                while (resultadoConsulta.next()) {
                    contadorBucle++;
                }

                listaUsuarios = new String[contadorBucle][2];

                System.out.println(listaUsuarios.length);
                while (resultadoConsulta2.next()) {
                    String usuario = resultadoConsulta2.getString("usuario");
                    String contrasena = resultadoConsulta2.getString("contrasena");
                    listaUsuarios[resultadoConsulta2.getRow() - 1][0] = usuario; //length lista usuarios
                    listaUsuarios[resultadoConsulta2.getRow() - 1][1] = contrasena;
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        /*finally {
            // Close the connection in the finally block
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } */
    }

    public static String[][] getListaUsuarios() {
        return listaUsuarios;
    }

    public static void main(String[] args) throws Exception {
    }

}

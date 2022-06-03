package casellesrodriguez.jannay.pruebajavafxx;

import java.sql.*;

public class DDBB {

    //Creamos variable de tipo Conection
    private static Connection c;

    private static Statement query;

    //Creamos variables para escribir ruta bdd, usuario y pass
    private static String url ="jdbc:postgresql://localhost:5432/trivia";
    private static String user = "postgres";
    private static String pass = "123456";


    public void conectar () {
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(url, user,pass);
            System.out.println("Conexion existosa");
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println("No se puedo conectar correctamente");
        }
        finally {
            try {
                c.close();
                System.out.println("Conexion cerrada con exito");
            }
            catch (Exception e) {
                System.err.println(e.getMessage());
                System.out.println("No se ha podido cerrar la conexion");
            }
        }
    }


    public void insertar_preguntas (String name, String last_name, int phone) {
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(url, user, pass);
            query = c.createStatement();
            String sql = "INSERT INTO users (name,lastname, phone) values ('" + name + "', '" + last_name + "', '" + phone + "')";
            System.out.println("El registro se guardó correctamente");
            ResultSet result = query.executeQuery(sql);
            result.next();


        } catch (SQLException e) {
            System.err.print(e.getMessage());
            System.err.print("El registro no se guardó");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                c.close();
            } catch (SQLException e) {
                System.err.println("No se ha podido cerrar la conexion");
            }
        }
    }
}

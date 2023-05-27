import java.sql.DriverManager;

public class Koneksi {
    public static java.sql.Connection koneksi;
    
    public static java.sql.Connection getKoneksi() {
        if(koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/waterpark";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Connection Succesfully");
                
            } catch (Exception e) {
                System.out.println("Error" + e);
            }
        }
        return koneksi;
    }
    
    public static void main(String[] args) {
        getKoneksi();
    }
}

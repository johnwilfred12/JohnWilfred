package StudentProfileDetails;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

public Connection connection;

    public void databaseConnection(){
        try{
            if (connection == null || connection.isClosed()){
                String databaseDriver = "com.mysql.jdbc.Driver";
                String connectionURL = "jdbc:mysql://localhost:3306/student profile";
                String databaseUsername = "root";
                String databasePassword ="";

                Class.forName(databaseDriver);
                connection = (Connection) DriverManager.getConnection(connectionURL, databaseUsername, databasePassword);

            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}

package StudentProfileDetails;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.plaf.ComboBoxUI;


public class Student {

    private static int id;
    private static String username;
    private static String password;
    private static String firstname;
    private static String lastname;
    private static int age;
    private static boolean gender;
    private static String address;
    private static String email;
    private static String mobile;
    private static String mobile2;
    private static boolean deleted;
    private static Vector data;

    /**
     * @return the data
     */
    public static Vector getData() {
        return data;
    }

    /**
     * @param aData the data to set
     */
    public static void setData(Vector aData) {
        data = aData;
    }

    /**
     * @return the deleted
     */
    public static boolean isDeleted() {
        return deleted;
    }

    /**
     * @param aDeleted the deleted to set
     */
    public static void setDeleted(boolean aDeleted) {
        deleted = aDeleted;
    }

    /**
     * @return the mobile
     */
    public static String getMobile() {
        return mobile;
    }

    /**
     * @param aMobile the mobile to set
     */
    public static void setMobile(String aMobile) {
        mobile = aMobile;
    }

    /**
     * @return the username
     */
    public static String getUsername() {
        return username;
    }

    /**
     * @param aUsername the username to set
     */
    public static void setUsername(String aUsername) {
        username = aUsername;
    }

    /**
     * @return the firstname
     */
    public static String getFirstname() {
        return firstname;
    }

    /**
     * @param aFirstname the firstname to set
     */
    public static void setFirstname(String aFirstname) {
        firstname = aFirstname;
    }

    /**
     * @return the lastname
     */
    public static String getLastname() {
        return lastname;
    }

    /**
     * @param aLastname the lastname to set
     */
    public static void setLastname(String aLastname) {
        lastname = aLastname;
    }


    private DBConnection dBConnection = new DBConnection();


    public static int getId() {
        return id;
    }

    public static void setId(int aId) {
        id = aId;
    }

    

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String aPassword) {
        password = aPassword;
    }

  
   

    /**
     * @return the age
     */
    public static int getAge() {
        return age;
    }

    /**
     * @param aAge the age to set
     */
    public static void setAge(int aAge) {
        age = aAge;
    }

    /**
     * @return the gender
     */
    public static boolean getGender() {
        return gender;
    }

    /**
     * @param aGender the gender to set
     */
    public static void setGender(boolean aGender) {
        gender = aGender;
    }

    /**
     * @return the address
     */
    public static String getAddress() {
        return address;
    }

    /**
     * @param aAddress the address to set
     */
    public static void setAddress(String aAddress) {
        address = aAddress;
    }

    /**
     * @return the email
     */
    public static String getEmail() {
        return email;
    }

    /**
     * @param aEmail the email to set
     */
    public static void setEmail(String aEmail) {
        email = aEmail;
    }

    /**
     * @return the mobile1
     */
  

    /**
     * @param aMobile1 the mobile1 to set
     */
   
    /**
     * @return the mobile2
     */
    public static String getMobile2() {
        return mobile2;
    }

    /**
     * @param aMobile2 the mobile2 to set
     */
    public static void setMobile2(String aMobile2) {
        mobile2 = aMobile2;
    }






public void select() {
    try {
       setData(new Vector());
       getData().setSize(0);
          //  Vector row = new Vector();
          //  row.setSize(0);
            dBConnection.databaseConnection();

            PreparedStatement preparedStatement = dBConnection.connection.prepareStatement("select id, username,password, firstname, lastname, age, gender,address, email, mobile from student");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String userName = resultSet.getString("userName");
                String password = resultSet.getString("password");
                String firstName = resultSet.getString("firstName"); //id userName password firstName lastName age gender address email mobile1 mobile2
                String lastName = resultSet.getString("lastName");
                int age = resultSet.getInt("age");
                boolean gender = resultSet.getBoolean("gender");
                String address = resultSet.getString("address");
                String email = resultSet.getString("email");
                String mobile1 = resultSet.getString("mobile");
              


                Vector column = new Vector();
                column.add(id);
                column.add(userName);
                column.add(password);
                column.add(firstName);
                column.add(lastName);
                column.add(age);
                column.add(gender);
                column.add(address);
                column.add(email);
                column.add(mobile1);
           

                getData().add(column);
            }
            resultSet.close();
            preparedStatement.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
}

    public void add() {
        try {
            dBConnection.databaseConnection();

            PreparedStatement preparedStatement = dBConnection.connection.prepareStatement("insert into student "
                    + "(id, userName, password, firstname, lastname, age, gender, address, email, mobile) values (?,?,?,?,?,?,?,?,?,?)");



             preparedStatement.setInt(1, getId());
            preparedStatement.setString(2, getUsername());
            preparedStatement.setString(3, getPassword());
            preparedStatement.setString(4, getFirstname());
            preparedStatement.setString(5, getLastname());
            preparedStatement.setInt(6, getAge());
            preparedStatement.setBoolean (7, getGender());
            preparedStatement.setString(8, getAddress());
            preparedStatement.setString(9, getEmail());
            preparedStatement.setString(10, getMobile());
            
          
             preparedStatement.execute();
             preparedStatement.close();

        } catch (Exception e) {

           JOptionPane.showMessageDialog(null,e);
        }
}    public void update() {
        try {
            dBConnection.databaseConnection();
            PreparedStatement statement = dBConnection.connection.prepareStatement("update student set "
                    + "userName=?, password=?, firstName=?, lastName=?, age=?, gender=?, address=?, email=?, mobile=? where id = ?");
            statement.setString(1, getUsername());
            statement.setString(2, getPassword());
            statement.setString(3, getFirstname());
            statement.setString(4, getLastname());
            statement.setInt(5,getAge());
            statement.setBoolean(6, getGender());
            statement.setString(7, getAddress());
            statement.setString(8, getEmail());
            statement.setString(9, getMobile());
          
            statement.setInt(10, getId());
            statement.execute();
            statement.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
public void updateDelete(){
        try {
            dBConnection.databaseConnection();
            PreparedStatement statement = dBConnection.connection.prepareStatement("delete * from student WHERE id=?");

            statement.setInt(1, getId());

            statement.execute();
            statement.close();
        System.out.println();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}



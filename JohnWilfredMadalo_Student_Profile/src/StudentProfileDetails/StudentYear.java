package StudentProfileDetails;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;




public class StudentYear {

    private static int id;
    private static String studentYear;
    private static String studentDescription;
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

    private DBConnection connection = new DBConnection();

    public static int getId() {
        return id;
    }


    public static void setId(int aId) {
        id = aId;
    }


    public static String getStudentYear() {
        return studentYear;
    }


    public static void setStudentYear(String aStudentYear) {
        studentYear = aStudentYear;
    }


    public static String getStudentDescription() {
        return studentDescription;
    }


    public static void setStudentDescription(String aStudentDescription) {
        studentDescription = aStudentDescription;



}public void select(){
        try {
            setData(new Vector());
            getData().setSize(0);
            //Vector vector = new Vector();
           // vector.setSize(0);
            connection.databaseConnection();
            PreparedStatement preparedStatement = connection.connection.prepareStatement("SELECT id, name, description FROM student_year;");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String studentYear = resultSet.getString("name");
                String studentDescription = resultSet.getString("description");



                Vector column = new Vector();
                column.add(id);
                column.add(studentYear);
                column.add(studentDescription);

                getData().add(column);
            }
            resultSet.close();
            preparedStatement.close();

           // for (int i = 0; i < vector.size(); i++){
            //    System.out.println(vector.get(i));
      //  }

        } catch (Exception e) {
            e.printStackTrace();

          }}
    public void add(){
        try {
           connection.databaseConnection();
                   PreparedStatement preparedStatement = connection.connection.prepareStatement("INSERT INTO student_year(name,description)"
                           + "VALUES(?,?)");

            preparedStatement.setString(1, getStudentYear());
            preparedStatement.setString(2, getStudentDescription());
            preparedStatement.execute();
            preparedStatement.close();

        } catch (Exception e) {
            e.printStackTrace();
       }
        }
        public void update() {
        try {
            connection.databaseConnection();
            PreparedStatement statement = connection.connection.prepareStatement("update student_year set name=?, description=? where id =? ");


            statement.setString(1, getStudentYear());
            statement.setString(2, getStudentDescription());
            statement.setInt(3, getId());
            statement.execute();
            statement.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
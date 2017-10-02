package src.org.thecodevillage.intro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**allows us to connect to database
 * Created by HILDA on 9/30/2017.
 *
 */
public class MyDbConn {

    String str;

    public static void main(String[] args) {
        try {
            Connection con = getDbConnection("jdbc:mysql://localhost:3306/student_db", "root", "");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from tbl_students");

            while (rs.next())
                System.out.println(rs.getInt("adm_no") + " " + rs.getString("name"));
            con.close();
        } catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }



        public static Connection getDbConnection (String url, String username, String password){

            Connection con = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url, username, password);

            } catch (Exception e) {
                System.out.println(e);
                e.printStackTrace();
            }

            return con;
        }

       public String sqlInsert(){

            String str;

           str = "INSERT INTO tbl_students(adm_no,name,course,school,php_marks,java_marks,python_marks)"+"value(4,Joyce,history,history,60,50,90)";

            return;

       }
}


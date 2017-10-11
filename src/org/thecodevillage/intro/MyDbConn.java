package src.org.thecodevillage.intro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**allows us to connect to database
 * Created by HILDA on 9/30/2017.
 *
 */
public class MyDbConn {

    String str;

    String str1;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Enter name of student");
        student.setName(scanner.next());
        //String name = scanner.setName();

        System.out.println("Enter name of course");
        student.setCourse(scanner.next());

        System.out.println("Enter name of school");
        student.setSchool(scanner.next());

        System.out.println("Enter php marks");
        student.setPhpMarks(scanner.nextInt());

        System.out.println("Enter java marks");
        student.setJavaMarks(scanner.nextInt());

        System.out.println("Enter python marks");
        student.setPythonMarks(scanner.nextInt());

        System.out.println("Enter age of student");
        student.setAge(scanner.next());

        //student.getName();

        System.out.println(sqlInsert(student));

        System.out.println(sqlDelete());

        System.out.println(sqlUpdate());

        //System.out.println( List<Student> getMyList());
        ArrayList<Student> myList = new ArrayList<>();
        System.out.println (myList);


        try {
            Connection con = getDbConnection("jdbc:mysql://localhost:3306/student_db", "root", "");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from tbl_students");

            while (rs.next())
                System.out.println(rs.getInt("adm_no") + " " + rs.getString("name"));
            //System.out.println(rs.getFetchSize());

            con.close();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }


    public static Connection getDbConnection(String url, String username, String password) {

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

    public static int sqlInsert(Student student) {
        String str;
        str = "INSERT INTO tbl_students(name,course,school,php_marks,java_marks,python_marks,date_of_birth) values('" + student.getName() + "','" + student.getCourse() + "','" + student.getSchool() + "','" + student.getPhpMarks() + "','" + student.getJavaMarks() + "','" + student.getPythonMarks() + "','" + student.getAge() + "')";
        int result = 0;
        try {
            Connection con = getDbConnection("jdbc:mysql://localhost:3306/student_db", "root", "");
            Statement stmt = con.createStatement();
            result = stmt.executeUpdate(str);
            con.close();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
        return result;
    }

    public static int sqlDelete() {

        String str1;

        str1 = "DELETE FROM tbl_students where adm_no=1;";

        int result1 = 0;

        try {
            Connection con = getDbConnection("jdbc:mysql://localhost:3306/student_db", "root", "");
            Statement stmt = con.createStatement();
            result1 = stmt.executeUpdate(str1);
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }

        return result1;

    }

    public static int sqlUpdate() {
        String str2;

        str2 = "UPDATE tbl_students set name = 'joy' where adm_no = 3 ";

        int result2 = 0;

        try {
            Connection con = getDbConnection("jdbc:mysql://localhost:3306/student_db", "root", "");
            Statement stmt = con.createStatement();
            result2 = stmt.executeUpdate(str2);
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }

        return result2;
    }

    // list of students
    public static List<Student> getMyList() {
        ArrayList<Student> myList = new ArrayList<>();
        try {
            Connection con = getDbConnection("jdbc:mysql://localhost:3306/student_db", "root", "");

            Statement stmt = con.createStatement();
            ResultSet rss = stmt.executeQuery("select * from tbl_students");

            while (rss.next())
                System.out.println(rss.getInt("adm_no") + rss.getString("name") + rss.getString("course") + rss.getString("school") + rss.getString("php_marks") + rss.getString("java_marks") + rss.getString("python_marks") + rss.getString("date_of_birth"));
            //System.out.println(rs.getFetchSize());,school,php_marks,java_marks,python_marks,date_of_birth
            con.close();

            Student student = new Student();
            student.setName(rss.getString("name"));
            student.setName(rss.getString("course"));
            student.setName(rss.getString("school"));
            student.setName(rss.getString("php_marks"));
            student.setName(rss.getString("java_marks"));
            student.setName(rss.getString("python_marks"));
            student.setName(rss.getString("date_of_birth"));

            myList.add(student);

        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();

        }
return myList;
    }
}




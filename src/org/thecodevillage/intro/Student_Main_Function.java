package src.org.thecodevillage.intro;

import javafx.scene.input.InputMethodTextRun;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by HILDA on 9/27/2017.
 */
public class Student_Main_Function {

    public static void main(String [] args){

       // List<Student> student = new ArrayList<Student>();

        Scanner scann = new Scanner(System.in);

       Student st = new Student();

        //System.out.println("Enter no of students");
       // scann.nextInt();

        //noOfStudents;

        System.out.println("Enter name of student");
        st.setName(scann.next());

               // st.setName(scann.next());



        System.out.println("Enter student marks");
       //int markOfStudent= scann.nextInt();
       st.setMarks(scann.nextInt());


        System.out.println("Students name is:"+st.getName()+"\t\t\t"+"and mark is:"+st.getMarks());

        List<Student> student = new ArrayList<Student>();

        int noOfStudents=0;

        for (int i = 0; i < noOfStudents; i++) {

              Student student1=new Student();

           System.out.println("Enter no of students");
            scann.nextInt();

            student1.setName(scann.next());

            student1.setMarks(scann.nextInt());

              student.add(student1);
        }
       System.out.println (student.size());

               }
    }

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

        List<Student> students = new ArrayList<Student>();

        Scanner scann = new Scanner(System.in);

       //StudentMain st = new StudentMain();
        //int noOfStudents = 0;
        System.out.println("Enter no of students");
        int noOfStudents = scann.nextInt();

        System.out.println("Enter name of students");
        String studentName = scann.next();

        System.out.println("Enter student marks");
       int markOfStudent = scann.nextInt();

        String grade = "";

        if (  markOfStudent>= 80 && markOfStudent <=100)
        {
            grade ="A";
            //System.out.println("grade is A");
        }

        if (markOfStudent >= 60 && markOfStudent <80)
        {
            System.out.println("B");
            grade ="B";
        }
        if (markOfStudent >= 40 && markOfStudent <60)
        {
            System.out.println("c");
        }
        if (markOfStudent <=0 && markOfStudent >40)
        {
            System.out.println("D");
        }
        else if(markOfStudent < 0 && markOfStudent >100 )
        {
            System.out.println("enter valid mark");
        }

        System.out.println("Students name is:"+studentName+"\t\t\t"+"and mark is:"+markOfStudent);

        for (int i = 0; i < noOfStudents; i++) {
               StudentMain student=new StudentMain();

            //student.setName("");

               scann.next();

               students.add(scann.next());
        }
        System.out.println (students.size());

               }
    }

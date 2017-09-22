package src.org.thecodevillage.intro;

import java.util.Scanner;

/**
 * Created by HILDA on 9/20/2017.
 */
public class StudentMain {

    public static void main(String[] args){

        Scanner scann = new Scanner(System.in);

        Student p1 = new Student();
        //Student p2 = new Student();

        System.out.println("enter student name:");

        p1.setName(scann.next());


        System.out.println("enter course name");
        p1.setCourse(scann.next());

        System.out.println("Enter school name");
        p1.setSchool(scann.next());

        System.out.println("Enter reg number");
        p1.setRegno(scann.next());

        System.out.println("Enter php mark");
        p1.setPhpMarks(scann.nextInt());

        System.out.println("Enter java marks");
        p1.setJavaMarks(scann.nextInt());

        System.out.println("Enter python marks ");
        p1.setPythonMarks(scann.nextInt());


        System.out.println("Name"+p1.getName());

        System.out.println("course"+p1.getCourse());

        System.out.println("School"+p1.getSchool());

        System.out.println("School"+p1.getRegno());

        System.out.println("php marks"+p1.getPhpMarks());

        System.out.println("java marks"+p1.getJavaMarks());

        System.out.println("Python marks"+p1.getPythonMarks());

        int totalmarks=StudentFunction.add(p1.getPhpMarks(),p1.getJavaMarks(),p1.getPythonMarks());

        //p1.setMarks(tmarks);
        p1.setTotalmark(totalmarks);

       System.out.println("total is " + totalmarks);



        int average = StudentFunction.divide(p1.getPhpMarks(),p1.getJavaMarks(),p1.getPythonMarks());

        p1.setAverageMark(average);
        System.out.println("average is" + average);

         char grad = 'A';
         if ( average >= 80 && average <=100)
         {
         System.out.println("grade is A");
         }

         if (average >= 60 && average <80)
         {
         System.out.println("B");
         }
         if (average >= 40 && average <60)
         {
         System.out.println("c");
         }
         if (average <=0 && average >40)
         {
         System.out.println("D");
         }
         else if(average < 0 && average >100 )
         {
         System.out.println("enter valid mark");
         }


    }
}

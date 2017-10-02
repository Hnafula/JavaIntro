package src.org.thecodevillage.intro;

import src.org.thecodevillage.common.StudentFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by HILDA on 9/20/2017.
 */
public class StudentMain {

    public static void main(String[] args){

        Scanner scann = new Scanner(System.in);

        Student p1 = new Student();
        Student p2 = new Student();
        Student p3 = new Student();

        System.out.println("enter student name:");

        p1.setName(scann.next());
        p2.setName(scann.next());
        p3.setName(scann.next());
        System.out.println("\n");

       System.out.println("enter course name");
        p1.setCourse(scann.next());
        p2.setCourse(scann.next());
        p3.setCourse(scann.next());
        System.out.println("\n");


        System.out.println("Enter school name");
        p1.setSchool(scann.next());
        p2.setSchool(scann.next());
        p3.setSchool(scann.next());
        System.out.println("\n");

        System.out.println("Enter reg number");
        p1.setRegno(scann.next());
        p2.setRegno(scann.next());
        p3.setRegno(scann.next());
        System.out.println("\n");

        System.out.println("Enter php mark");
        p1.setPhpMarks(scann.nextInt());
        p2.setPhpMarks(scann.nextInt());
        p3.setPhpMarks(scann.nextInt());
        System.out.println("\n");

        System.out.println("Enter java marks");
        p1.setJavaMarks(scann.nextInt());
        p2.setJavaMarks(scann.nextInt());
        p3.setJavaMarks(scann.nextInt());
        System.out.println("\n");

        System.out.println("Enter python marks ");
        p1.setPythonMarks(scann.nextInt());
        p2.setPythonMarks(scann.nextInt());
        p3.setPythonMarks(scann.nextInt());
        System.out.println("\n");


        System.out.println("Name"+p1.getName());
        System.out.println("Name"+p2.getName());
        System.out.println("Name"+p3.getName());

        System.out.println("course"+p1.getCourse());
        System.out.println("course"+p2.getCourse());
        System.out.println("course"+p3.getCourse());

        System.out.println("School"+p1.getSchool());
        System.out.println("School"+p2.getSchool());
        System.out.println("School"+p3.getSchool());

        System.out.println("School"+p1.getRegno());
        System.out.println("School"+p2.getRegno());
        System.out.println("School"+p3.getRegno());

        System.out.println("php marks"+p1.getPhpMarks());
        System.out.println("php marks"+p2.getPhpMarks());
        System.out.println("php marks"+p3.getPhpMarks());

        System.out.println("java marks"+p1.getJavaMarks());
        System.out.println("java marks"+p2.getJavaMarks());
        System.out.println("java marks"+p3.getJavaMarks());

        System.out.println("Python marks"+p1.getPythonMarks());
        System.out.println("Python marks"+p2.getPythonMarks());
        System.out.println("Python marks"+p3.getPythonMarks());

        int totalmarksp1= StudentFunction.add(p1.getPhpMarks(),p1.getJavaMarks(),p1.getPythonMarks());
        int totalmarksp2=StudentFunction.add(p2.getPhpMarks(),p2.getJavaMarks(),p2.getPythonMarks());
        int totalmarksp3=StudentFunction.add(p3.getPhpMarks(),p3.getJavaMarks(),p3.getPythonMarks());

        //p1.setMarks(tmarks);
        p1.setTotalmark(totalmarksp1);
        p2.setTotalmark(totalmarksp2);
        p3.setTotalmark(totalmarksp3);
        System.out.println("\n");

       System.out.println("total is " + totalmarksp1);
        System.out.println("total is " + totalmarksp2);
        System.out.println("total is " + totalmarksp3);



        int averagep1 = StudentFunction.divide(p1.getPhpMarks(),p1.getJavaMarks(),p1.getPythonMarks());
        int averagep2 = StudentFunction.divide(p2.getPhpMarks(),p2.getJavaMarks(),p3.getPythonMarks());
        int averagep3 = StudentFunction.divide(p3.getPhpMarks(),p3.getJavaMarks(),p3.getPythonMarks());

        p1.setAverageMark(averagep1);
        System.out.println("average is" + averagep1);

        p2.setAverageMark(averagep2);
        System.out.println("average is" + averagep2);

        p3.setAverageMark(averagep3);
        System.out.println("average is" + averagep3);

        List<Integer> myList = new ArrayList<>();
        myList.add(averagep1);
        myList.add(averagep2);
        myList.add(averagep3);

        for(int i=0; i < myList.size(); i++) {

            if (myList.get(i) >= 80 && myList.get(i)<=100 ) {
                System.out.println('A');
            }
            if (myList.get(i) >= 60 && myList.get(i)<80 ) {
                System.out.println('B');
            }
            if (myList.get(i) >= 50 && myList.get(i)<60 ) {
                System.out.println('C');
            }
            if (myList.get(i) >= 40 && myList.get(i)<50 ) {
                System.out.println('D');
            }
            if (myList.get(i) >= 0 && myList.get(i)<40 ) {
                System.out.println('E');
            }
        }

        int totalphpmarks = StudentFunction.add(p1.getPhpMarks(),p2.getPhpMarks(),p3.getPhpMarks());

        System.out.println("Total php marks is "+totalphpmarks);

        int averagephpmarks =StudentFunction.divide(p1.getPhpMarks(),p2.getPhpMarks(),p3.getPhpMarks());

        System.out.println("Average php marks is "+averagephpmarks);

        String gradephpmarks = StudentFunction.gradeMark(averagephpmarks);



    }



}

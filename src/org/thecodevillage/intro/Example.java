package src.org.thecodevillage.intro;

import src.org.thecodevillage.common.MyFunctions;

import java.util.Scanner;

public class Example{

public static void main(String[] args){


String str="one";

String srt1="two";

int x=5;
int y=10;




    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the first number");

    x=scanner.nextInt();

    System.out.println("enter the second number");

    y=scanner.nextInt();

x=y+x+5+7;

double m=0;

m=9.1;

double n=0;

n=5.2;

y--;

int sum=0;

sum =MyFunctions.add(x,y);

int mult=0;

int min=0;

int div=0;

int rem=0;

double divideDouble=0;

div = MyFunctions.division(x,y);

mult =MyFunctions.multiply(x,y);

min = MyFunctions.minus(x,y);

rem=MyFunctions.remainder(x,y);

divideDouble= MyFunctions.division(m,n);


System.out.println("we are learning java today");
System.out.println("sum##"+sum);

System.out.println("product is "+ mult);

System.out.println("The difference is "+ min);


System.out.println("The division is "+ div);

System.out.println("The remainder is "+ rem);

System.out.println("The double is "+ divideDouble);


    Car somecar = new Car();
    String name= "";
//    Scanner scanner = new Scanner(System.in);

    somecar.setName(scanner.next());



    System.out.println("enter number of wheels");
    somecar.setNoOfWheels(scanner.nextInt());

    System.out.println("car output");
    System.out.println("name"+somecar.getName());
    System.out.println("wheels"+somecar.getNoOfWheels());


}


    static class StudentFunction {

        private String studentname;

        private String studentschool;

        private String regno;

        private String course;

        private int marks;

        public String getStudentname() {
            return studentname;
        }

        public void setStudentname(String studentname) {
            this.studentname = studentname;
        }

        public String getStudentschool() {
            return studentschool;
        }

        public void setStudentschool(String studentschool) {
            this.studentschool = studentschool;
        }

        public String getRegno() {
            return regno;
        }

        public void setRegno(String regno) {
            this.regno = regno;
        }

        public String getCourse() {
            return course;
        }

        public void setCourse(String course) {
            this.course = course;
        }

        public int getMarks() {
            return marks;
        }

        public void setMarks(int marks) {
            this.marks = marks;
        }
    }
}
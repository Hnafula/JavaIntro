package src.org.thecodevillage.common;

/**
 * Created by HILDA on 9/20/2017.
 */
public class StudentFunction {

    public static int add(int a,int b,int c){
        return a+b+c;

    }

public static String gradeMark(int marks)

{

    String grade = "";

    if (  marks>= 80 && marks <=100)
    {
        grade ="A";
    //System.out.println("grade is A");
    }

    if (marks >= 60 && marks <80)
    {
    System.out.println("B");
        grade ="B";
    }
     if (marks >= 40 && marks <60)
     {
    System.out.println("c");
    }
    if (marks <=0 && marks >40)
    {
    System.out.println("D");
    }
     else if(marks < 0 && marks >100 )
    {
     System.out.println("enter valid mark");
    }

    return grade;
}
public static int divide(int a,int b, int c){

        return (a+b+c)/3;
}

}

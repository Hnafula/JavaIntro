package src.org.thecodevillage.common;

/**
 * Created by HILDA on 9/18/2017.
 */
public class MyFunctions {

    public static int add(int a,int b){
        return a+b;

    }

    public static int multiply(int a, int b){
        return (a*b);
    }

    public static int minus(int a, int b){
        return (a-b);

    }

    public static int division(int a, int b){

        return (a/b);
    }

    public static Double division(double a, double b){

        return (a/b);
    }

    public static  int remainder(int a, int b){

        return (a%b);
    }

    public static int calculateArea(int lenght, int width)
    {
        return lenght*width;
    }

    public static int calculatePerimeter(int lenght, int width)
    {
        return 2*(lenght+width);
    }
}

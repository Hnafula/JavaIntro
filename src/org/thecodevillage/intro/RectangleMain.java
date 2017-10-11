package src.org.thecodevillage.intro;

import src.org.thecodevillage.common.MyFunctions;
import src.org.thecodevillage.common.Rectangle;

import java.util.Scanner;

/**
 * Created by HILDA on 10/4/2017.
 */
public class RectangleMain {
   // static int lenght = 0;

    //static int width = 0;
   // static int area = 0;
    //static int perimeter = 0;

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
         int lenght = 0;

         int width = 0;
         int area = 0;
         int perimeter = 0;

        lenght = 20;
        width = 50;

        area = lenght*width;

        System.out.println(area);

        area = MyFunctions.calculateArea(lenght,width);

        perimeter = 2*(lenght+width);
        System.out.println(perimeter);

        perimeter= MyFunctions.calculatePerimeter(lenght,width);

        System.out.println("perimeter is "+perimeter);
        System.out.println("area is "+area);

        Rectangle object = new Rectangle(60,10);

        Rectangle object1 = new Rectangle();

        System.out.println("enter the length: ");
        object1.setLength(sc.nextInt());

        System.out.println("enter the width: ");
        object1.setWidth(sc.nextInt());

        area = object.getLength()*object.getWidth();

        System.out.println(area);

        area = object1.getLength()*object1.getWidth();

        System.out.println(area);

    }


}

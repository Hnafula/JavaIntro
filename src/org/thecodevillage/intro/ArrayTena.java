package src.org.thecodevillage.intro;

import src.org.thecodevillage.common.MyFunctions;
import src.org.thecodevillage.common.Rectangle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HILDA on 10/11/2017.
 */
public class ArrayTena {

    public static void main(String [] args){

        int[] myData = {23,4,5,5,5,5};

        int [] myDataIngine = new int[10];

        //list/ArrayList
        //

        List<String> kaList = new ArrayList<String>();

        kaList.add("Elkana");
        kaList.add("Elam");
        kaList.add("Eddy");
        kaList.add("Ezra");
        kaList.add("Eliud");

        for(int x=0; x<kaList.size(); x++)
        {
          String counter = kaList.get(x);
            System.out.println(counter);
        }

        List<Integer> intList = new ArrayList<Integer>();

        intList.add(10);
        intList.add(20);
        intList.add(30);
        intList.add(40);
        intList.add(50);

        List<Rectangle> rectangleList = new ArrayList<>();
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(5);
        rectangle.setWidth(6);
        rectangle.setArea(MyFunctions.calculateArea(rectangle.getLength(),rectangle.getWidth()));


        Rectangle rectangle1 = new Rectangle();
        rectangle1.setLength(10);
        rectangle1.setWidth(5);
        rectangle1.setArea(MyFunctions.calculateArea(rectangle1.getLength(),rectangle.getWidth()));

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setLength(20);
        rectangle2.setWidth(10);
        rectangle2.setArea(MyFunctions.calculateArea(rectangle2.getLength(),rectangle.getWidth()));




        rectangleList.add(rectangle);
        rectangleList.add(rectangle1);
        rectangleList.add(rectangle2);

        for(int i=0; i<rectangleList.size(); i++ )
        {
            System.out.println(rectangleList.get(i).getArea());

        }
        //System.out.println(rectangle.getArea());


    }
}

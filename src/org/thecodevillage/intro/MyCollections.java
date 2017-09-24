package src.org.thecodevillage.intro;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HILDA on 9/24/2017.
 */
public class MyCollections {
    //Hashmap
    //List
    //LinkedList
    //ArrayList
   static int marks[]=new int[10];

   static String Snames[] = new String[10];

    public static void main(String[] args) {

        marks[0] = 40;
        marks[1] = 60;
        marks[2] = 70;
        marks[3] = 90;
        marks[4] = 70;
        marks[5] = 61;
        marks[6] = 67;
        marks[7] = 45;
        marks[8] = 80;
        marks[9] = 60;

        Snames[0] = "Joan";
        Snames[2] = "Janet";
        Snames[3] = "John";
        Snames[4] = "Jacints";
        Snames[5] = "James";
        Snames[6] = "Joyce";
        Snames[7] = "Jacqueline";
        Snames[8] = "Jay";
        Snames[9] = "June";

        int sum = 0;

        int arrayLength = marks.length;

        System.out.println("$$ "+ arrayLength);

        System.out.println(marks[0]);

        System.out.println(Snames[9]);

        for (int count =0; count <marks.length; count++){

            System.out.println("Item "+count+"\t Value: "+marks[count]);

         //   sum = sum + marks[count];

            sum += marks[count];
            //System.out.println("sum "+ sum);

           // System.out.println(Snames[0]);
        }
        System.out.println("sum "+ sum+"\n\n\n");



        for (int i = 0; i<Snames.length ;i++)
        {
            System.out.println("Item "+i+"\t Value: "+Snames[i]);
        }

        //while loop
        System.out.println("sum "+ sum+"\n\n");

        int counter = 0;
        while (counter < marks.length){
            System.out.println("Marks "+marks[counter]);
            counter ++;
        }

        //do while
        System.out.println("sum "+ sum+"\n\n");
        int xx= 0;

        do{
            if(xx > marks.length)
                System.out.println("");

            else {
                System.out.println("Marks do while" + marks[xx]);
                xx++;
            }

        }while(xx<marks.length);
        System.out.println("\n");

//switch

        String grade ="A";

        switch (grade){
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Good");
                break;
            case "C":
                System.out.println("Fair");
                break;
            case "D":
                System.out.println("You can improve");
                break;

                default:
                    System.out.println("does not exist");

        }
        /**
         * List
        */
       List<Integer> myList = new ArrayList<>();
       myList.add(50);
       myList.add(60);
       myList.add(30);
       myList.add(40);
       myList.add(70);

         System.out.println("MyList "+myList.get(0));
        System.out.println("MyList "+myList.size());

        for(int ii=0; ii<myList.size(); ii++ )
        {
            System.out.println("Item "+ii+"\t Value: "+myList.get(ii));

            if(myList.get(ii)%2==0)

                System.out.println("Even number");
            else

                System.out.println("odd");
        }

        for(Integer item: myList){

            System.out.println(item);
        }


        System.out.println("\n\n");

        List<String> myStringList = new ArrayList<>();

        myStringList.add("Hilda");
        myStringList.add("Hellen");
        myStringList.add("Hadijah");
        myStringList.add("Hillary");
        myStringList.add("Hotensia");
        myStringList.add("Humfrey");

        System.out.println("myStringList "+myStringList.get(5));

        System.out.println("myStringList "+myStringList.size());

        for (int iii=0; iii<myStringList.size(); iii++)
        {
            System.out.println(myStringList.get(iii));
        }

        System.out.println("\n");
        Car toyota = new Car();
        toyota.setName("Ractis");
        toyota.setColor("Red");

        Car subaru = new Car();
        subaru.setName("Forester");
        subaru.setColor("Green");

        Car vits = new Car();
        vits.setName("vits");
        vits.setColor("White");

        List<Car> myCarList = new ArrayList<>();

        myCarList.add(toyota);
        myCarList.add(vits);
        myCarList.add(subaru);

        System.out.println(myCarList.get(0).getName());

        for(int j=0; j< myCarList.size(); j++){

            System.out.println(myCarList.get(j).getName()+"\t\t"+myCarList.get(j).getColor());
            //System.out.println("\t\t");

        }


    }
}
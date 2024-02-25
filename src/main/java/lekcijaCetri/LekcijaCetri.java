package lekcijaCetri;

import java.util.ArrayList;

public class LekcijaCetri {
    public static void main(String[] args) {
        //Masivs ar 3 elementiem
        String [] cars = {"VW","Audi","BMW"};
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);

        cars[0]="MAZDA";

        for (String car : cars) {
            System.out.println(car);
        }
        //array list ar 3 elementiem
        ArrayList<String> cars2 = new ArrayList<>();
        cars2.add("MERCEDES");
        cars2.add("HONDA");
        cars2.add("FORD");
        System.out.println(cars2.get(0));
        System.out.println(cars2.get(1));
        System.out.println(cars2.get(2));

        System.out.println("FOR CIKLS");
        for (int i = 0; i < cars2.size(); i++) {
            System.out.println(cars2.get(i));
        }

        System.out.println("FOR EACH CIKLS");
        for (String s : cars2) {
            System.out.println(s);
        }
        cars2.remove(0);
        System.out.println("FOR EACH CIKLS un remove");
        for (String s : cars2) {System.out.println(s);
        }

        cars2.set(0,"VOLVO");
        System.out.println("FOR EACH CIKLS un set");
        for (String s : cars2) {
            System.out.println(s);}

        cars2.get(1);

        System.out.println("VAI SARAKSTS SATUR VARDU FORD? " + cars2.contains("FORD"));
        System.out.println("VAI SARAKSTS SATUR VARDU PORSCHE? " + cars2.contains("PORCHE"));

    }
}

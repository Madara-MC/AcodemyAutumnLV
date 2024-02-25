package lekcijaDivi;

import java.util.Scanner;

public class Lekcija {
    public static void main(String[] args) {
//        System.out.println("Lekcija Nr.2");
//        //Lietotāja ievades apstrāde
//        Scanner skaneris = new Scanner(System.in);
//        System.out.println("Ievadi savu vārdu... ");
//        String name = skaneris.nextLine();
//        System.out.println("Labdien, " + name + "! Esiet sveicināts mūsu programmā");
//        System.out.println("Ievadi skaitli x... ");
//        int x = skaneris.nextInt();
//        System.out.println("Skaitlis x veiksmīgi saglabāts. Tas ir:" + x);
//
//        System.out.println("Ievadi skaitli y... ");
//        int y = skaneris.nextInt();
//        System.out.println("Skaitlis y veiksmīgi saglabāts. Tas ir:" + y);
//        System.out.println("X un Y summa ir: " + (x+y));
//        System.out.println("X un Y starpība ir: " + (x-y));

        int x = 5;
        int y = 3;
        int z = 3;
        System.out.println(" X Lielāks par Y: " + (x>y));
        System.out.println(" X Mazāks par Y: " + (x<y));
        System.out.println(" Y Vienāds ar Z: " + (y==z));
        System.out.println(" Y  nav Vienāds ar Z: " + (y!=z));
        System.out.println(" Y  ir lielāks, vienāds ar Z: " + (y>=z));
        System.out.println(" X  ir lielāks, vienāds ar Z: " + (x>=z));

        String name = "Juris";
        String name2 = "Pēteris";
        System.out.println(name.equals("Juris"));//true
        System.out.println(name.equals(name2));//false
        System.out.println(!name.equals(name2));//true

        int m = 9;
        System.out.println((m>=5)&&(m>7));



    }
}

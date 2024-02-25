package homework;

import java.util.Scanner;

public class SecondClass {
    public static void main(String[] args) {
        Scanner skaitlis1 = new Scanner(System.in);
        System.out.println("Ievadi veselu skaitli... ");
        int vesels = skaitlis1.nextInt();
        System.out.println("Skaitlis ir veiksmīgi saglabāts. Tas ir: " + vesels);
        if (vesels>0){
            System.out.println("Skaitlis ir LIELĀKS par 0!");
        } else if (vesels==0) {
            System.out.println("skaitlis ir VIENĀDS ar 0!");
        } else {
            System.out.println("skaitlis ir MAZĀKS par 0!");
        }

        System.out.println("Ievadi savu vecumu");
        Scanner vecums = new Scanner(System.in);
        int vecums1 = vecums.nextInt();
        if(vecums1>=18) {
            System.out.println("Apsveicu! Tu drīksti piedalīties vēlēšanās!");
        } else { System.out.println("Tu drīkstēsi piedalīties vēlēšanās pēc " + (18-vecums1) + " gadiem");
    }

        System.out.println("Ievadi skaitli no 1 - 7...");
        Scanner day = new Scanner(System.in);
        int diena = day.nextInt();
        switch (diena) {
            case 1: System.out.println("Pirmdiena");
                break;
            case 2: System.out.println("Otrdiena");
                break;
            case 3: System.out.println("Trešdiena");
                break;
            case 4: System.out.println("Ceturtdiena");
                break;
            case 5: System.out.println("Piektdiena");
                break;
            case 6: System.out.println("Sestdiena");
                break;
            case 7: System.out.println("Svētdiena");
                break;
            default:
                System.out.println("Neeksiste");
        }

        System.out.println("Ievadi jebkuru veselu skaitli... ");
        Scanner number = new Scanner(System.in);
        int cipars = number.nextInt();
        if (cipars%2==0){
            System.out.println("Šis ir pāra skaitlis");
        } else { System.out.println("Šis ir nepāra skaitlis!");
        }
        System.out.println("Lai jauka diena! :)");
    }
}

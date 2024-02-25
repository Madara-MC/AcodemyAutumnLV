package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello world. Madara.");
        String istaParole = "password123";
        System.out.println("Ievadi savu paroli...");
        Scanner scanner = new Scanner(System.in);
        String ievaditaParole = scanner.nextLine();

        if (ievaditaParole.equals(istaParole)) {
            //te izpildas, ja if ir true
            System.out.println("Parole ir pareiza! Apsveicu, esam ielogojusies");
        } else {
            System.out.println("Parole nepareiza. Pieeja liegta!!!!");
        }

        System.out.println("Programmas beigas");

    }

}
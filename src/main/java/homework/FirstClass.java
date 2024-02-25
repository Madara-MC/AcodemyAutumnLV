package homework;

public class FirstClass {
    public static void main(String[] args) {
        String valsts = "Jamaica";
        System.out.print("Country: ");
        System.out.println(valsts);

        int iedzivotaji = 2749000;
        System.out.print("Popolation: ");
        System.out.println(iedzivotaji);

        int platiba = 10991;
        System.out.print("Total area: ");
        System.out.println(platiba);

        String capital = "Kingston";
        System.out.print("Capital: ");
        System.out.println(capital);

        String language = "English";
        System.out.print("Official language: ");
        System.out.println(language);

        boolean EsUnion = false;
        System.out.print("EU member: ");
        System.out.println(EsUnion);

        char valuta = '$';
        System.out.print("Currency: ");
        System.out.println(valuta);

        System.out.println("\n" + "Jamaica is the third-largest island in the Caribbean. The first Caribbean country to launch a website."
                + "\n" + "It is home to 4 major mountain ranges. Jamaica actually sits on top of a large underwater mountain."
                + "\n" + "In Jamaica, they drive on the left side of the road. "
                + "\n" + "The flag’s three colours represent: difficulties, sunlight and agriculture." + "\n"
                + "It’s home to one of the largest butterflies in the world.");

        //Tris piemeri katram: saskaitishana, atnemsana, dalishana, reizinashana, atlikums
        int a = 20;
        int b = 5;
        int summa = a + b;
        int starpiba = a - b;
        int reizinajums = a * b;
        int dalijums = a / b;
        System.out.println("\n" + "A=20 un B=5");
        System.out.println("1) a + b = " + summa);
        System.out.println("2) dalijums + b = " + (dalijums + b));
        System.out.println("3) summa + starpiba = " + (summa + starpiba));
        System.out.println("\n");
        System.out.println("4) a - b = " + starpiba);
        System.out.println("5) reizinajums - dalijums = " + (reizinajums - dalijums));
        System.out.println("6) dalijums - a = " + (dalijums - a));
        System.out.println("\n");
        System.out.println("7) a * b = " + reizinajums);
        System.out.println("8) starpiba * dalijums = " + (starpiba * dalijums));
        System.out.println("9) summa * reizinajums = " + (summa*reizinajums));
        System.out.println("\n");
        System.out.println("10) a / b = " + dalijums);
        System.out.println("11) reizinajums / starpiba = " + (reizinajums/starpiba));
        System.out.println("12) summa / a = " + (summa/a));
        System.out.println("\n");
        System.out.println("13) Atlikums = " + (a%b));
        System.out.println("14) Summa dalita ar starpibu Atlikums = " + (summa%starpiba));
        System.out.println("15) Summa dalita ar dalijumu = " + (summa%dalijums));

    }
}

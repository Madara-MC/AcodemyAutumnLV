package lekcijaViens;

public class VariablesPractice {
    public static void main(String[] args) {
        System.out.println("Hello");
        // definejam mainigos
        //[mainiga tips] [ mainiga nosaukums] = [mainiga vertiba];

        //Suna vards
String vards = "Reksis";
System.out.print("Suna vards: ");
System.out.println(vards);
        //Suna vecums
        int vecums = 5;
        System.out.print("Suna vecums: ");
        System.out.println(vecums);

        //svars
        double svars = 9.3;
        System.out.print("Suna svars: ");
        System.out.println(svars);
        //skirne (izlaizham)
        //izsalkums
        boolean IsHungry = true;
        System.out.print("Suņa izsalkums: ");
        System.out.println(IsHungry);

        //Apralsts par sevi
        //vards1
        //uzvards
        //hobbijs
        //vaditaja aplieciba
        //vecums
        //ediens
        String vards1 = "Madara";
        String uzvards = "Cerina";
        String hobby = "Hiking";
        boolean aplieciba = true;
        int vecums1 = 35;
        String ediens = "Shashliks";
        System.out.println("Vards: " + vards1 + "Uzvards: " + uzvards + "Hobijs: " + hobby + "Aplieciba: " + aplieciba + "Vecums: " + vecums1 + "Milakais ediens: " + ediens);

            //primitive data types, small letters, small memory size
            //vesels skaitlis - byte/short/int/long

            byte vecumsDivi = 125;
            System.out.println(vecumsDivi);

            short test = 5000;
            int lielskaitlis=  2147483647;

            long earthPopulation = 8087822694L;
            long vecumsMans = 1L;
            System.out.println("Zemes iedzivotaju skaits: " + earthPopulation);

            //dalskaitli
            float temperatura = 36.6F;
            double garums = 182.2;

        int a = 5;
        int b = 10;
        int summa = a + b;

        System.out.println("a + b" + summa);
        System.out.println("a - b = " + (a - b));
        int reizinajums = a * b;
        System.out.println("a * b = " + reizinajums);
        System.out.println( "Rezinijamums dalits ar summu" + (reizinajums/summa));

    }
}

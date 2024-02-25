package homework;

public class ThirdClass {
    public static void main(String[] args) {
        printBusinessCardTwo("Zane", "Liepa", "+371 27067876", 1967);
        printBusinessCardTwo("Edgars", "Avots", "+371 29862567", 1992);

        String [] marsruts = {"cafe Vizbuļi","Dižstendes muiža", "Kandavas promenāde","Kartodroms","Ozolpils"};
        System.out.println("\n" +"Sezonas atklāšanas maršruts");
        for (int i = 0; i < marsruts.length; i++) {
            System.out.println(marsruts[i]);
        }

        int[] rezervetieGaldini = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("\n" +"Valentīndienas pasākumam rezervētie galdiņi");
        int a = 0;
        while (a< rezervetieGaldini.length){
            System.out.println("Galdiņa numurs: " + rezervetieGaldini[a]);
            a=a+1;
        }


        char [] valutas = {'£','€','$'};
        System.out.println("\n" +"Maiņas punktā pieņemam šādas valūtas:");
        for (int i = 0; i < valutas.length; i++) {
            System.out.println(valutas[i]);
        }
        System.out.println("Maršruta sākums: " + marsruts[0]);
        System.out.println("Maršruta galapunkts: " + marsruts[4]);
        System.out.println("Trešais galdiņš: "+rezervetieGaldini[2]);
        System.out.println("Pirmspēdējais galdiņš: "+rezervetieGaldini[8]);
        System.out.println(valutas[0]);
        System.out.println(valutas[1]);
        System.out.println(valutas[2]);
    }


    static void printBusinessCardTwo(String name, String surname, String phone, int date) {
        System.out.println("Vizītkarte");
        System.out.println("*****************");
        System.out.println("Vārds: " + name);
        System.out.println("Uzvārds: " + surname);
        System.out.println("Telefona Numurs: " + phone);
        System.out.println("Dzimšanas gads: " + date);
        System.out.println("*****************");
    }
}

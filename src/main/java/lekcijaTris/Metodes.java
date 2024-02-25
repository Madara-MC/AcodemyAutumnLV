package lekcijaTris;

public class Metodes {
    public static void main(String[] args) {
        try {
            printInfoDog();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        printInfoDog();
        printInfoDog();
        int aprekinataisLaukums = aprekinatTaisnsturaLaukumu(6,7);
        System.out.println("laukumns ir: " + aprekinataisLaukums);
        printInfoAboutDog2("Melnis",9,4.4);
    }

    static int aprekinatTaisnsturaLaukumu(int a, int b){
        int laukums = a*b;
        return laukums;
    }

    static void printInfoDog(){
        String dogName = "Reksis";
        int dogAge = 3;
        double dogWeight = 9.4;
        System.out.println("Mana suna vārds ir " +dogName);
        System.out.println("Mana suna vecums ir " +dogAge);
        System.out.println("Mana suna svars ir " +dogWeight);
    }
    static void printInfoAboutDog2(String name, int age, double weight){
        System.out.println("Mans suna vards ir: " + name);
        System.out.println("Mans suna vecums ir: " + age);
        System.out.println("Mans suna svars ir: " + weight);
        System.out.println("\n");
    }
}

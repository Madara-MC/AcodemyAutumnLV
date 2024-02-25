package lekcijaTris;

public class Metodes2 {
    public static void main(String[] args) {
        int i =0;
        while (i<5){
            System.out.println("Print i..." + i);
            printNameSurname();
            i= i+1;
        }

        int a = 0;
        while (a<10){
            System.out.println("A vertiba ir..." + a);
            a=a+2;
        }

        for (int j = 0; j < 10; j++) {
            System.out.println("Cikls izpildás " + (j+1)+ ". Reizi");
        }
    }

    static void printNameSurname(){
        System.out.println("###########");
        System.out.println("Madara" );
        System.out.println("Cerina" );
        System.out.println("###########");
    }

}

package lekcijaTris;

public class Masivi {
    public static void main(String[] args) {
                                //0                 //1             //2                 //3
        String [] pieturas = {"Centrala stacija", "Marijas iela", "Lāčplēša iela", "Matīsa iela"};
        System.out.println(pieturas[1]);
        System.out.println(pieturas[2]);

        for (String piet : pieturas) {
            System.out.println("Pietura: " + piet);

        }

        for (int i = 0; i <= 3; i++) {
            System.out.println(pieturas[i]);
        }

        for (int i = 0; i <= pieturas.length - 1; i++) {
            System.out.println(pieturas[i]);
        }

        int[] ieluNumuri = {1,3,5,7,9,11};
    }
}

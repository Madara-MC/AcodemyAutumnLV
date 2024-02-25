package lekcijaCetri;

import java.util.ArrayList;

public class DarbibaArKlasem {
    public static void main(String[] args) {
    Dog mansSuns = new Dog();
    mansSuns.setName("Reksis");
    mansSuns.setAge(5);
    mansSuns.setWeight(7.8);
    mansSuns.setBreed("taksis");

    mansSuns.makeSound();
    mansSuns.printDog();

   Dog kaiminaSuns=new Dog();
   kaiminaSuns.setName("Duksis");
   kaiminaSuns.setAge(3);
   kaiminaSuns.setWeight(3.4);
   kaiminaSuns.setBreed("chiwauwa");

    //kaiminaSuns.printDog();

    Home manaMaja=new Home();
    manaMaja.ielasNosaukums = "Ceriņu iela";
    manaMaja.majasNumurs = 8;
    manaMaja.printAddress();

        ArrayList<String> materiali = new ArrayList<>();
        materiali.add("Flizes");
        materiali.add("Parkets");

    manaMaja.apdaresMateriali = materiali;

    Kompanija companyOne = new Kompanija();
    companyOne.companyName = "Evolution Latvia";
    companyOne.founded = 2004;
    companyOne.city = "Riga";
    companyOne.employees = 3427;
    companyOne.typeSia = true;
    companyOne.printCompany();

    Circle rinkis1 = new Circle();
    rinkis1.r=25;
    System.out.println("Riņķa laukums ir: " +rinkis1.calculateArea());
        System.out.println("Riņķa diametrs ir: " +rinkis1.calculateDiameter());
    }
}

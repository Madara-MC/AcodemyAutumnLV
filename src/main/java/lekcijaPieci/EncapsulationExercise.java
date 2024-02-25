package lekcijaPieci;

public class EncapsulationExercise {
    public static void main(String[] args) throws Exception {
        Person cilveks = new Person();
        cilveks.setAge(1);
        System.out.println("Vecums: " +cilveks.getAge());

        Car mansAuto = new Car();
        mansAuto.move();

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.move();

    }
}

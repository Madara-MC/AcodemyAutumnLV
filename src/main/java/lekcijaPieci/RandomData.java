package lekcijaPieci;

import com.github.javafaker.Faker;
import lekcijaCetri.Dog;

public class RandomData {
    public static void main(String[] args) {
        Faker randomDatuGenerators = new Faker();
        System.out.println(randomDatuGenerators.address().fullAddress());

        System.out.println(randomDatuGenerators.book().title());

        System.out.println(randomDatuGenerators.beer().name());

        Dog myDog = new Dog();
        myDog.setAge(randomDatuGenerators.number().randomDigit());
        myDog.setName(randomDatuGenerators.name().firstName());
        myDog.setBreed((randomDatuGenerators.dog().breed()));
        myDog.setWeight(randomDatuGenerators.number().randomDouble(2,5,10));


        myDog.printDog();

    }
}

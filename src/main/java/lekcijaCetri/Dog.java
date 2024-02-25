package lekcijaCetri;

public class Dog {
    private String name;
    private int age;
    private double weight;
    private String breed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void makeSound(){
        System.out.println("VAU VAU");
    }

    public void printDog(){
        System.out.println("Suna vards ir " + name);
        System.out.println("Suna vecums ir " + age);
        System.out.println("Suna svars ir " + weight);
        System.out.println("Suna skirne ir " + breed);
    }
}

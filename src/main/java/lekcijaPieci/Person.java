package lekcijaPieci;

public class Person {
    private int age;

    //getter
    public int getAge() {
        return age;
    }

    //setter
    public void setAge(int age) throws Exception {
        if (age<=0){
            throw new Exception("Vecums nedrikst but mazaks vai vienads ar 0");
        } else {this.age=age;}
        this.age = age;
    }
}

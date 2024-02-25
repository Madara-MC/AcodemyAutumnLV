package lekcijaCetri;

public class Kompanija {
    String companyName;
    String city;
    int founded;
    int employees;
    boolean typeSia;

    public void printCompany() {
        System.out.println("Company name is:  " + companyName);
        System.out.println("It is located in:  " + city);
        System.out.println("Year of foundation: " + founded);
        System.out.println("Number of employees:  " + employees);
        System.out.println("Company type is:  " + typeSia);
    }
}

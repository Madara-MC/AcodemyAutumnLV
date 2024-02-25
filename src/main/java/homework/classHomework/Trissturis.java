package homework.classHomework;

public class Trissturis {
        int malaViens;
        int malaDivi;
        int malaTris;
        double laukums;


        Trissturis(){
            System.out.println("Tiek veidots jauns trijstūris...");
        }
        Trissturis (int a,int b, int c){
            this.malaViens = a;
            this.malaDivi = b;
            this.malaTris = c;
            double area1 = (a+b+c)/2;
            laukums = Math.sqrt(area1* (area1 - a) * (area1 - b) * (area1 - c));
            System.out.println("Trijstūra laukums ir = " + laukums);
        }

    public void aprekinatLaukumu(){
        double area1= (malaViens+malaDivi+malaTris)/2.0d;
        double laukums1 = Math.sqrt(area1* (area1 - malaViens) * (area1 - malaDivi) * (area1 - malaTris));
       System.out.println("Trijstūra laukums = " + laukums1);}

    public void vienadas () {
        if (malaViens==malaDivi && malaDivi == malaTris) {
            System.out.println("Tas ir vienādmalu trijstūris!");
        } else if (malaViens == malaDivi || malaDivi == malaTris || malaTris == malaViens) {
            System.out.println("Tas ir vienādsānu malu trijstūris!");
        } else {
            System.out.println("Tas ir dažādmalu trijstūris!");
        }
    }
}



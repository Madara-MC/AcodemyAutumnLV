package homework.classHomework;

public class Main {
    public static void main(String[] args) {
        Trissturis mansViens = new Trissturis ();
        mansViens.malaViens=4;
        mansViens.malaDivi=4;
        mansViens.malaTris=6;
        mansViens.aprekinatLaukumu();
        mansViens.vienadas();

        Trissturis mansDivi = new Trissturis(12,7,9);
        mansDivi.vienadas();

        Trissturis mansTris = new Trissturis(7,7,7);
        mansTris.vienadas();

    }

}

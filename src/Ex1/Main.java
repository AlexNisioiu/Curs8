package Ex1;

public class Main {
    public static void main(String[] args) {

        Product p = new Product(65, "Masina de spalat", "200 rpm", 1);
        Cosmetics c = new Cosmetics(50, "Vopsea", "Diluata", 4, "Albastra", 25.5);
        Electronics e = new Electronics(35, "Feon", "3 viteze", 2, "Mare", 25.5, 2.5, 3.5, 1.5);
        Fridge f = new Fridge(20, "Termometru", "Temperatura de -20C", 3, "Digital", 10.5, 2.15, 2.75, 2.5, -20);

        System.out.println(p.getResult());
        System.out.println(c.getResult());
        System.out.println(e.getResult());
        System.out.println(f.getResult());

    }


}

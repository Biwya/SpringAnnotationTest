package random;

public class Main {
    public static void main(String[] args) {
        Human persoana = new Human(170, 70, "Albastru", "albi", "Ion");
        Human persoana1 = new Human(190, 82, "Blond", "Cafenii", "Vasea");
        Human defaultHuman = new Human();
//        System.out.println(persoana);
//        persoana.printHuman();
//        persoana.eyeColor = "roz";
        System.out.println(persoana.getHeight());
        persoana.setHeight(5000);
        System.out.println(persoana.getHeight());
//        persoana.printHuman();
//        persoana.move();
//        persoana.move(3);
//        persoana.move("7");
    }


}

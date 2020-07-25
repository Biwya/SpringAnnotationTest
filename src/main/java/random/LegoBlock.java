package random;

public class LegoBlock {
    int lenght;
    int height;
    String shape;
    int numberOfSquares;
    boolean isHuman;
    String color;

    public LegoBlock(int lenght, int height, String shape, int numberOfSquares, boolean isHuman, String color) {
        this.lenght = lenght;
        this.height = height;
        this.shape = shape;
        this.numberOfSquares = numberOfSquares;
        this.isHuman = isHuman;
        this.color = color;
    }

    public void printLego() {
        System.out.println("The lego block is:");
        System.out.println("length = " + this.lenght);
        System.out.println("height = " + this.height);
        System.out.println("shape = " + this.shape);
        System.out.println("numberOfSquares = " + this.numberOfSquares);
        System.out.println("isHuman = " + this.isHuman);
        System.out.println("color = " + this.color);
    }

    public static void main(String[] args) {
        Human1 persoana = new Human1("vasea");
        Human pers = new Human();
        pers.printHuman();
//        pers.weight = 30;
        System.out.println(Math.pow(2,3));
    }


}

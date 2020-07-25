package random;

public class Human {
    int height;
    private int weight;
    private String hairColor;
    private String eyeColor;
    private String name;

    public Human(int height, int weight, String hairColor, String eyeColor, String name) {
        this.height = height;
        this.weight = weight;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.name = name;
    }

    public Human() {
        this.height = 170;
        this.weight = 57;
        this.hairColor = "brown";
        this.eyeColor = "black";
        this.name = "Muhamed";
    }

    public int getHeight(){
        return this.height;
    }

    public int getWeight(){
        return this.weight;
    }

    public void setHeight(int height) {
        if (height>= 140 && height <= 195) {
            this.height = height;
        }
    }









    public void printHuman() {
        System.out.println("Human:");
        System.out.println("height = " + this.height + "; weight = " + this.weight + "; hairColor = " + this.hairColor + "; eyeColor = " + this.eyeColor + "; name = " + this.name);
    }

    public void move() {
        System.out.println("Your human moved for 5 meters");
    }

    public void move(int distance) {
        System.out.println("Your human moved for " + distance + " meters");
    }

    public void move(String distance) {
        System.out.println("Your human moved for " + distance + " meters");
    }

}

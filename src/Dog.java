import javafx.scene.paint.Color;

public class Dog {
    //1. Variable
   private int antalBen = 4;
    private String navn = "";
    private String breed = "";
    private double SizeKG = 0;
    private Color color = new Color(1,1,1,1);

    private int age = 0;
    //2 Constuctor
    public Dog(){
        System.out.println("You developed a dog xD");
    }

    //3. Methods/Functions
    private void eat(){}
    private void sleep(){}
    private void sid(){}
    private void run(){}

    public int getAntalBen() {
        return antalBen;
    }

    public void setAntalBen(int antalBen) {
        this.antalBen = antalBen;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getSizeKG() {
        return SizeKG;
    }

    public void setSizeKG(double sizeKG) {
        SizeKG = sizeKG;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

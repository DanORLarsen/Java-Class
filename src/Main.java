public class Main {

    public static void main(String[] args) {
        Dog doggy = new Dog();
        Dog max = new Dog();
        System.out.println(doggy.getAntalBen());
        doggy.setAntalBen(2);
        System.out.println(doggy.getAntalBen());

        System.out.println(max.getAntalBen());
        System.out.println(max.getColor());


    }
}

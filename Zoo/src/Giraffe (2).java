public class Giraffe extends Animal {

    public Giraffe(float height, float weight, Colors color) {
        super(height, weight, color);
    }

    public void makeSound() {
        System.out.println("pheeew pheew");
    }

    public void feed() {
        eat(3);
    }

}

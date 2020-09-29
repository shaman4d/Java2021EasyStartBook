import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("Добро пожаловать в наш Зоопарк!");

        ArrayList<Animal> animals = new ArrayList();

        for (int i = 0; i < 5; i++)
        {
            animals.add(new Lion(0.6f,55, Animal.Colors.YELLOW));
            animals.add(new Giraffe(3.5f,120, Animal.Colors.YELLOW));
            animals.add(new Swan(1.2f, 25, Animal.Colors.WHITE));
        }

        for (Animal a:animals) {
            a.feed();
            System.out.println(a);
        }
    }
}

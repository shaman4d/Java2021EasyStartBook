public class Swan extends Animal{

    public Swan(float height, float weight, Colors color) {
        super(height, weight, color);
    }

    public void makeSound()
    {
        System.out.println("ssssssssss!!!");
    }

    public void  feed()
    {
        eat(0.5f);
    }
}

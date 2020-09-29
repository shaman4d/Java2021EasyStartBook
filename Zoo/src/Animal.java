public class Animal {
    public enum Colors
    {
        RED,
        YELLOW,
        GREEN,
        WHITE,
        BLACK;
    }
    protected float height;
    protected float weight;
    protected Colors color;

    public Animal(float height, float weight, Colors color) {
        this.height = height;
        this.weight = weight;
        this.color = color;
    }
    public void makeSound() {
        System.out.println("...");
    }
    public void move() {
    }

    public void feed()
    {}

    protected void eat(float food) {
        weight += food;
    }
    public Colors getColor() {
        return color;
    }
    public void setColor(Colors color) {
        this.color = color;
    }
    public float getHeight() {
        return height;
    }
    public float getWeight() {
        return weight;
    }

    public String toString()
    {
        return  "I am " + this.getClass().getName() + "( height:" + height + ", weight: " + weight + ", color:" + color + ")";
    }

}

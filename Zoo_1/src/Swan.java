public class Swan {
    private float height;
    private float weight;
    private Lion.Colors color;

    public Swan(float height, float weight, Lion.Colors color) {
        this.height = height;
        this.weight = weight;
        this.color = color;
    }

    public void hiss()
    {
        System.out.println("ssssssssss!!!");
    }

    public void eat(float food)
    {
        weight += food;
    }

    public void fly() {}

    public Lion.Colors getColor() {
        return color;
    }

    public void setColor(Lion.Colors color) {
        this.color = color;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }
}

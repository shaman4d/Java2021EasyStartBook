public class Giraffe {

    private float height;
    private float weight;
    private Lion.Colors color;

    public Giraffe(float height, float weight, Lion.Colors color) {
        this.height = height;
        this.weight = weight;
        this.color = color;
    }

    public void fluting()
    {
        System.out.println("pheeew pheew");
    }

    public void eat(float food)
    {
        weight += food;
    }

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

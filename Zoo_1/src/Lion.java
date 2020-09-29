public class Lion {
    public enum Colors
    {
        RED,
        YELLOW,
        GREEN,
        WHITE,
        BLACK;
    }

    private float height;
    private float weight;
    private Colors color;

    public Lion(float height, float weight, Colors color) {
        this.height = height;
        this.weight = weight;
        this.color = color;
    }

    public void growl()
    {
        System.out.println("G-R-R-R!!!");
    }

    public void eat(float food)
    {
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
}

















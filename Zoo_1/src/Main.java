public class Main {

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в наш Зоопарк!");

        Lion [] lions = new Lion[5];
        for (int i = 0; i < 5; i++)
        {
            lions[i] = new Lion(0.6f,55, Lion.Colors.YELLOW);
        }

        Giraffe [] giraffes = new Giraffe[5];
        for (int i = 0; i<5;i++)
        {
            giraffes[i] = new Giraffe(3.5f,120, Lion.Colors.YELLOW);
        }

        Swan [] swans = new Swan[5];
        for(int i = 0; i < 5; i++)
        {
            swans[i] = new Swan(1.2f, 25, Lion.Colors.WHITE);
        }

        //  feeding animals
        for(int i = 0; i<5;i++)
            lions[i].eat(10);
        for(int i = 0; i<5;i++)
            giraffes[i].eat(10);
        for(int i = 0; i<5;i++)
            swans[i].eat(10);

    }
}

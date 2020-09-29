public class Main {

    public static void main(String[] args) {
        /*
            Многострочный комментарий
            позволяет написать много интересного
            для программистов, которые будут работать
            с вашим кодом
         */
        int a = 15;
        int b = 20;
        int c = a + b;
        System.out.println("Сумма:" + c); // вывод: Сумма:35
        c = a - b;
        System.out.println("Разность:" + c); // вывод: Разность:-5
        c = a * b;
        System.out.println("Произведение:" + c); // вывод: Произведение:300
        c = a / b;
        System.out.println("Частное:" + c); // вывод: Частное:0

        double d = a / b;
        System.out.println("Новая попытка Частное:" + d);

        double f = (double)a / b;
        System.out.println("Еще одна попытка Частное:" + f);


    }
}
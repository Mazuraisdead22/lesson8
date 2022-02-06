package lesson8;
import java.util.Scanner;
public class HomeWorkApp {


    public static void main(String[] args) {

        Plate plate = new Plate(50);

            Cat cat1 = new Cat("Серый", 12);
            Cat cat2 = new Cat("Рыжий", 16);
            Cat cat3 = new Cat("Черный", 20);
            Cat cat4 = new Cat("Белый", 13);

            Cat[] arrayCats = {cat1, cat2, cat3, cat4};

            System.out.println(plate);
            for (Cat cat: arrayCats) {
                System.out.println(cat.printHungry());
            }

        for (Cat cat: arrayCats) {
            cat.eat(plate);
            System.out.println(plate);
        }
        System.out.println(plate);
        for (Cat cat: arrayCats) {
            System.out.println(cat.printHungry());

    }

        Scanner sc = new Scanner(System.in);
        System.out.println("сколько корма добавить?");

        int y = sc.nextInt();
        System.out.println("добавлено корма " + y);
        System.out.println("все коты сыты");

    }

}
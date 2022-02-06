package lesson8;

public class HomeWorkApp {
    private static String Limiter = " ";
    public static void main(String[] args) {

        Plate plate = new Plate(50);

            Cat cat1 = new Cat("Серый", 12);
            Cat cat2 = new Cat("Рыжий", 16);
            Cat cat3 = new Cat("Черный", 20);
            Cat cat4 = new Cat("Берый", 13);

            Cat[] arrayCats = {cat1, cat2, cat3, cat4};

            System.out.println(plate);
            for (Cat cat: arrayCats) {
                System.out.println(cat.printHungry());
            }

            Limiter();
            for (Cat cat: arrayCats){
                cat.eat(plate);
                System.out.println(plate);
            }
            Limiter();
            for (Cat cat: arrayCats){
                System.out.println(cat.printHungry());
            }

    }

    private static void Limiter() {
    }
}
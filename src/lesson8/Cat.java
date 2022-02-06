package lesson8;

public class Cat {
    private String name;
    private int appetite;
    private boolean hungry = false;

    public Cat(String name, int appetite){

        this.name = name;
        this.appetite = appetite;

    }
    public String printHungry() {
        if (hungry) {
            return name + " голоден ";
        }else {
            return name + " сыт ";
        }
    }
    public void eat(Plate p){
        if (!hungry && p.decreaseFood(appetite)){
            hungry = true;
        }
    }

}

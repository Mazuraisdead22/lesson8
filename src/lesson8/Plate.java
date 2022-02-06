package lesson8;

public class Plate {
    private int food;

    public Plate(int food){
        this.food = food;
    }
    public boolean decreaseFood(int y) {
        if (food - y < 0) {
            return false;
        }else{
            food -= y;
            return true;
        }
    }
    public void addFood(int food){
        this.food = food;
    }
    @Override
    public String toString(){
        return " еды в миске " + food;
    }
}

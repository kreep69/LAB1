package lab1_C6;

public class Cheese extends Food{
    public Cheese(){
        super("сыр");
    }

    public void consume() {
        System.out.println(this + " съеден");
    }
    public Double calculateCalories(){
    double calories=15.0;
    return calories;
    }

}

package lab1_C6;

public class Apple extends Food{
    private String size;

    public Apple(String size) {
        super("Яблоко");
        this.size=size;
    }

    public void consume() {
        System.out.println(this + "съедено");
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size=size;
    }

    public Double calculateCalories(){
        double calcCal=0.0;
        if (size.equals("большое"))
        {
            calcCal=40;
        }
        else if (size.equals("маленькое"))
        {
            calcCal=25;
        }
        return calcCal;
    }
    @Override
    public String toString() {
        return super.toString()+"Apple{" +
                "size='" + size + '\'' +
                '}';
    }
}

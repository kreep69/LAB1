package lab1_C6;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    private static int cheese_counter;
    private static int apple_counter = 0;
    private static int coffee_counter = 0;

    public static void main(String[] args) {
        Food[] breakfast = new Food[8];
        System.out.println("Введите кол-во продуктов");
        String nfood = scanner.nextLine();
        int intfood=Integer.parseInt(nfood);
        if (intfood>8)
        {
            System.out.println("Многовато ешь, больше 8 продуктов нельзя");
            intfood=8;
        }
        for (int i = 0; i < intfood; i++) {
            System.out.println("Введите блюдо");
            String food = scanner.nextLine();
            switch (food) {
                case "сыр" -> breakfast[i] = new Cheese();
                case "яблоко/большое" -> breakfast[i] = new Apple("большое");
                case "яблоко/маленькое" -> breakfast[i] = new Apple("маленькое");
                case "кофе/насыщенный" -> breakfast[i] = new Coffee("насыщенный");
                case "кофе/горький" -> breakfast[i] = new Coffee("горький");
                case "кофе/восточный" -> breakfast[i] = new Coffee("восточный");
                default ->  throw new IllegalArgumentException("invalid value");
            }
            if  (breakfast[i].equals(new Cheese())){ cheese_counter++;}
            else if(breakfast[i].equals(new Apple("большое"))||breakfast[i].equals(new Apple("маленькое"))){apple_counter++;}
            else if(breakfast[i].equals(new Coffee("насыщенный"))||breakfast[i].equals(new Coffee("горький"))||breakfast[i].equals(new Coffee("восточный"))){coffee_counter++;}
        }

        for (Food food : breakfast) {
            String aroma;
            String size;
            if (food != null)
                food.consume();


            else break;
        }
        double foodcal=0.0;
        for (Food food : breakfast) {
            if (food != null)
                foodcal+=food.calculateCalories();
            else break;
        }



        System.out.println("CЫР - " + cheese_counter);
        System.out.println("ЯБЛОКО - " + apple_counter);
        System.out.println("КОФЕ - " + coffee_counter);
        System.out.println("Употреблённые калории: "+foodcal);
    }

}

package Task1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        HotDrinkAutomat hotDrinkAutomat = new HotDrinkAutomat();
        Drink drink = new Drink("Cola", 0.33, 100);
        Drink drink2 = new HotDrink("Coffe",0.2,80,70);
        Drink drink3 = new Drink("Bajkal", 0.5, 150);

        hotDrinkAutomat.addDrink(drink);
        hotDrinkAutomat.addDrink(drink2);
        hotDrinkAutomat.addDrink(drink3);


        System.out.println(hotDrinkAutomat.getDrinkList());



    }
}
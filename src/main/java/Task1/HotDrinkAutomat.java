package Task1;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkAutomat {
    private int id;

    private List<Drink> listDrink;

    public HotDrinkAutomat(List<Drink> listDrink) {
        this.listDrink = listDrink;
    }

    public HotDrinkAutomat(){
        this(new ArrayList<>());
    }
    public void addDrink(Drink drink) {
        listDrink.add(drink);
    }

    public Drink searchName(String name) {
        for (Drink drink : listDrink) {
            if (drink.getName().equalsIgnoreCase(name)) return drink;
        }
        return null;
}

    public String getDrinkList(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список продуктов :\n");
        for (Drink drink:listDrink){
            stringBuilder.append(drink);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();

    }


    }


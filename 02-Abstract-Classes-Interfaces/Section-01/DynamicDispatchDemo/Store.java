import java.util.ArrayList;
import java.util.Arrays;

public class Store
{
    public static void main(String[] args)
    {
        Food bread = new Food("Bread", 120, true);
        Food candy = new Food("Candy", 500, false);
        Food milk = new Food("Milk", 150, true);
        Clothing shirt = new Clothing("Shirt", 500);
        Clothing pants = new Clothing("Pants", 3000);
        Toy train = new Toy("Train", false, 4);
        Toy iPad = new Toy("iPad", true, 1);

        ArrayList<Purchasable> items = new ArrayList<>(Arrays.asList(bread, candy, milk, shirt, pants, train, iPad));
        System.out.printf("Total: $%.2f", generateTotal(items));
    }

    public static double generateTotal(ArrayList<Purchasable> items)
    {
        double totalSum = 0.0;

        for (Purchasable item : items)
        {
            totalSum = totalSum + item.getPrice();
        }

        return totalSum;
    }
}

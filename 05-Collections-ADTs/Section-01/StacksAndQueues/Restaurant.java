import java.util.*;

public class Restaurant
{
    public static void main(String[] args)
    {
        PriorityQueue<Customer> customers = new PriorityQueue<>(//new Comparator<Customer>()
//        {
//            @Override
//            public int compare(Customer o1, Customer o2)
//            {
//                return 0;
//            }
//        }
        );

        Customer c1 = new Customer(1, Customer.Priority.DOORDASH, "hanburger");
        Customer c2 = new Customer(2, Customer.Priority.CARRY_OUT, "pizza");
        Customer c3 = new Customer(3, Customer.Priority.DOORDASH, "potato");
        Customer c4 = new Customer(4, Customer.Priority.IN_PERSON, "hot dog");
        Customer c5 = new Customer(5, Customer.Priority.CARRY_OUT, "cookie");
        Customer c6 = new Customer(6, Customer.Priority.IN_PERSON, "fries");

        customers.offer(c1);
        customers.offer(c2);
        customers.offer(c3);
        customers.offer(c4);
        customers.offer(c5);
        customers.offer(c6);

        System.out.println(customers);
        int startingSize = customers.size();
        Queue<Customer> mealPrepOrder = new LinkedList<>();
        Stack<Customer> dishes = new Stack<>();

        for (int i = 0; i < startingSize; i++)
        {
            Customer c = customers.poll();
            mealPrepOrder.offer(c);
            System.out.println(c);
            System.out.println(customers);
        }

        System.out.println(mealPrepOrder);

        startingSize = mealPrepOrder.size();
        for (int i = 0; i < startingSize; i++)
        {
            Customer c = mealPrepOrder.poll();
            makeOrder(c);
            eat(c);
            dishes.push(c);

        }
        System.out.println(mealPrepOrder);

        startingSize = dishes.size();
        for (int i = 0; i < startingSize; i++)
        {
            cleanDishes(dishes.pop());
        }


    }

    public static void makeOrder(Customer c)
    {
        System.out.println("Customer " + c.getId() + "'s meal of " + c.getOrder() + " was prepared");
    }

    public static void eat(Customer c)
    {
        System.out.println("Customer " + c.getId() + "'s eats their " + c.getOrder());
    }

    public static void cleanDishes(Customer c)
    {
        System.out.println("Customer " + c.getId() + "'s dishes from the " + c.getOrder() + " were cleaned");
    }
}

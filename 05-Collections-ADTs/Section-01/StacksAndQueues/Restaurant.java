import java.util.Comparator;
import java.util.PriorityQueue;

public class Restaurant
{
    public static void main(String[] args)
    {
        PriorityQueue<Customer> customers = new PriorityQueue<>(new Comparator<Customer>()
        {
            @Override
            public int compare(Customer o1, Customer o2)
            {
                return 0;
            }
        });

        Customer c1 = new Customer(1, Customer.Priority.DOORDASH);
        Customer c2 = new Customer(2, Customer.Priority.CARRY_OUT);
        Customer c3 = new Customer(3, Customer.Priority.DOORDASH);
        Customer c4 = new Customer(4, Customer.Priority.IN_PERSON);
        Customer c5 = new Customer(5, Customer.Priority.CARRY_OUT);
        Customer c6 = new Customer(6, Customer.Priority.IN_PERSON);

        customers.offer(c1);
        customers.offer(c2);
        customers.offer(c3);
        customers.offer(c4);
        customers.offer(c5);
        customers.offer(c6);

        System.out.println(customers);
        int startingSize = customers.size();

        for (int i = 0; i < startingSize; i++)
        {
            System.out.println(customers.poll());
            System.out.println(customers);
        }
    }
}

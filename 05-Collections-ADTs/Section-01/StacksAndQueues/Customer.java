public class Customer implements Comparable<Customer>
{
    public enum Priority {CARRY_OUT, IN_PERSON, DOORDASH};
    private Priority customerPriority = Priority.IN_PERSON;
    private int id = 0;

    public Customer(int id, Priority p)
    {
        this.id = id;
        customerPriority = p;
    }

    @Override
    public int compareTo(Customer o)
    {
        if (this.customerPriority == Priority.DOORDASH)
        {
            return -1;
        }
        else if (o.customerPriority == Priority.DOORDASH)
        {
            return 1;
        }
        else if (this.customerPriority == Priority.IN_PERSON)
        {
            return -1;
        }
        else if (o.customerPriority == Priority.IN_PERSON)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    @Override
    public String toString()
    {
        return "Customer #" + id + ": " + customerPriority;
    }
}

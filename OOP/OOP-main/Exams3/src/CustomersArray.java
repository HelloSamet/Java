import java.util.ArrayList;
import java.util.List;

public class CustomersArray {
    private List<Customer> customers;

    public CustomersArray() {
        super();
        customers = new ArrayList<Customer>();
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public void CustomerArrayAdd(Customer customer){
        customers.add(customer);
    }

    @Override
    public String toString() {
        return "CustomersArray [customers=" + customers + "]";
    }


    
}

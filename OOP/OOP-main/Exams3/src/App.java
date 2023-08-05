public class App {
    public static void main(String[] args) throws Exception {
        CustomersArray customersArray = new CustomersArray();

        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Deneme1");
        customer.setSurName("Deneme1Surname");
        customer.setAdressID(1);

        customersArray.CustomerArrayAdd(customer);
        System.out.println(customersArray.toString());
    }
}

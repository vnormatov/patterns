package patternrunner;

import builder.Customer;
import builder.CustomerBuilder;

/**
 * Class for using builder pattern.
 */
public final class Run {
    /**
     * Default constructor.
     */
    private Run() {
    }

    /**
     * Main method for starting execution.
     *
     * @param args arg for method execution.
     */
    public static void main(final String[] args) {
        Customer customer =
                new CustomerBuilder("Ivan", "Smith")
                        .setAge(1)
                        .setStreet("street")
                        .createCustomer();
        System.out.println(customer);
        System.out.println(customer.getName());
        System.out.println(customer.getSurName());
        System.out.println(customer.getAge());
        System.out.println(customer.getStreet());
    }
}

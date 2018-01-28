package patternrunner;

import creation.builder.Customer;
import creation.builder.CustomerBuilder;

/**
 * Class for using creation.builder pattern.
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
        runBuilder();
    }

    /**
     * usage for builder pattern.
     */
    private static void runBuilder() {
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

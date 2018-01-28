package builder;

/**
 * Class for using builder pattern.
 */
public final class Run {
    /**
     * Default construcroe.
     */
    private Run() {
    }

    /**
     * Main method for starting execution.
     *
     * @param args arg for method execution.
     */
    public static void main(final String[] args) {
        Customer customer = new CustomerBuilder("Ivan", "Petrov")
                .setAge(1)
                .setStreet("axax")
                .createCustomer();
        System.out.println(customer);
        System.out.println(customer.getName());
        System.out.println(customer.getSerName());
        System.out.println(customer.getAge());
        System.out.println(customer.getStreet());
    }
}

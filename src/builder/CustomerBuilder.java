package builder;

/**
 * Class for implementation builder pattern for class Customer.
 */
public final class CustomerBuilder {
    /**
     * nested name property from Customer class.
     */
    private String nameNested;
    /**
     * nested surName property from Customer class.
     */
    private String surNameNested;
    /**
     * nested age property from Customer class.
     */
    private int ageNested;
    /**
     * nested street property from Customer class.
     */
    private String streetNested;

    /**
     * Contrustor for class.
     *
     * @param nameNestedParam    customer name.
     * @param surNameNestedParam customer surName.
     */
    CustomerBuilder(
            final String nameNestedParam,
            final String surNameNestedParam) {
        this.nameNested = nameNestedParam;
        this.surNameNested = surNameNestedParam;
    }

    /**
     * Creates instance of Customer.
     *
     * @return Customer instance.
     */
    public Customer createCustomer() {
        return new Customer(nameNested, surNameNested, ageNested, streetNested);
    }

    /**
     * Sets age to future customer object.
     *
     * @param ageParam customer age.
     * @return current instance.
     */
    public CustomerBuilder setAge(final int ageParam) {
        this.ageNested = ageParam;
        return this;
    }

    /**
     * Sets street to future customer object.
     *
     * @param streetParam customer street.
     * @return current instance.
     */
    public CustomerBuilder setStreet(final String streetParam) {
        this.streetNested = streetParam;
        return this;
    }

}

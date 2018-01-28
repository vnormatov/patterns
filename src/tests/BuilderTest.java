package tests;

import creation.builder.Customer;
import creation.builder.CustomerBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Contains tests for creation.builder pattern.
 */
class BuilderTest {
    /**
     * Tests creation.builder pattern. All properties set.
     */
    @Test
    void builderAllPropertiesTest() {
        Customer customer =
                new CustomerBuilder("Ivan", "Smith")
                        .setAge(1)
                        .setStreet("street")
                        .createCustomer();
        Assertions.assertEquals(customer.getAge(), 1);
        Assertions.assertEquals(customer.getName(), "Ivan");
        Assertions.assertEquals(customer.getSurName(), "Smith");
        Assertions.assertEquals(customer.getStreet(), "street");

    }

    /**
     * Tests creation.builder pattern. Not all properties set.
     */
    @Test
    void builderNotAllPropertiesTest() {
        Customer customer =
                new CustomerBuilder("Ivan", "Smith")
                        .setStreet("street")
                        .createCustomer();
        Assertions.assertEquals(customer.getAge(), 0);
        Assertions.assertEquals(customer.getName(), "Ivan");
        Assertions.assertEquals(customer.getSurName(), "Smith");
        Assertions.assertEquals(customer.getStreet(), "street");

    }
}

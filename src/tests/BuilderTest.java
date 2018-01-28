package tests;

import builder.Customer;
import builder.CustomerBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Contains tests for builder pattern.
 */
class BuilderTest {
    /**
     * Tests builder pattern. All properties set.
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
     * Tests builder pattern. Not all properties set.
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

package builder;

/**
 * Class for using builder pattern.
 */
public class Customer {
    /**
     * Customer name.
     */
    private String name;
    /**
     * Customer surname.
     */
    private String surName;
    /**
     * Customer age.
     */
    private int age;
    /**
     * Customer street.
     */
    private String street;

    /**
     * Constructor for class.
     *
     * @param nameParam    Customer name.
     * @param surNameParam Customer surname.
     * @param ageParam     Customer age.
     * @param streetParam  Customer street.
     */
    Customer(
            final String nameParam,
            final String surNameParam,
            final int ageParam,
            final String streetParam) {
        this.name = nameParam;
        this.surName = surNameParam;
        this.age = ageParam;
        this.street = streetParam;
    }

    /**
     * returns customer's age.
     * @return age.
     */
    public int getAge() {
        return age;
    }

    /**
     * returns customer's street.
     * @return street.
     */
    public String getStreet() {
        return street;
    }

    /**
     * returns customer's name.
     * @return name.
     */
    public String getName() {
        return name;
    }

    /**
     * returns customer's surname.
     * @return surname.
     */
    public String getSerName() {
        return surName;
    }

    /**
     * Transforms Customer object to string.
     * @return transformed into string object.
     */
    @Override
    public String toString() {
        return "Customer{"
                + "name='" + name + '\''
                + ", serName='" + surName + '\''
                + ", age=" + age
                + ", street='" + street + '\''
                + '}';
    }
}

public class Address {
    private String street;
    private String city;
    private String country;

    /* Constructor Injection to clone */
    public Address(Address that) {
        this(that.getStreet(), that.getCity(), that.getCountry());
    }

    public Address(String street, String city, String country) {
        this.street = street;
        this.city = city;
        this.country = country;
    }

    /* using interface cloning */
    @Override
    public Object clone() {
        try {
            return (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Address(this.getStreet(), this.getCity(), this.getCountry());
        }
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

public class User {
    private String firstName;
    private String lastName;
    private Address address;

    /* using Constructor Injection to clone */
    public User(User that) {
        this(that.getFirstName(), that.getLastName(), new Address(that.getAddress()));
    }

    public User(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    /* using interface cloning */
    @Override
    public Object clone() {
        User user = null;
        try {
            user = (User) super.clone();
        } catch (CloneNotSupportedException e) {
            user = new User(
                    this.getFirstName(), this.getLastName(), this.getAddress());
        }
        user.address = (Address) this.address.clone();
        return user;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                '}';
    }
}
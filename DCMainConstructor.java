public class DCMainConstructor {

    public static void main(String args[]) {
        DCMainConstructor main = new DCMainConstructor();
        main.testCase();
    }

    public void testCase() {
        Address address = new Address("Jalan Cibodas", "Sukabumi", "Indonesia");
        User nugraha = new User("Nugraha", "Mr. ", address);
        User zaid = new User(nugraha);

        zaid.getAddress().setCity("Tasyikmalaya");
        zaid.setFirstName("Zaid");
        zaid.setLastName("Abdullah");

        System.out.println(nugraha);
        System.out.println(zaid);
    }
}
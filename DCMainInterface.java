public class DCMainInterface {
    public static void main(String args[]) {
        DCMainInterface main = new DCMainInterface();
        main.testCase();
    }

    public void testCase() {
        Address address = new Address("Jalan Cibodas", "Sukabumi", "Indonesia");
        User nugraha = new User("Nugraha", "Mr. ", address);
        User zaid = (User) nugraha.clone();

        zaid.getAddress().setStreet("Jalan Cisarua");
        zaid.setFirstName("Zaid");
        zaid.setLastName("Abdullah");

        System.out.println(nugraha);
        System.out.println(zaid);
    }
}
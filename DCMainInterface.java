public class DCMainInterface {

    public static void main(String args[]) {
        DCMainInterface main = new DCMainInterface();
        main.whenModifyingOriginalObject_thenCloneCopyShouldNotChange();
    }

    public void whenModifyingOriginalObject_thenCloneCopyShouldNotChange() {
        Address address = new Address("Jalan Cisarua", "Cibadak", "Indonesia");
        User nugraha = new User("Nugraha", "Mr. ", address);
        User zaid = (User) nugraha.clone();
        address.setCountry("USA");

        System.out.println(nugraha);
        System.out.println(zaid);
    }
}

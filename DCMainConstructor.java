/*
Contoh Penggunaan Copy Constructor
*/

public class DCMainConstructor {

    public static void main(String args[]) {
        DCMainConstructor main = new DCMainConstructor();
        main.whenModifyingOriginalObject_thenCopyShouldNotChange();
    }

    public void whenModifyingOriginalObject_thenCopyShouldNotChange() {
        Address address = new Address("Jalan Cisarua", "Cibadak", "Indonesia");
        User nugraha = new User("Nugraha", "Mr. ", address);
        User zaid = new User(nugraha);

        address.setCountry("Singapore");

        System.out.println(nugraha);
        System.out.println(zaid);
    }
}

public class ShallowMain {
    public static void main(String args[]) {
        ShallowMain main = new ShallowMain();
        main.whenShallowCopying_thenObjectsShouldNotBeSame();
    }

    public void whenShallowCopying_thenObjectsShouldNotBeSame() {
        Address address = new Address("Jalan Cibdodas", "Sukabumi", "Indonesia");
        User nugraha = new User("Nugraha", "Mr. ", address);

        User koden = new User(
                nugraha.getFirstName(), nugraha.getLastName(), nugraha.getAddress());

        koden.setFirstName("Koden");
        //address.setCity("Bandung");
        koden.getAddress().setCity("Purwakarta");
        System.out.println(nugraha);
        System.out.println(koden);
    }
}
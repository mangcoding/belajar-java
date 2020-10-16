/*
Contoh Penggunaan Shallow Copy
*/
public class ShallowMain {
    public static void main(String args[]) {
        ShallowMain main = new ShallowMain();
        main.whenShallowCopying_thenObjectsShouldNotBeSame();
    }
    public void whenShallowCopying_thenObjectsShouldNotBeSame() {

        Address address = new Address("Jalan Cisarua", "Cibadak", "Indonesia");
        User nugraha = new User("Nugraha", "Mr. ", address);
        User zaid = new User("Zaid", "Hammam", nugraha.getAddress());

        Address address2 = new Address("Jalan Dipatiukur", "Bandung", "Indonesia");
        zaid.setAddress(address2);

        System.out.println(nugraha);
        System.out.println(zaid);
    }

}

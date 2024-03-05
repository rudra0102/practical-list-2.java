public class p3 {
    public p3() {
        System.out.println("Default constructor");
    }

    public p3(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        p3 example1 = new p3();
        p3 example2 = new p3("Constructor with message");
    }
}
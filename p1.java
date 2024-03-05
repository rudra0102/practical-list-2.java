public class p1 {
    private String message;
    
    public p1(String msg) {
        this.message = msg;
    }
    
    public void displayMessage() {
        System.out.println("Message: " + message);
    }
    
    public static void main(String[] args) {
        p1 obj = new p1("Hello, World!");
        obj.displayMessage();
    }
}
public class p5{
    int num;

    p5() {
        this(10);
    }

    p5(int num) {
        this.num = num;
    }

    void display() {
        System.out.println("Value of num: " + this.num);
    }

    public static void main(String[] args) {
        p5 obj = new p5();
        obj.display();
    }
}
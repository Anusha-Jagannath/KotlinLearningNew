package interoperability;

public class Main2 {

    public static void main(String args[]) {
        System.out.println("interoperability");
        int sum = MainKt.add(2, 3);
        System.out.println("the sum is " + sum);
    }

    static int add(int a, int b) {
        return a + b;
    }

     static int area(int l, int b) {
        return l * b;
    }
}

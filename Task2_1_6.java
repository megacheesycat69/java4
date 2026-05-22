public class Task2_1_6 {
    public static void main(String[] args) {
        float f = 5.9f;
        byte b = (byte) f;        // 5

        int big = 300;
        byte small = (byte) big;  // 44 (потеря старших битов)

        System.out.println("b = " + b);
        System.out.println("small = " + small);
    }
}

public class Task2_1_5 {
    public static void main(String[] args) {
        int i = 5;
        double d = 2.5;
        double result = i * d; 
        
        // Объяснение:
        // 12.5 - int преобразуется в double, умножение даёт double. 
        // Если результат присвоить int, потребуется явное приведение, иначе потеря точности.
        System.out.println("Результат: " + result);
    }
}

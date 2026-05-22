import java.util.ArrayList;

public class Task2_1_8 {
    public static void main(String[] args) {
        // Использование var (выведение типов локальных переменных, доступно с Java 10)
        var list = new ArrayList<String>();
        var num = 100;
        var text = "Привет";

        list.add(text);
        System.out.println("Список: " + list);
        System.out.println("Число: " + num);
    }
}

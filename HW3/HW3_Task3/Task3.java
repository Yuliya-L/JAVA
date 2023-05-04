package HW3_Task3;
import java.util.ArrayList;
import java.util.Collections;

/*Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка. */

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(17);
        numbers.add(24);
        numbers.add(2);
        numbers.add(16);
        numbers.add(3);
        numbers.add(5);
        numbers.add(1);
        numbers.add(33);
        numbers.add(14);
        System.out.println(numbers);

        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        int count = 0;
        double average = 0;
        for (int num : numbers) {
            count += num;
        }
        average = (double)count / numbers.size();
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее арифметическое значение: " + average);
    }
}
    
package HW3_Task2;

import java.util.ArrayList;


/*Пусть дан произвольный список целых чисел, удалить из него чётные числа */

public class Task2 {
   public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(6);
        numbers.add(1);
        numbers.add(33);
        numbers.add(4);
        numbers.add(99);
        numbers.add(2);
        numbers.add(3);
        numbers.add(13);
        numbers.add(54);
        System.out.println("Список чисел: " + numbers);
        numbers.removeIf(n -> n % 2 == 0);
        System.out.println("Список без четных чисел: " + numbers);
    }
}
   

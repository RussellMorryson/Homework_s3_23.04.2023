import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* Задан целочисленный список ArrayList. 
Найти минимальное, максимальное и среднее арифметическое 
из этого списка. Collections.max() */

public class Task_2 {
    public static void main(String[] args) {
        int max = 10;
        int min = 1;
        int size = 10;
        List<Integer> list = new ArrayList<Integer>(size);
        list = createList(list, min, max, size);
        System.out.println(list);
        int maxNumber = findMax(list);
        System.out.println("Максимальное значение: " + maxNumber);
        int minNumber = findMin(list);
        System.out.println("Минимальное значение: " + minNumber);
        float average = findAverage(list);
        System.out.println("Среднее значение: " + average);
    }

    static List<Integer> createList(List<Integer> listCreate, int min, int max, int size) {
        Random random = new Random();
        int temp = 0;
        for (int i = 0; i < size; i++) {
            temp = random.nextInt(max - min) + min;
            listCreate.add(temp);
        }
        return listCreate;
    }

    static int findMax(List<Integer> list) {
        int max = 0;
        max = Collections.max(list);
        return max;
    }

    static int findMin(List<Integer> list) {
        int min = 0;
        min = Collections.min(list);
        return min;
    }
    static float findAverage (List<Integer> list) {
        int sum = 0;
        for(int temp : list) {
            sum += temp;
        }
        float average = sum / list.size();
        return average;
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* Пусть дан произвольный список целых чисел, 
удалить из него четные числа */

public class Task_1 {
    public static void main(String[] args) {
        int max = 10;
        int min = 1;
        int size = 10;
        List<Integer> list = new ArrayList<Integer>(size);
        list = createList(list, min, max, size);
        System.out.println(list);
        list = sortList(list);
        System.out.println(list);
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

    static List<Integer> sortList(List<Integer> listSort) {
        List <Integer> newList = new ArrayList<>();
        for (int i = 0; i < listSort.size(); i++) {
            if (listSort.get(i) % 2 != 0) {
                newList.add(listSort.get(i));
            }
        }
        return newList;
    }

}

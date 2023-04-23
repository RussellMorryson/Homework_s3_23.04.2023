import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* Заполнить список названиями планет Солнечной системы 
в произвольном порядке с повторениями. 
Вывести название каждой планеты и количество его 
повторений в списке. */

public class Task_3 {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("Юпитер");
        list.add("Сатурн");
        list.add("Марс");
        list.add("Сатурн");
        list.add("Плутон");
        list.add("Венера");
        list.add("Марс");
        list.add("Земля");
        list.add("Сатурн");
        list.add("Меркурий");
        list.add("Марс");
        list.add("Нептун");
       
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String word : list) {                
            if (map.containsKey(word)==false) {
                map.put(word, 1);                    
            } else {
                map.put(word, map.get(word) + 1);
            }
        }
        System.out.println(map);
    }
}

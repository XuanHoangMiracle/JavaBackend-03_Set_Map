package BTVN_Phone_Comparable_Comparator.BT_Set_Map;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapWork {
    public static void main(String[] args) {
        String text = "Java is fun and java is powerful and java is popular";
        String[] names = {"An", "Binh", "Chi", "An", "Dung", "Binh", "Hoa"};

        countWord(text);
        classifyNames(names);
    }
    private static void countWord(String text) {
        String[] words = text.toLowerCase().split("\\s+");
        Map<String, Integer> soLanXuatHien = new LinkedHashMap<>();

        for (String word : words) {
            soLanXuatHien.put(word, soLanXuatHien.getOrDefault(word, 0) + 1);
        }

        System.out.println("\n(a) Số lần xuất hiện của mỗi từ:");
        soLanXuatHien.forEach((word, count) -> System.out.println(word + ": " + count));
    }

    private static void classifyNames(String[] arr) {
        Map<String, Integer> nameCount = new LinkedHashMap<>();

        for (String name : arr) {
            nameCount.put(name, nameCount.getOrDefault(name, 0) + 1);
        }
        
        List<String> uniqueNames = new ArrayList<>();
        List<String> duplicateNames = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : nameCount.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueNames.add(entry.getKey());
            } else {
                duplicateNames.add(entry.getKey());
            }
        }

        // In kết quả
        System.out.println("\n(b) Phân loại tên:");
        System.out.println("Tên duy nhất: " + uniqueNames);
        System.out.println("Tên trùng: " + duplicateNames);
    }

}

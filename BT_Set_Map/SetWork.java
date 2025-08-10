package BTVN_Phone_Comparable_Comparator.BT_Set_Map;
import java.util.*;

public class SetWork {
        public static void main(String[] args) {
            Integer[] array1 = {5, 7, 5, 3, 7, 1, 9, 4, 2, 1, 6};
            Integer[] array2 = {5, 7, 5, 3, 11, 12, 91, 41, 21, 19, 68};

            System.out.println("Mảng 1 ban đầu: " + Arrays.toString(array1));
            System.out.println("Mảng 2 ban đầu: " + Arrays.toString(array2));

            loaiBoPhanTuTrung(array1);
            sum(array1);
            findCommonElements(array1, array2);
            findMinMax(array1);
        }

        private static void loaiBoPhanTuTrung(Integer[] arr) {
            Set<Integer> set = new LinkedHashSet<>(Arrays.asList(arr));
            System.out.println("\n(a) Các phần tử duy nhất (giữ nguyên thứ tự): " + set);
        }

        private static void sum(Integer[] arr) {
            int sum = new HashSet<>(Arrays.asList(arr))
                    .stream()
                    .mapToInt(Integer::intValue)
                    .sum();
            System.out.println("\n(b) Tổng các phần tử duy nhất: " + sum);
        }

        private static void findCommonElements(Integer[] arr1, Integer[] arr2) {
            Set<Integer> common = new HashSet<>(Arrays.asList(arr1));
            common.retainAll(new HashSet<>(Arrays.asList(arr2)));
            System.out.println("\n(c) Các phần tử chung: " + common);
        }

        private static void findMinMax(Integer[] arr) {
            TreeSet<Integer> ts = new TreeSet<>(Arrays.asList(arr));
            System.out.println("\n(d) Min = " + ts.first() + ", Max = " + ts.last());
        }
    }
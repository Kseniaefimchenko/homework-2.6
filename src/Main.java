import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> nums1 = new ArrayList<>(List.of("dd", "dd", "kl", "ty", "ii", "ii", "qq", "qq", "pa", "lf"));
    private static final List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("Задание 1");

        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    public static void task2() {
        System.out.println("Задание 2");

        Collections.sort(nums);
        int uniqueness = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num % 2 == 0 && num != uniqueness) {
                System.out.println(num);
                uniqueness = num;
            }
        }
    }
    public static void task3(){
        System.out.println("Задание 3");

        Set<String> unique = new HashSet<>(nums1);
        System.out.println(unique);
    }
    public static void task4(){
        System.out.println("Задание 4");

        Set<String> uniqueWords = new HashSet<>(strings);
        System.out.println(strings.size() - uniqueWords.size());
    }
}
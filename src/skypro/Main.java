package skypro;

import java.util.*;

public class Main {
    private static List<Integer> nums = Arrays.asList(1, 1, 2, 3, 4, 4, 5, 5, 6, 7);
    private static List<String> text = Arrays.asList(
            "I", "used", "to", "dream",
            "I", "used", "to", "glance", "beyond", "the", "stars",
            "Now", "I", "don't", "know", "where", "we", "are",
            "Although", "I", "know", "we've", "drifted", "far");


    public static void main(String[] args) {
        task1getOddNumbers();
        task2getEvenNumbers();
        task3getUniqueWords();
        task4getDuplicates();

    }


    private static void task1getOddNumbers() {
        for (int i : nums) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    private static void task2getEvenNumbers() {
       TreeSet<Integer> uniqueNumbers = new TreeSet<>(Comparator.reverseOrder());
        uniqueNumbers.addAll(nums);
        for (int i : nums) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    private static void task3getUniqueWords() {
        Set<String> uniqueWords = new HashSet<>(text);
        System.out.println(uniqueWords);

    }

    private static void task4getDuplicates() {
        Set<String> duplicateWords = new HashSet<>(text);
        System.out.println(text.size() - duplicateWords.size());
    }
}

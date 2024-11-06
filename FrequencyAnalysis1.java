import java.util.*;

public class FrequencyAnalysis1 {

    // Static variable to store the input array of N numbers
    static int[] inputArray;

    // Method to find the top K numbers by frequency
    public static void findTopKNumbers(int K) {
        // Step 1: Count the frequency of each number using a HashMap
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : inputArray) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create a list from the entry set of the frequency map
        List<Map.Entry<Integer, Integer>> frequencyList = new ArrayList<>(frequencyMap.entrySet());

        // Step 3: Sort the list by frequency and then by value (in case of tie)
        frequencyList.sort((a, b) -> {
            if (!a.getValue().equals(b.getValue())) {
                return b.getValue() - a.getValue(); // Sort by frequency (descending)
            } else {
                return b.getKey() - a.getKey(); // If same frequency, sort by value (descending)
            }
        });

        // Step 4: Print the top K numbers
        System.out.println("Top " + K + " numbers by frequency:");
        for (int i = 0; i < K && i < frequencyList.size(); i++) {
            System.out.println(frequencyList.get(i).getKey() + " -> Frequency: " + frequencyList.get(i).getValue());
        }
    }

    public static void main(String[] args) {
        // Example input array
        inputArray = new int[] { 5, 3, 9, 5, 3, 9, 5, 2, 9, 2, 9, 5, 3, 9, 2 };

        // Example: Find top 3 numbers with the highest frequency
        int K = 3;
        findTopKNumbers(K);
    }
}

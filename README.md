Lab 2a

The `FrequencyAnalysis1` Java class is designed to analyze an array of integers and identify the top `K` numbers based on their frequency of occurrence. The class includes a static integer array `inputArray`, which holds the numbers to be analyzed. This array is directly initialized within the `main` method for demonstration purposes, making it easy to test with different sets of data.

To calculate the frequency of each number, the `findTopKNumbers` method utilizes a `HashMap`. This map stores each unique number as a key, with its corresponding value representing the frequency or count of occurrences. The method iterates over the `inputArray`, updating the frequency count for each number. The `getOrDefault` method ensures that if a number is not already present in the map, it is initialized with a count of 0 before being incremented. This provides an efficient way to track the frequency of numbers in the array.

Once the frequencies are calculated, the method proceeds by converting the entries of the `HashMap` into a list of `Map.Entry` elements. This list is then sorted using a custom comparator. The sorting criteria first prioritize frequency, ordering numbers in descending order based on how often they appear. If two numbers share the same frequency, the comparator ensures that they are further sorted by their value, also in descending order. This ensures that higher numbers are prioritized in case of ties.

The method then displays the top `K` numbers from the sorted list. It loops through the sorted list and prints the number along with its frequency for the top `K` entries, or fewer if there are not enough numbers to reach `K`. The result is a well-organized output of the most frequent numbers in the input array.

In the `main` method, an example `inputArray` is provided, and the `findTopKNumbers` method is called with `K = 3` to demonstrate the process. This example finds and displays the three most frequent numbers from the array. The implementation can easily be adapted to work with different input data or to calculate the top `K` numbers for various values of `K`.



Lab 2b

The ShareTrader class calculates the maximum profit from at most two stock market transactions (buying and selling). It uses two arrays, profitLeft[] and profitRight[], to track the maximum profit that can be achieved with one transaction up to each day and from each day onward.
profitLeft[] stores the maximum profit for a transaction ending at each day by tracking the minimum price encountered so far.
profitRight[] calculates the maximum profit for a transaction starting at each day by tracking the maximum price from the right.

The final maximum profit is obtained by summing the values from both arrays for each day and choosing the highest sum. The algorithm runs in O(n) time, making it efficient for large datasets. The main method tests this with two example price arrays, showing how the maximum profit is computed.

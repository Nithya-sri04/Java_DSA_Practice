import java.util.Arrays;

class Item {
    int value, weight;
    double ratio;

    public Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
        this.ratio = (double) value / weight;
    }
}

public class Knapsack {

    public static int fractionalKnapsack(int[] value, int[] weight, int capacity) {
        int n = weight.length;
        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) {
            items[i] = new Item(value[i], weight[i]);  
        }

        Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));

        int maxValue = 0;
        int currentWeight = 0;

        for (Item item : items) {
            if (currentWeight + item.weight <= capacity) {
                currentWeight += item.weight;
                maxValue += item.value;
            } else {
                int remainingWeight = capacity - currentWeight;
                maxValue += (item.value * remainingWeight) / item.weight;
                break;  // Exit the loop since the knapsack is full
            }
        }

        return maxValue;
    }

    public static void main(String[] args) {
        int[] value = {60, 100, 120};
        int[] weight = {10, 20, 30};
        int capacity = 50;
        System.out.println("Maximum value is " + fractionalKnapsack(value, weight, capacity));
        int[] value1 = {30, 90, 40};
        int[] weight1 = {10, 10, 30};
        int capacity1 = 40;
        System.out.println("Maximum value is " + fractionalKnapsack(value1, weight1, capacity1));
        int[] value2 = {10, 40, 30, 50};
        int[] weight2 = {5, 4, 6, 3};
        int capacity2 = 5;
        System.out.println("Maximum value is " + fractionalKnapsack(value1, weight1, capacity1));
    }
}

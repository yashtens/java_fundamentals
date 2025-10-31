package Day_1;
public class largest {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int largest = numbers[0]; // Assume the first element is the largest
        for (int i = 1; i < numbers.length; i++) {
            // If the current number is greater than the largest, update largest
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        System.out.println("hello ");
        System.out.println("The largest number is: " + largest);
    }
}

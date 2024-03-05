import java.util.Scanner;

class ArraySearch {
    public static void main(String[] args) {
        
        int[] numbers = {1, 4, 7, 2, 9, 5, 8, 3, 6};

        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number to search: ");
        int target = scanner.nextInt();

        
        int index = search(numbers, target);
        
        if (index != -1) {
            System.out.println("Number " + target + " found at index " + index);
        } else {
            System.out.println("Number " + target + " not found in the array.");
        }
    }
    
    public static int search(int[] arr, int target) {
        // Iterate through the array to find the target number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                
                return i;
            }
        }
        
        return -1;
    }
}

// ∀k ∈ R, ∀A where A is a sorted array of real numbers; rank(k, A) finds if A contains k or not.
// Usage: java BinarySearch <array of numbers separated by spaces>
// While the program is running, enter a number to check if array of numbers you entered is contains your number or not
// Enter a non-integer value for quit

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] whitelist = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(whitelist);

        try {
            while (scanner.hasNextInt()) {
                int key = scanner.nextInt();
                int i = rank(key, whitelist);
                if (i != -1) {
                    System.out.println(whitelist[i] + " found!");
                } else {
                    System.out.println("not found!");
                }
            }
        } finally {
            scanner.close();
        }
    }

    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid])
                hi = mid - 1;
            else if (key > a[mid])
                lo = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}
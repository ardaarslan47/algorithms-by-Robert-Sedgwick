/*
 * ∀n ∈ Z >= 0, F(n) returns n'th element of fibonacci array that starts with 0 and 1.
 * Usage: java fibonacci <integer greater or equal to 0>
 */
public class fibonacci {
    public static void main(String[] args) {
        for (int i = 0; i < Integer.parseInt(args[0]); i++) {
            System.out.println(i + "- " + F(i));
        }
    }

    public static long F(int n)
    {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return F(n - 1) + F(n - 2);
    }
}
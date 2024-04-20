//∀p,q ∈ R >= 0, gcd(p, q) calcutes greatest common divider
public class oklid {
    public static void main(String[] args) {
        System.out.println(gcd(520, 180));
    }

    public static int gcd(int p, int q) {
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }
}
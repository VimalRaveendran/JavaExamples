package examples;

public class BitwiseExample {

    public static int swap(int n, int p, int q)
    {
        // if bits are different at position `p` and `q`
        if ((((n & (1 << p)) >> p) ^ ((n & (1 << q)) >> q)) == 1)
        {
            n ^= (1 << p);
            n ^= (1 << q);
        }
        return n;
    }

    public static void main(String[] args) {
        swap(37, 2, 4);
    }
}

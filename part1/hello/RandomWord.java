import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        int i = 1;
        String ans = "";
        while (!StdIn.isEmpty()) {
            String name = StdIn.readString();
            double p = (double) 1 / i;
            i++;
            if (StdRandom.bernoulli(p)) {
                ans = name;
            }
        }
        StdOut.println(ans);
    }
}
package algorithms;

import java.util.stream.IntStream;

public class XOROperationInAnArray {
    public int xorOperation2(int n, int start) {
        int xor = start;
        for (int i = 1; i < n; i++) {
            xor = xor ^ (start + 2 * i);
        }
        return xor;
    }

    public int xorOperationUsingStream(int n, int start) {
        return IntStream.range(1, n).map(i -> start + 2 * i).reduce(start, (a, b) -> a ^ b);
    }
}

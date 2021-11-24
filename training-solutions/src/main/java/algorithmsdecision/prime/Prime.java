package algorithmsdecision.prime;

public class Prime {

    private Prime() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}

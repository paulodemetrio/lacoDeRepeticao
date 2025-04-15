public class WhilePrimo {
    public static void main(String[] args) {
        int i = 2;
        do {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) { 
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
            i++;
        } while (i <= 100);
    }
}
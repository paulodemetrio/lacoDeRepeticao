public class WhileParEImpar {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 100) {
                if (i % 2 == 0) {
                    System.out.println(i + " - PAR");
                } else {
                    System.out.println(i + " - IMPAR");
                }
                i++;
        };
    }
}

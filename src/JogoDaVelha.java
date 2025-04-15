/* 
 *     _|_|_
 *     _|_|_
 *      | |
 */

public class JogoDaVelha {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i < 2) {
                    System.out.print("_");
                } else if (i == 2){
                    System.out.print(" ");
                }
                if (j < 2) {
                    System.out.print("|");
                }
            }
            System.out.println("");
        }
    }
}

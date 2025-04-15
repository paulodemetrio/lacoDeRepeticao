/* 
 *     _|_|_
 *     _|_|_
 *      | |
 */

public class JogoDaVelhaComWhile {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        while (i < 3) {
            while (j < 3) {
                if (i < 2) {
                    System.out.print("_");
                } else if (i == 2){
                    System.out.print(" ");
                }
                if (j < 2) {
                    System.out.print("|");
                }
                j++;
            }        
            System.out.println("");
            j = 0;
            i++;
        }        
    }
}

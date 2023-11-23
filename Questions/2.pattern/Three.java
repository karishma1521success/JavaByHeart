import java.util.*;
public class Three {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int row = 1; row<=n; row++){
            //space
            int numberOfSpace = n-row;
            for(int space = 1; space <= numberOfSpace; space++){
                System.out.print("  ");
            }
            int numberOfStars = row;
            for(int star = 1; star <= numberOfStars; star++){
                System.out.print("* ");
            }
            System.out.println();
        }
        scn.close();
    }
}

//question                  row    star    space       row = stars    row+ space = n
// _ _ _ _ *                 1      1       4
// _ _ _ * *                 2      2       3
// _ _ * * *                 3      3       2
// _ * * * *                 4      4       1
// * * * * *                 5      5       0

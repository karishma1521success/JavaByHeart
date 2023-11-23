import java.util.*;
public class Two {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int row = 1; row<=n ; row++){
            int numberOfStars = n+1-row;
            for(int star = 1; star<=numberOfStars; star++){
                System.out.print("* ");
            }
            System.out.println();
        }
        scn.close();
    }
}

// question                      row            stars        row + stars = n+1
// * * * * *                      1               5           1+5 = 6
// * * * *                        2               4           2+4 = 6
// * * *                          3               3           3+3 = 6
// * *                            4               2           4+2 = 6
// *                              5               1           5+1 = 6

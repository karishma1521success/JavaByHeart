import java.util.*;
public class Four {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // logic is that stars print when row == col  and  row+ col == n+1;
        for(int row = 1; row<=n; row++){
            for(int col = 1; col <= n; col++){
                if(row == col || row+col == n+1){
                    System.out.print("*  ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


        scn.close();
    }
}


//question   --- logic pattern is divided into rows and columns and stars is only there where row == col or row+col = n+1;
// *        *
//   *    *
//     *
//   *    *
// *        *

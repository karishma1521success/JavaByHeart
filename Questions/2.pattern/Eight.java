import java.util.*;
public class Eight {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); //input that must be an odd number 
        //stars print = at left diagonal and right diagonal and first and last column
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n; col++){
                if(col == 1 || col == n){
                    //stars at first column and last column
                    System.out.print("* ");
                }else if(row == col || row + col == n + 1){
                    // stars at the diagnonals but stars not the upper diagonals only on the lower diagonals
                    if(row >= n/2 + 1){     //this will print W but for M we only have to change the condition row <= n/2 + 1
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }else{
                    //print spaces
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        scn.close();
    }
}

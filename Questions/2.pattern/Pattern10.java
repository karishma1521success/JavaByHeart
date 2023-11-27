import java.util.*;

public class Pattern10 {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); //input and the value of n should be odd
        //prepare row 1 
        int row  = 1, nspaces = n/2, nstars = 1;
        while(row <= n){
            //spaces
            for(int space = 1; space<=nspaces; space++){
                System.out.print("\t");
            }
            //stars
            for(int star=1; star <= nstars; star++){
                //print for each row stars at first and last
                if(star == 1 || star == nstars){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
               
            }
            // go to the next line
            System.out.println();

            //prepare for the next row
            if(row <= n/2){
                nspaces = nspaces - 1;
                nstars = nstars + 2;
            }else{
                nspaces = nspaces + 1;
                nstars = nstars - 2;
            }

            row++;
            
        }
        scn.close();
    }
    
}




// question     - print       
//                                     
//         *                     
//      *     *                  
//   *           *                   
//      *     *                   
//         *  


//1. print print this pattern    and then spaces instead of stars each row only 1 and last stars are printing.

//                                row      spaces     stars      
//         *                      1         2           1
//      *  *  *                   2         1           3
//   *  *  *  *  *                3         0           5
//      *  *  *                   4         1           3
//         *  
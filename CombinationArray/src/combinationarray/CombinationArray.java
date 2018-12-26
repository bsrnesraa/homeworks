
package combinationarray;

import java.util.Arrays;
import java.util.Scanner;

public class CombinationArray {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int[] array = new int[10];
        
        for(int i = 0 ; i<10 ; i++){
            array[i] = scanner.nextInt();
            
        }
        System.out.println(Arrays.toString(array));
         for(int i = 0 ; i<10 ; i++){
            for(int j = 0 ; j<10 ; j++){
                System.out.println("["+array[i]+"]"+"["+array[j]+"]");
            }
        }
        
    }
    
    
    
}

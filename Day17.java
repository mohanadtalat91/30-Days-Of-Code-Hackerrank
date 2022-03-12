import java.util.*;
import java.io.*;

//Write your code here

class Calculator{
    
    Calculator(){
        
    }
    
    public int power(int n, int p){
        if( n < 0 || p < 0){
            throw new ArithmeticException("n and p should be non-negative") ; 
        }
        else{
            int product = 1 ; 
            while(p>0){
                product *= n ;
                p-- ;  
            }
            return product ; 

        }
    }
}

class Solution{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}

import java.util.*;

public class first {
      // here we have to used the Kadans algorithm over here 
             public static void KadanAlgorithm(int numbers[]){  // here's is my function over here
                    int Currvalue = 0;

                       int Maxvalue = Integer.MIN_VALUE;   // here we define the -infinite 

                             for( int i = 0; i<numbers.length; i++){   /// goes to all loop

                               Currvalue = Currvalue + numbers[i]; // here we stored the actual values 

                                  if(Currvalue < 0){
                                       Currvalue = 0;
                                  }   
                                    Maxvalue = Math.max(Currvalue, Maxvalue);
                                       
                             }

                               System.out.println("Our max Subarray Sum is : " + Maxvalue);
                 
             }

     public static void main(String[] args) {    
        int numbers[] = { -2 , -3 , 4 , -1 , -2 , 1 , 5, -3};   // here we have an array 
         KadanAlgorithm(numbers);
      }
}
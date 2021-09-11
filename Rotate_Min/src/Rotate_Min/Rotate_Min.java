package Rotate_Min;

/* This class is the implementation class to find the minimum value in the array.
   In order to find the minimum value, in this class we will use binary search. So, we should sort the array first and find the middle point, minimum, and maximum value.
   Thus, we should consider 7 cases in total.
   1) The number of input value in the array is zero.
   2) The number of input value in the array is one.
   3) The last number in the array is larger than the first position number. 
   4) The middle position value is larger than the first position number.
   5) The middle position value is larger than the next value of the middle position value.
   6) The initial position value is larger than the middle position value.
   7) The middle position value is smaller than the previous value of the middle position value. */

public class Rotate_Min {
    public int minimumValue (int[] inputs){
        
        int initialPosition = 0; //First position value.
        int lastPosition = inputs.length-1; //Last position value.
        
       if(inputs.length == 0){ //First case: 1)The number of input value in the array is zero.
           System.out.println("The input number is null.");
           return -1;
       }

       if(inputs.length == 1){ // Second case: 2) The number of input value in the array is one.
           return inputs[initialPosition];
       }

       if(inputs[lastPosition] > inputs[initialPosition]){ // Third case: 3) The last number in the array is larger than the first position number. 
           return inputs[initialPosition];
       }

       while (lastPosition >= initialPosition){
           int midPosition = ((lastPosition-initialPosition)/2) + initialPosition;
           
           if(inputs[midPosition-1]>inputs[midPosition]){ // Seventh case: 7) The middle position value is smaller than the previous value of the middle position value.
               return inputs[midPosition];}

           if(inputs[midPosition]>inputs[midPosition+1]){ // Fifth case: 5) The middle position value is larger than the next value of the middle position value.
               return inputs[midPosition+1];
           }

           if(inputs[initialPosition]>inputs[midPosition]){ // Sixth case: 6) The initial position value is larger than the middle position value.
               lastPosition = midPosition-1;
           }

           if(inputs[midPosition]>inputs[initialPosition]){ // Fourth case: 4) The middle position value is larger than the first position number.
               initialPosition = midPosition+1;
           }

       }
       return -1;
    }
}// Rotate_Min

package Rotate_Min;

public class Rotate_Min {
    public int minimumValue (int[] inputs){
        int initialPosition = 0;
        int lastPosition = inputs.length-1;
       if(inputs.length == 0){
           System.out.println("The input number is null.");
           return -1;
       }

       if(inputs.length == 1){
           return inputs[initialPosition];
       }

       if(inputs[lastPosition] > inputs[initialPosition]){
           return inputs[initialPosition];
       }

       while (lastPosition >= initialPosition){
           int midPosition = ((lastPosition-initialPosition)/2) + initialPosition;
           if(inputs[midPosition-1]>inputs[midPosition]){
               return inputs[midPosition];}

           if(inputs[midPosition]>inputs[midPosition+1]){
               return inputs[midPosition+1];
           }

           if(inputs[initialPosition]>inputs[midPosition]){
               lastPosition = midPosition-1;
           }

           if(inputs[midPosition]>inputs[initialPosition]){
               initialPosition = midPosition+1;
           }

       }
       return -1;
    }
}

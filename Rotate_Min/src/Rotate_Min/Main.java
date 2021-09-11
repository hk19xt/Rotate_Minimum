package Rotate_Min;

/*This class is Main class. In this class, users can change the input numbers in hardcoded code line.
  This minimum value search is using the binary search.
  Thus, we need to sort the array before searching the middle point, minimum and maximum value in the array.
  
  Author: Hyejin Kim
  Date: 9/12/2021 */

public class Main {
    public static void main(String[] args){
        Rotate_Min RM = new Rotate_Min();
        int[] userInputs = {4,5,6,7,0,1,2}; //User can change the hardcoded input values here.
        int minimumOutput = 0;
        minimumOutput = RM.minimumValue(userInputs);
        System.out.println("The minimum value is " + minimumOutput);
    }
}package Rotate_Min;

public class Main {
}

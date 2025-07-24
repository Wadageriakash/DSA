package Arrays;

import java.util.Arrays;

public class RemoveEvenIntegersFromArray{

    public static void printMyArray(int[] myArray){
        Arrays.stream(myArray)
        .filter(i -> i%2 != 0)
        .forEach(i ->{
            System.out.println(i);
        });
    }
    public static void main(String[] args)    {
        int[] myArray = {2, 3, 4, 5, 6, 7, 8, 9, 10};
         printMyArray(myArray);
    }
}
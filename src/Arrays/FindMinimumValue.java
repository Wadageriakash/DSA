package Arrays;


import java.util.Arrays;
import java.util.OptionalInt;

class FindMinimumValue {
    public static void main(String[] args) {
        int[] num = {2, 3, 1, 6, 7, 10};
       
        //==================================================
        int minimumValue = num[0];
        for(int i = 0; i < num.length; i++){
            if(minimumValue > num[i] ){
                minimumValue = num[i];
            }
        }
        System.out.println("Minimum value : " + minimumValue);
        //==================================================
        System.out.println("\n--- Using Stream API ---");
        
        OptionalInt minimumValueStream = Arrays.stream(num).min();
        System.out.println("Minimum value (stream): " + minimumValueStream.getAsInt());

        

    }
}

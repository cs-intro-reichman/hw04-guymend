public class ArrayOps {
    public static void main(String[] args) {
        
    }
    
    public static int findMissingInt (int [] array) {
        int maxInArray = 0;
        int missingNumber = 0;
        int[] exisitingNumbers = new int[array.length + 1];
        for(int i = 0; i < array.length; i++){
            exisitingNumbers[array[i]] = 1;
        }
        for(int j = 0; j < exisitingNumbers.length; j++){
            if(exisitingNumbers[j] != 1){
                missingNumber = j;
            }
        }
        return missingNumber;
    }

    public static int secondMaxValue(int [] array) {
        int firstMax = 0;
        int secondMax = 0;
        int firstMaxCounter = 0;
        for(int i = 0; i < array.length; i++){
            if (array[i] >= firstMax) {
                firstMax = array[i];
            }
        }
        
        for(int i = 0; i < array.length; i++){
            if(array[i] == firstMax){
                firstMaxCounter++;
            }
            if ((array[i] >= secondMax) && (array[i] < firstMax)) {
                secondMax = array[i];
            }
            if(firstMaxCounter > 1){
                secondMax = firstMax;
            }
        }
        return secondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Write your code here:
        int elementExists = 0;
        if(array2.length >= array1.length){
            for(int i = 0; i < array2.length; i++){
                elementExists = 0;
                for(int j = 0; j < array1.length; j++){
                    if(array2[i] == array1[j]){
                        elementExists = 1;
                    }
                }
                if(elementExists != 1){
                    return false;
                }
            }

            return true;
        }else{
            for(int i = 0; i < array1.length; i++){
                elementExists = 0;
                for(int j = 0; j < array2.length; j++){
                    if(array1[i] == array2[j]){
                        elementExists = 1;
                    }
                }
                if(elementExists != 1){
                    return false;
                }
            }

            return true;
        }
    }

    public static boolean isSorted(int [] array) {
        boolean isIncreasing = false;
        boolean isDecreasing = false;
        for(int i = 0; i < array.length - 1; i++){
            if(array[i + 1] > array[i]){
                isIncreasing = true;
            }else if(array[i + 1] < array[i]){
                isDecreasing = true;
            }
            if (isIncreasing && isDecreasing) {
                return false;
            }
        }
        return true;
    }

}

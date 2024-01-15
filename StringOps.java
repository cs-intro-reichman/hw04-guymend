public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        
    }

    public static String capVowelsLowRest (String string) {
        for(int i = 0; i < string.length(); i++){
            Character letter =  string.charAt(i);
            if((((int) letter) > 64) && (((int) letter) < 91)){
                string = string.replace(string.charAt(i), (char)(((int) letter) + 32));
            }
        }
        for(int i = 0; i < string.length(); i++){
            Character letter =  string.charAt(i);
            if((((int) letter) == 97) || (((int) letter) == 101) || (((int) letter) == 105) || (((int) letter) == 111) || (((int) letter) == 117)){
                string = string.replace(string.charAt(i), (char)(((int) letter) - 32));
            } 
        }
        return string;
    }

    public static String camelCase (String string) {
        // Write your code here:
        return "";
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        return new int[1];
    }
}

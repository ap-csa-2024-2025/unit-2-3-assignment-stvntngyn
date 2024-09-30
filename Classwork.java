public class Classwork
{
  public static String firstLastN(String input, int n) {
        String firstPart = input.substring(0, n);
        String lastPart = input.substring(input.length() - n);
        return firstPart + lastPart;
    }

    public static String delEnd(String input, int n) {
        return input.substring(0, input.length() - n);
    }

    public static int compareLower(String str1, String str2) {
        return str1.toLowerCase().compareTo(str2.toLowerCase());
    }

    public static int lengthFirst(String sentence) {
        String firstWord = sentence.split(" ")[0];
        return firstWord.length();
    }

    public static void main(String[] args) {

        System.out.println(firstLastN("dictionary", 1));
        System.out.println(firstLastN("apple", 2)); 

        System.out.println(delEnd("library", 5));  

        System.out.println(compareLower("Sterling", "material")); 
        System.out.println(compareLower("framing", "framiNG"));   
        System.out.println(compareLower("BAgels", "candLes"));     

        System.out.println(lengthFirst("Everything in its right place")); 
        System.out.println(lengthFirst("Down is the new up"));            
    }
}


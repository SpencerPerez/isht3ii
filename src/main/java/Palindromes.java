public class Palindromes {

    public static void main(String[] args){
        System.out.println(evaluate("madam"));
        System.out.println(evaluate(""));
        //System.out.println(evaluate(null));
        System.out.println(evaluate("oro \t oro"));
        System.out.println(evaluate("oo"));
        System.out.println(evaluate("ana "));
        System.out.println(evaluate("packmyboxwithfivedozenliquorjugspackmyboxwithfivedozenliquorjugspackmyboxwithfivedozenliquorjugspackmyboxwithfivedozenliquorjugs" +
                "packmyboxwithfivedozenliquorjugspackmyboxwithfivedozenliquorjugspackmyboxwithfivedozenliquorjugspackmyboxwithfivedozenliquorjugs"));
    }

    /**
     * Iterative solution to this problem. This algorithm has a complexity order in time terms of
     * O(N/2) = O(N) where N is the number of letters in the word. In space terms, this algorithm has
     * a complexity order equals to O(1) because we are not using any other data structure to store
     * temporal information.
     */
    public static boolean evaluate(String word) {
        if (word == null) {
            throw new IllegalArgumentException("You can't pass a null String as input.");
        }
        boolean result = true;
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - 1 - i)) {
                result = false;
                break;
            }
        }
        return result;
    }
}
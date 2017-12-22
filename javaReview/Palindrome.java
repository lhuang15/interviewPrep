
class Palindrome {
	public static void main(String[] args) {
        String a = "tactcoab";
        boolean result = isPerlindromeOfPalindrome(a);
        System.out.println("OK "+result); // Display the result.
    }

    /*
    Palindrome Permutation: Given a string, write a function 
    to check if it is a permutation of a palindrome.
    */
    static boolean isPerlindromeOfPalindrome(String s) {
        boolean[] alphabet = new boolean[128];
        for (char c : s.toCharArray()) {
            alphabet[c] = !alphabet[c];
        }
        if (s.length()%2==0){
            for (boolean b : alphabet) {
                if (b) {
                    return false;
                }
            }
        } else {
            int count = 0;
            for (boolean b: alphabet) {
                if (count>1) {
                    return false;
                }
                if (b) {
                    count++;
                }
            }
        }
        return true;
    }

}
class Permutation {
	public static void main(String[] args) {
        String a = "abcd";
        String b = "dcbe";
        boolean result = checkPermutation(a,b);
        System.out.println("OK "+result); // Display the result.
    }

    static String sort(String s) {
    	char[] content = s.toCharArray();
    	java.util.Arrays.sort(content);
    	return new String(content);
    }	

    static boolean checkPermutation(String a, String b) {
    	if (a.length() != b.length()) return false;

    	return sort(a).equals(sort(b));
    }
}
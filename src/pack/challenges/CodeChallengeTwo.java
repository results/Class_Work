package pack.challenges;

public class CodeChallengeTwo {
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("racecars"));
	}
	
	public static boolean isPalindrome(String input) {
		return perm(input.toCharArray(), 0, input.length()-1);
	}

	static boolean found;
	
    public static boolean perm(char[] chars, int startIndex, int endIndex) {
    	String permString = new String(chars);
        if(startIndex == endIndex) {
        	System.out.println(permString);
			StringBuilder bob = new StringBuilder().append(permString).reverse();
			String reversed = bob.toString();
        	if(permString.equals(reversed)) {
        		return found = true;//found, flag it
        	}
        }else{
            for(int i = startIndex; i <= endIndex; i++) {
            	if(found)
            		break;//found, no need to keep going
                 char temp = chars[startIndex];
                 chars[startIndex] = chars[i];
                 chars[i] = temp;
                 perm(chars, startIndex+1, endIndex);
                 temp = chars[startIndex];
                 chars[startIndex] = chars[i];
                 chars[i] = temp;
            }
        }
        return found;
    }

}

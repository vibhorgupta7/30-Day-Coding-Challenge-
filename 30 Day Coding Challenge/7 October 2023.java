public class Solution {

	public static String replaceCharacter(String input, char c1, char c2) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		 StringBuilder s = new StringBuilder();

		 for(int i =0;i<input.length();i++){
			 char c = input.charAt(i);
			 if(c==c1){
				 s.append(c2);
			 } else{
				 s.append(c);
			 }
		 }

			s.toString();
		 return s;

	}
}

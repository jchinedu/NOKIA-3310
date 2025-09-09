public class Kata2  {
public static String reverseWords(final String original) {
StringBuilder result = new StringBuilder();
StringBuilder word = new StringBuilder();

    for (int i = 0; i < original.length(); i++) {
      char c = original.charAt(i);
	 if (c == ' ') {
      
        result.append(word.reverse());
        word.setLength(0);
	result.append(c); 
	 } else {
        word.append(c);
      }
}
 result.append(word.reverse());

  
    


   
        
    
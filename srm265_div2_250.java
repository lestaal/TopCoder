
// Top Coder: SRM 265 Div 2 - 250

public class FontSize {

	/* Returns the pixel width of a sentence where the widths of each letter
	 * are given by int[] uppercase and int[] lowercase.
	 * Spaces are 3 pixels wide, and there is a 1 pixel buffer between characters.
	 */
	public int getPixelWidth(String sentence, int[] uppercase, int[] lowercase){
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		int width = 0;
		
		for (int i = 0; i < sentence.length(); i++){
			char letter = sentence.charAt(i);
			int index = alphabet.indexOf(Character.toLowerCase(letter));
			if (letter == ' '){
				width += 4;
			}
			else {
				if (Character.isUpperCase(letter)){
					width += uppercase[index] + 1;
				}
				else {
					width += lowercase[index] + 1;
				}
			}
		}
		width --;
		return width;
	}
}
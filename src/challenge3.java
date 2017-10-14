import javax.swing.JOptionPane;

public class challenge3 {

	public static void main(String[] args) {
		//ask user for word
		String input = JOptionPane.showInputDialog(null, "Enter a word.");
		//make word into list of letters
		char [] charArray = input.toCharArray();
		// check if it's an palindrome or not
		int sorted = charArray.length;
		int i = 1;
		while (charArray[i-1] == charArray[sorted-1] && i < charArray.length) {
			i++;
			sorted--;
		}
		//Say if it's an palindrome or not
		if (sorted == 0 || sorted == 1) {
			JOptionPane.showMessageDialog(null, "The word you entered is a palindrome!");
		}else {
			JOptionPane.showMessageDialog(null,  "The word you entered is not a palindrome.");
		}
		
	}

}

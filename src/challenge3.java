import javax.swing.JOptionPane;

public class challenge3 {

	public static void main(String[] args) {
		//ask user for word
		String input = JOptionPane.showInputDialog(null, "Enter a word.");
		//make word into list of letters
		char [] charArray = input.toCharArray();
		// check if it's an palindrome or not
		int needbesorted = charArray.length;
		for (int i = 1; charArray[i-1] == charArray[needbesorted-1] && i < charArray.length; i++) {
			needbesorted--;
		}
		//Say if it's an palindrome or not
		if (needbesorted == 0 || needbesorted == 1) {
			JOptionPane.showMessageDialog(null, "The word you entered is a palindrome!");
		}else {
			JOptionPane.showMessageDialog(null,  "The word you entered is not a palindrome.");
		}
		
	}

}

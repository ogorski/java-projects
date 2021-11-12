package practise;

// static import
import static javax.swing.JOptionPane.*;

public class practise05 {
    public static void main(String[] args) {
        String str, txt;
        txt = showInputDialog("Enter the text: "); // Display window with input field

        int size = txt.length(); // length of input text

        char a = txt.charAt(0); // character variables
        char b = txt.charAt(size-1); // character variables

        // Value of text variables
        str = "Text: " + txt + "\n";
        str += "Symbols in text: " + size + "\n";
        str += "First symbol: " + a + "\n";
        str += "Last symbol: " + b;
        showMessageDialog(null, str);
    }
}

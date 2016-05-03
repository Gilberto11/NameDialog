//Basic input with a dialog box
import javax.swing.JOptionPane;
public class NameDialog {

	public static void main(String[] args) {
		//prompt for the user to enter a name
		String name = JOptionPane.showInputDialog("Whats your name?");
		
		//create a message
		String message = String.format("Welcome, %s, to Java Programming!", name);
		
		//display the message to welcome the user by name
		JOptionPane.showMessageDialog( null,  message );
		
		
	

	}

}

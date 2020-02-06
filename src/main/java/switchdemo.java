//import javax.swing.JOptionPane;
public class switchdemo {
	public static void main(String[] args) {
		char gender = 'm';
		//String gender = JOptionPane.showInputDialog("Enter a gender")
		switch(gender)
		{
		case 'm':
		System.out.print("male");
		break;
		case 'f':
		System.out.print("female");	
		break;
		default :
		System.out.print("Do not wish to identify");	
		}
	}

}

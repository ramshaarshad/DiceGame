
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.net.URL;
import javax.swing.ImageIcon;

public class DiceGame {
	public static void main(String[] args) throws Exception {

		int dice = (int) (6 * Math.random()) + 1;
		switch (dice) {
			case 1: {
				System.out.println("You rolled a " + dice + "!");
				URL imageLocation1 = new URL(
						"https://cdn3.iconfinder.com/data/icons/line/36/dice_one-128.png");
				JOptionPane.showMessageDialog(null, "You rolled a 1!", "Dice Game",
						JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation1));
				break;
			}
			case 2: {
				System.out.println("You rolled a " + dice + "!");
				URL imageLocation2 = new URL(
						"https://cdn3.iconfinder.com/data/icons/line/36/dice_two-128.png");
				JOptionPane.showMessageDialog(null, "You rolled a 2!", "Dice Game",
						JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation2));
				break;
			}
			case 3: {
				System.out.println("You rolled a " + dice + "!");
				URL imageLocation3 = new URL("https://cdn3.iconfinder.com/data/icons/line/36/dice_three-128.png");
				JOptionPane.showMessageDialog(null, "You rolled a 3!", "Dice Game",
						JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation3));
				break;
			}
			case 4: {
				System.out.println("You rolled a " + dice + "!");
				URL imageLocation4 = new URL("https://cdn3.iconfinder.com/data/icons/line/36/dice_four-128.png");
				JOptionPane.showMessageDialog(null, "You rolled a 4!", "Dice Game",
						JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation4));
				break;
			}
			case 5: {
				System.out.println("You rolled a " + dice + "!");
				URL imageLocation5 =
						new URL("https://cdn3.iconfinder.com/data/icons/line/36/dice_five-128.png");
				JOptionPane.showMessageDialog(null, "You rolled a 5!", "Dice Game",
						JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation5));
				break;
			}
			case 6: {
				System.out.println("You rolled a " + dice + "!");
				URL imageLocation6 = new URL(
						"https://cdn3.iconfinder.com/data/icons/line/36/dice_six-128.png");
				JOptionPane.showMessageDialog(null, "You rolled a 6!", "Dice Game",
						JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation6));
				System.exit(0);
				break;
			}
			default: {
				System.out.println("Invalid entry! Please enter an integer between 1 and 6");
			}
		}


	}
}



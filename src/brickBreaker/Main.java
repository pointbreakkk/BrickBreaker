package brickBreaker;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) 
	{
		JFrame obj = new JFrame();
		Gameplay gp = new Gameplay();
		obj.setBounds(10, 10, 700, 600);
		obj.setTitle("BreakIt");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gp);
	}

}

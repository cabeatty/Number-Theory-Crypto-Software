package UTL;

/**
 * Created by colin on 17/03/17.
 */
import GUI.GUI;

import javax.swing.*;

public class main
{
	public static void main(String[] args)
	{
		GUI gui = new GUI();
		gui.setVisible(true);
		gui.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		gui.setResizable(false);
	}
}

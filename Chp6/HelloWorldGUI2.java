import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloWorldGUI2 {

	private static class HelloWorldDisplay extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString( "Hello World!", 50, 30);
		}
	}

	private static class ButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {

		HelloWorldDisplay displayPanel = new HelloWorldDisplay();
		JButton okButton = new JButton("OK");
		ButtonHandler listener = new ButtonHandler();
		okButton.addActionListener(listener);

		// The basic JPanel is, again, just a blank rectangle. 
		// There are two ways to make a useful JPanel: 
		// The first is to add other components to the panel; 
		// the second is to draw something in the panel.
		JPanel content = new JPanel();
		content.setLayout(new BorderLayout());
		content.add(displayPanel, BorderLayout.CENTER);
		content.add(okButton, BorderLayout.EAST);

		//  A JFrame is an independent window that can, 
		//  for example, act as the main window of an application. 
		JFrame window = new JFrame("This is a cool test!");
		window.setContentPane(content);
		window.setSize(250, 100);
		window.setLocation(100, 100);
		window.setVisible(true);
	}
}
import java.awt.Component;
import java.awt.event.*;
import javax.swing.JFrame;

public class ClickableRandomStrings {

	public static void main(String[] args) {
		JFrame window = new JFrame("Java!");
		RandomStringsPanel content = new RandomStringsPanel();
		content.addMouseListener( new RepaintOnClick() );
		window.setContentPane(content);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocation(120, 70);
		window.setSize(350, 250);
		window.setVisible(true);
	}

	private static class RepaintOnClick implements MouseListener {

		public void mousePressed(MouseEvent evt) {
			Component source = (Component)evt.getSource();
			source.repaint();
		}

		public void mouseClicked(MouseEvent evt) { }
		public void mouseReleased(MouseEvent evt) { }
		public void mouseEntered(MouseEvent evt) { }
		public void mouseExited(MouseEvent evt) { }
	}
}
import javax.swing.JFrame;

public class Frame extends JFrame {
	JFrame frame;

	public JFrame getFrame(){
		return this.frame;
	}

	public Frame(){
		this.frame = new JFrame("editor");
		this.getFrame().setVisible(true);
		this.getFrame().setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
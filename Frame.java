import javax.swing.JFrame;

public class Frame extends JFrame {
	JFrame frame;

	public JFrame getFrame(){
		return this.frame;
	}

	public Frame(){
		this.frame = new JFrame("editor");
		this.getFrame().setVisible(true);
		this.getFrame().setSize(250,250);
		this.getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
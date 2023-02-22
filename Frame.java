import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
	JFrame frame;
	JPanel panel;
	JScrollPane scrollPane;
	JTextPane editor;

	public JFrame getFrame(){
		return this.frame;
	}

	public JPanel getPanel(){
		return this.panel;
	}

	public JTextPane getEditor(){
		return this.editor;
	}

	public JScrollPane getScrollPane(){
		return this.scrollPane;
	}

	public Frame(){
		//initalize the frame, panel, textPane, and scrollPane
		this.frame = new JFrame("editor");
		this.panel = new JPanel(new BorderLayout());
		this.editor = new JTextPane();
		this.scrollPane = new JScrollPane(this.getEditor());
		//place the pane in the center of the the panel
		this.getPanel().add(this.getScrollPane(), BorderLayout.CENTER);
		//place the panel in the frame
		this.getFrame().add(this.getPanel());
		//set the frame size and functionality
		this.getFrame().setVisible(true);
		this.getFrame().setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class View extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel label;
	private JButton button;
	
	public View(String title) {
		super(title);
		
		label = new JLabel("Push the button!");
		button = new JButton("push me");
		
		this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		
		this.add(label);
		this.add(button);
		
		
		
		this.setVisible(true);
		// Sets the window as large as needed. Only works after setting visible to 'true'.
		this.setSize(this.getPreferredSize());
	}
	
	public void setText(String newText) {
		this.label.setText(newText);
	}

	
	
	public JButton getButton() {
		return button;
	}

	public void setButton(JButton button) {
		this.button = button;
	}
	
}

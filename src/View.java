import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class View extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel label;
	private JButton button;
	private JTextField textfield;
	
	public View(String title) {
		super(title);
		
		textfield = new JTextField("insert name");
		label = new JLabel("Insert name an push the button...");
		button = new JButton("push me");
		
		this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		
		
		this.add(label);
		this.add(textfield);
		this.add(button);
		
		
		this.setResizable(false);
		this.setVisible(true);
		// Sets the window as large as needed. Only works after setting visible to 'true'.
		this.setSize(this.getPreferredSize());
		
	}
	
	public void setText(String newText) {
		this.label.setText(newText);
	}
	
	public void clearNameInput()
	{
		this.textfield.setText("");
	}
	
	public String getInputValue() 
	{
		return this.textfield.getText();
	}
	
	public void setFocusToInputField()
	{
		this.textfield.requestFocus();
	}

	
	
	public JButton getButton() {
		return button;
	}
	
}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controller {

	private Model model;
	private View view;
	
	public Controller(Model model, View view) 
	{
		this.model = model;
		this.view = view;
		
		this.view.getButton().addActionListener(new NameInputButtonHandler());
	}



	public static void main(String[] args) {
		
		new Controller(new Model(), new View("some window"));
		
	}
	
	
	
	class NameInputButtonHandler implements ActionListener 
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			model.setName(view.getInputValue());
			
			view.setText(model.getGreeting());
			view.clearNameInput();
			
			view.setFocusToInputField();
		}
			
	}
}

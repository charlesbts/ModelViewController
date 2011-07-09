import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The {@link Controller} knows both the {@link Model} and the {@link View}
 * while they have no clue of each other.
 * <br/><br/>
 * Also, both of them don't know the {@link Controller} at all.
 * <br/><br/>
 * In a huge application, your model would do the business logic while
 * the view provides a visual representation for it. By keeping the components
 * separated from each other, you can easily use the model for multiple graphical
 * interfaces, the commandline, in a web application, and so on.
 * <br/>
 * The controller itself should leave the business logic to the model, but act as
 * a guide through the interface (such as disabling textfields that aren't accessible
 * until you entered your birthdate [...]).
 */
public class Controller 
{

	private Model model;
	private View view;
	
	public Controller(Model model, View view) 
	{
		this.model = model;
		this.view = view;
		
		this.view.getButton().addActionListener(new NameInputButtonHandler());
	}



	public static void main(String[] args) 
	{
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

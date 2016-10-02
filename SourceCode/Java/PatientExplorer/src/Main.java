import calculateWeekday.CalculateWeekday;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage; 

public class Main extends Application 
{
	public static final int String =0;
	TextField uidText;
	TextField nameText;
	TextField ageText;
	TextField sexText;
	TextField dobText;
	TextField heightText;
	TextField weightText;
	TextField birthdayText;
	TextField addressText;
	TextField aadhaarnoText;
	public CalculateWeekday calc;
	@Override
	public void start(Stage stage)
	{
		VBox pane=new VBox();
		
		createControls(pane);
		
		stage.setScene(new Scene(pane, 640, 480));
		stage.setTitle("Clinical Informatics");
		stage.setResizable(false);
		stage.show();
	}
	
	public void createControls(VBox pane) 
	{
		Text uidLabel=new Text("UID");
		uidText=new TextField();
		
		Text nameLabel=new Text("Name");
		nameText=new TextField();
	 	
		Text ageLabel=new Text("Age");
		ageText=new TextField();
		
		Text sexLabel=new Text("Sex");
		sexText=new TextField();
		
		Text dobLabel=new Text("DOB(dd/mm/yyyy)");
		dobText=new TextField();
		
		Text heightLabel=new Text("Height");
		heightText=new TextField();
		
		Text weightLabel=new Text("Weight");
		weightText=new TextField();
		
		Text birthdayLabel=new Text("BirthDay");
		birthdayText=new TextField();
		
		Text addressLabel=new Text("Address");
		addressText=new TextField();
		
		Text aadhaarnoLabel=new Text("AadhaarNo");
		aadhaarnoText=new TextField();
		
		Button saveButton=new Button("Save");

		saveButton.setOnAction(e-> validateData());
		
		pane.getChildren().addAll(uidLabel, uidText, nameLabel, nameText,ageLabel,ageText,sexLabel ,sexText,dobLabel,dobText,heightLabel,heightText,weightLabel,weightText,birthdayLabel,birthdayText,addressLabel,addressText,aadhaarnoLabel,aadhaarnoText,saveButton);
	}
	
	public void validateData()
	{
		 BusinessLogicValidation patientExplorer = new BusinessLogicValidation();
		 patientExplorer.uidValidation(uidText.getText());
		 patientExplorer.nameValidation(nameText.getText());
		 patientExplorer.ageValidation(ageText.getText());
		 patientExplorer.sexValidation(sexText.getText());
		 patientExplorer.dobValidation(dobText.getText());
		 patientExplorer.heightValidation(heightText.getText());
		 patientExplorer.weightValidation(weightText.getText());
		 patientExplorer.birthdayValidation(dobText.getText());
		 CalculateWeekday calc=new CalculateWeekday();
		 String day=calc.getWeekday();
		 birthdayText.setText(day);
		 System.out.println(day);
		 System.out.println(calc.getWeekday());
		 patientExplorer.addressValidation(addressText.getText());
		 patientExplorer.aadhaarnoValidation(aadhaarnoText.getText());
		 patientExplorer.saveData(uidText.getText());
	}

	public static void main(String args[])
	{
		launch(args);
		
	}
}

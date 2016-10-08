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
		

		Button LoadButton=new Button("Load");
		LoadButton.setOnAction(e-> loadData());
		
		pane.getChildren().addAll(uidLabel, uidText, nameLabel, nameText,ageLabel,ageText,sexLabel ,sexText,dobLabel,dobText,heightLabel,heightText,weightLabel,weightText,birthdayLabel,birthdayText,addressLabel,addressText,aadhaarnoLabel,aadhaarnoText,saveButton,LoadButton);
	}
	
	public void loadData() 
	{
		BusinessLogicValidation patientExplorer = new BusinessLogicValidation();
		String name=patientExplorer.loadData(uidText.getText());
		nameText.setText(name);
		String age=patientExplorer.loadData1(uidText.getText());
		ageText.setText(age);
		String sex=patientExplorer.loadData2(uidText.getText());
		sexText.setText(sex);
		String dob=patientExplorer.loadData3(uidText.getText());
		dobText.setText(dob);
		String height=patientExplorer.loadData4(uidText.getText());
		heightText.setText(height);
		String weight=patientExplorer.loadData5(uidText.getText());
		weightText.setText(weight);
		String birthday=patientExplorer.loadData6(uidText.getText());
		birthdayText.setText(birthday);
		String address=patientExplorer.loadData7(uidText.getText());
		addressText.setText(address);
		String aadhaarno=patientExplorer.loadData8(uidText.getText());
		aadhaarnoText.setText(aadhaarno);
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
		 //patientExplorer.birthdayValidation(dobText.getText());
		 CalculateWeekday calc=new CalculateWeekday();
		 String day=calc.getWeekday(dobText.getText());
		 birthdayText.setText(day);
		 System.out.println(day);
		 //System.out.println(calc.getWeekday());
		 patientExplorer.addressValidation(addressText.getText());
		 patientExplorer.aadhaarnoValidation(aadhaarnoText.getText());
///////////////////////////////////////////////////////////////save data method /////////////////////////////////////////////////////////////////////////////////////////////////////////		
		 patientExplorer.saveData(uidText.getText(), nameText.getText(),ageText.getText(),sexText.getText(),dobText.getText(),heightText.getText(), weightText.getText(),birthdayText.getText(),addressText.getText(), aadhaarnoText.getText());
		 
	}
	
	public static void main(String args[])
	{
		launch(args);
		
	}
}

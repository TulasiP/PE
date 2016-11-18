import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
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
	TextField phonenumberText;
	ComboBox<String> studytypeText;
	
	public CalculateWeekday calc;
	@Override
	public void start(Stage stage)
	{
		VBox pane=new VBox();
		createControls(pane);
	    stage.setScene(new Scene(pane, 620 , 580));
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
		
		Text phonenumberLabel=new Text("PhoneNo");
		phonenumberText=new TextField();
		
		Text studytypeLabel=new Text("Study Type");
		ObservableList<String> items =FXCollections.observableArrayList("Coronary", "Pediatric", "Electrophysiology");
		studytypeText=new ComboBox<String>(items);
		studytypeText.getSelectionModel().selectFirst();
		
		Button saveButton=new Button("Save");
		saveButton.setOnAction(e-> validateData());
		
		Button LoadButton=new Button("Load");
		LoadButton.setOnAction(e-> loadData());
		
		pane.getChildren().addAll(uidLabel, uidText, nameLabel, nameText,ageLabel,ageText,sexLabel ,sexText,dobLabel,dobText,heightLabel,heightText,weightLabel,weightText,birthdayLabel,birthdayText,addressLabel,addressText,aadhaarnoLabel,aadhaarnoText,phonenumberLabel,phonenumberText,studytypeLabel,studytypeText,saveButton,LoadButton);

//		uidText.setText("1");
//		nameText.setText("test");
//		ageText.setText("111");
//		sexText.setText("Male");
//		dobText.setText("01/01/2000");
//		heightText.setText("5' 6\"");
//		weightText.setText("100");
//		birthdayText.setText("Sunday");
//		addressText.setText("test");
//		aadhaarnoText.setText("1234567890");
//		phonenumberText.setText("1234567890");
//		studytypeText.setValue("Coronary");
	}
	
	public void loadData() 
	{
		Logger.LogMessage("Main.loadData started");
		BusinessLogicValidation bussinessLogic = new BusinessLogicValidation();
		PatientInformation pi=new PatientInformation();
		pi.uuid=uidText.getText();
		PatientInformation plpi=bussinessLogic.loadData(pi);
		nameText.setText(plpi.name);
		ageText.setText(plpi.age);
		sexText.setText(plpi.sex);
		dobText.setText(plpi.dob);
		heightText.setText(plpi.height);
		weightText.setText(plpi.wheight);
		birthdayText.setText(plpi.birthday);
		addressText.setText(plpi.addres);
		aadhaarnoText.setText(plpi.aadhaarno);
		phonenumberText.setText(plpi.PhoneNo);
		studytypeText.setValue(plpi.studytype);
		Logger.LogMessage("Main.loadData ended");
	}
	
	public void validateData()
	{
		Logger.LogMessage("Main.validateData started ");
		PatientInformation pi=new PatientInformation();
		pi.aadhaarno=aadhaarnoText.getText();
		pi.addres=addressText.getText();
		pi.age=ageText.getText();
		pi.birthday=birthdayText.getText();
		pi.dob=dobText.getText();
		pi.height=heightText.getText();
		pi.name=nameText.getText();
		pi.sex=sexText.getText();
		pi.uuid=uidText.getText();
		pi.wheight=weightText.getText();
		pi.PhoneNo=phonenumberText.getText();
		pi.studytype=studytypeText.getSelectionModel().getSelectedItem();
		System.out.println(studytypeText.getSelectionModel().getSelectedItem());
		BusinessLogicValidation bussinessLogic = new BusinessLogicValidation();
		bussinessLogic.ValidateData(pi);
		 
///////////////////////////////////////////////////////////////save data method /////////////////////////////////////////////////////////////////////////////////////////////////////////		
		 bussinessLogic.saveData(pi);
		 Logger.LogMessage("Main.validateData end");
		 
	}
	
	public static void main(String args[])
	{
		Logger.LogMessage("Main.main is launched started");
		launch(args);
		Logger.LogMessage("Main.main is ended");
	}
}

package org.panelcoder.dataaccesslayer;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.panelcoder.dataaccesslayer.contract.IDataAccess;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DataAccess implements IDataAccess {

	public boolean registerDataOfApplication(HttpServletRequest request)
	{
		//////////////////////////// USING HIBERNATE////////////////////////
		PatientLog p = new PatientLog();
//		p.setUUID(Long.parseLong(request.getParameter("uid")));
		p.setFirstname(request.getParameter("firstname"));
		p.setLastname(request.getParameter("lastname"));
		p.setAge(Long.parseLong(request.getParameter("age")));
		p.setGender(request.getParameter("gender"));
		p.setDob(request.getParameter("dob"));
		p.setHeight(request.getParameter("height"));
		p.setWheight(Long.parseLong(request.getParameter("weight")));
		p.setBirthday(request.getParameter("birthday"));
		p.setAddress(request.getParameter("address"));
		p.setAadhaarno(Long.parseLong(request.getParameter("aadhaarno")));
		p.setMobilenumber(Long.parseLong(request.getParameter("mobilenumber")));
		p.setMailid(request.getParameter("mailid"));
		p.setStudytype(request.getParameter("studytype"));

		// StudyType s=new StudyType();
		//
		// s.setStudyno(1);
		// s.setStudyno(2);
		// s.setStudyno(3);
		// s.setStudytype("Coronary");
		// s.setStudytype("Pediatric");
		// s.setStudytype("Electrophysiology");

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(p);
		// session.save(s);
		session.getTransaction().commit();

		////////////////////////////////////////// USING SPRING
		////////////////////////////////////////// FRAMEWORK////////////////////////////////

		// BeanFactory factory=new XmlBeanFactory(new
		// FileSystemResource("patient.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("patient.xml");
		PatientLog d = (PatientLog) context.getBean("name");
		System.out.println(d.getUUID());

		//////////////////////////////// USING J2EE////////////////////////
		// long uid=Long.parseLong(request.getParameter("uid"));
		// String firstname=request.getParameter("firstname");
		// String lastname=request.getParameter("lastname");
		// long age=Long.parseLong(request.getParameter("age"));
		// String gender=request.getParameter("gender");
		// String dob=request.getParameter("dob");
		// String height=request.getParameter("height");
		// long weight=Long.parseLong(request.getParameter("weight"));
		// String birthday=request.getParameter("birthday");
		// String address=request.getParameter("address");
		// long aadhaarno=Long.parseLong(request.getParameter("aadhaarno"));
		// long
		// mobilenumber=Long.parseLong(request.getParameter("mobilenumber"));
		// String mailid=request.getParameter("mailid");
		// String studytype=request.getParameter("studytype");
		return false;

		// String connectionString =
		// "jdbc:sqlserver://localhost:1433;database=pcidb;user=sa;password=sa";
		// Connection conn=null;
		// try
		// {
		//
		// Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
		// conn=DriverManager.getConnection(connectionString);
		// Statement selectStudyNoStatement = conn.createStatement();
		// ResultSet rsStudyNo =
		// selectStudyNoStatement.executeQuery(String.format("select studyno
		// from studytype where studytype='%1$s'",
		// request.getParameter("studytype")));
		// rsStudyNo.next();
		// int studyNo=rsStudyNo.getInt(1);
		// System.out.println(studyNo);
		// String insertFormat="insert into
		// patientlog(UUID,FirstName,LastName,Age,Gender,DOB,Height,Wheight,BirthDay,Addres,Aadhaarno,MobileNumber,MailId,StudyType)
		// values('%1$s','%2$s','%3$s','%4$s','%5$s','%6$s','%7$s','%8$s','%9$s','%10$s','%11$s','%12$s','%13$s','%14$s')";
		// String resultSet=String.format(insertFormat,uid,
		// firstname,lastname,age,gender,ConvertDate1(dob),height.replace("'",
		// "''"),weight,birthday,address,aadhaarno,mobilenumber,mailid,studyNo);
		// System.out.println(resultSet);
		// Statement table = conn.createStatement();
		// table.execute(resultSet);
		//// ResultSet rs = table.executeQuery("select * from patientlog");
		//// // Retrieve from ResultSet and display column data
		////// while (rs.next())
		////// {
		////
		////// System.out.println (rs.getInt(1) + " " + rs.getString(2) + " " +
		// rs.getInt(3) + " " + rs.getString(4) + " " + rs.getString(5));
		////////
		//////// }
		// System.out.println(resultSet);
		// System.out.println("registerd succesfully");
		// conn.close();
		// return true;
		// }
		// catch(Exception ex)
		// {
		//
		// System.out.println(ex.toString());
		// return false;
		// }
		//
		// }
		//
		// public String ConvertDate1(String dob)
		// {
		// String format = "dd/mm/yyyy";
		// SimpleDateFormat sdf = new SimpleDateFormat(format);
		// try
		// {
		// Date dt = sdf.parse(dob);
		// SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-mm-dd");
		// return sdf1.format(dt);
		// }
		// catch(Exception ex)
		// {
		// System.out.println(ex.toString());
		// }
		// return null;
	}

}
package org.panelcoder.dataaccesslayer;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
public class PatientLog 
{
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private long UUID;
	
	@Size(min=6, max=30)
	private String firstname;
	
	@Size(min=0, max=1)
	private String lastname;
	private long age;
	
	@IsValidGender
	private String gender;
	
	
	private String dob;
	
	private String height;
	private long Wheight;
	private String birthday;
	
	
	private String address;
	
	
	private long aadhaarno;
	
	
	private long mobilenumber;
	
	
	private String mailid;
	private String studytype;
	
	@Embedded
	private Address patientAddress;
	public Address getPatientAddress() {
		return patientAddress;
	}
	public void setPatientAddress(Address patientAddress) {
		this.patientAddress = patientAddress;
	}
	/**
	 * @return the uid
	 */
	public long getUUID() 
	{
		return UUID;
	}
	public void setUUID(long uUID) 
	{
		UUID = uUID;
	}
	public String getFirstname() 
	{
		return firstname;
	}
	public void setFirstname(String firstname)
	{
		this.firstname = firstname;
	}
	public String getLastname() 
	{
		return lastname;
	}
	public void setLastname(String lastname) 
	{
		this.lastname = lastname;
	}
	public long getAge() 
	{
		return age;
	}
	public void setAge(long age) 
	{
		this.age = age;
	}
	public String getGender() 
	{
		return gender;
	}
	public void setGender(String gender) 
	{
		this.gender = gender;
	}
	public String getDob()
	{
		return dob;
	}
	public void setDob(String dob) 
	{
		this.dob = dob;
	}
	public String getHeight() 
	{
		return height;
	}
	public void setHeight(String height) 
	{
		this.height = height;
	}
	public long getWheight() 
	{
		return Wheight;
	}
	public void setWheight(long Wheight) 
	{
		this.Wheight = Wheight;
	}
	public String getBirthday() 
	{
		return birthday;
	}
	public void setBirthday(String birthday)
	{
		this.birthday = birthday;
	}
	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public long getAadhaarno()
	{
		return aadhaarno;
	}
	public void setAadhaarno(long aadhaarno) 
	{
		this.aadhaarno = aadhaarno;
	}
	public long getMobilenumber() 
	{
		return mobilenumber;
	}
	public void setMobilenumber(long mobilenumber)
	{
		this.mobilenumber = mobilenumber;
	}
	public String getMailid() 
	{
		return mailid;
	}
	public void setMailid(String mailid) 
	{
		this.mailid = mailid;
	}
	public String getStudytype() 
	{
		return studytype;
	}
	public void setStudytype(String studytype)
	{
		this.studytype = studytype;
	}
	
}



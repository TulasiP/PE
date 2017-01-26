package org.panelcoder.dataaccesslayer;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PatientLog 
{
	@Id
	private long UUID;
	private String firstname;
	private String lastname;
	private long age;
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



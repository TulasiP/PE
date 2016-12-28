package org.patientexplorer;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudyType 
{
		@Id
		private int studyno;
		private String studytype;
		
		public int getStudyno() 
		{
			return studyno;
		}
		public void setStudyno(int studyno) 
		{
			this.studyno = studyno;
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


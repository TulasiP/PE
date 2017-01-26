package org.panelcoder.businesslogiclayer.contract;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.panelcoder.dataaccesslayer.PatientLog;

public interface IBusinessLogic
{
	public void validateUid(Map<String, String> request);
	public void validateFirstname(Map<String, String> request);
	public void validateLastname(Map<String, String> request);
	public void validateAge(Map<String, String> request);
	public void validateGender(Map<String, String> request);
	public void validateDob(Map<String, String> request);
	public boolean validateHeight(Map<String, String> request);
	public void validateWeight(Map<String, String> request);
	public void validateBirthday(Map<String, String> request);
	public void validateAddress(Map<String, String> request);
	public void validateAadhaarno(Map<String, String> request);
	public void validateMobilenumber(Map<String, String> request);
	public void validateMailid(Map<String, String> request);
	public void validateStudytype(Map<String, String> request);
	public PatientLog registerDataOfApplication(Map<String, String> request);
}
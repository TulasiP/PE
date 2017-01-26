package org.panelcoder.businesslogiclayer.contract;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IBusinessLogic
{
	public void validateUid(HttpServletRequest request, HttpServletResponse response);
	public void validateFirstname(HttpServletRequest request, HttpServletResponse response);
	public void validateLastname(HttpServletRequest request, HttpServletResponse response);
	public void validateAge(HttpServletRequest request, HttpServletResponse response);
	public void validateGender(HttpServletRequest request, HttpServletResponse response);
	public void validateDob(HttpServletRequest request, HttpServletResponse response);
	public boolean validateHeight(HttpServletRequest request, HttpServletResponse response);
	public void validateWeight(HttpServletRequest request, HttpServletResponse response);
	public void validateBirthday(HttpServletRequest request, HttpServletResponse response);
	public void validateAddress(HttpServletRequest request, HttpServletResponse response);
	public void validateAadhaarno(HttpServletRequest request, HttpServletResponse response);
	public void validateMobilenumber(HttpServletRequest request, HttpServletResponse response);
	public void validateMailid(HttpServletRequest request, HttpServletResponse response);
	public void validateStudytype(HttpServletRequest request, HttpServletResponse response);
	public boolean registerDataOfApplication(HttpServletRequest request);
}
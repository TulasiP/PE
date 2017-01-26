package org.panelcoder.dataaccesslayer.contract;

import javax.servlet.http.HttpServletRequest;

import org.panelcoder.dataaccesslayer.PatientLog;

public interface IDataAccess
{
	public PatientLog registerDataOfApplication(HttpServletRequest request);
}
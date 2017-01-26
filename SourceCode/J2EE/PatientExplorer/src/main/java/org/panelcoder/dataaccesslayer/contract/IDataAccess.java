package org.panelcoder.dataaccesslayer.contract;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.panelcoder.dataaccesslayer.PatientLog;

public interface IDataAccess
{
	public PatientLog registerDataOfApplication(Map<String, String> request);
}
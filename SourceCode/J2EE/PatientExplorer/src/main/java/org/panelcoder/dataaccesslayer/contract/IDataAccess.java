package org.panelcoder.dataaccesslayer.contract;

import javax.servlet.http.HttpServletRequest;

public interface IDataAccess
{
	public boolean registerDataOfApplication(HttpServletRequest request);
}
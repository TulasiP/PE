package org.panelcoder.presentationlayer;

import org.panelcoder.businesslogiclayer.BusinessLogic;
import org.panelcoder.dataaccesslayer.PatientLog;
import org.panelcoder.presentationlayer.contract.IPresentation;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/patientservlet")
public class Presentation extends AbstractController 
{
	private static final long serialVersionUID = 1L;

//	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//		HttpSession session = request.getSession();
//
//		// session.invalidate();
//		BusinessLogic bussinessLogic = new BusinessLogic();
//		bussinessLogic.validateUid(request, response);
//		bussinessLogic.validateFirstname(request, response);
//		bussinessLogic.validateLastname(request, response);
//		bussinessLogic.validateAge(request, response);
//		bussinessLogic.validateGender(request, response);
//		bussinessLogic.validateDob(request, response);
//		boolean result = bussinessLogic.validateHeight(request, response);
//		if (result == false) {
//			session.setAttribute("valid", 20);
//			request.getRequestDispatcher("/patientdata.jsp").forward(request, response);
//			return;
//		}
//		bussinessLogic.validateWeight(request, response);
//		bussinessLogic.validateBirthday(request, response);
//		bussinessLogic.validateAddress(request, response);
//		bussinessLogic.validateAadhaarno(request, response);
//		bussinessLogic.validateMobilenumber(request, response);
//		bussinessLogic.validateMailid(request, response);
//		bussinessLogic.validateStudytype(request, response);
//
//		boolean saveResult = bussinessLogic.registerDataOfApplication(request);
//		if (saveResult == true) {
//			// successfully stored in database
//			session.setAttribute("valid", 38);
//
//		} else {
//			session.setAttribute("valid", 39);
//		}
//		request.getRequestDispatcher("/patientdata.jsp").forward(request, response);

		// registerDataOfApplication(request);
		// PrintWriter out=response.getWriter();
		//// out.println("tulasi");
		//// System.out.println(firstname);
		//
		// HttpSession session=request.getSession();
		// session.setAttribute("uid", uid);
		// session.setAttribute("firstname", firstname);
		// session.setAttribute("lastname", lastname);
		// session.setAttribute("age", age);
		// session.setAttribute("gender", gender);
		// session.setAttribute("dob", dob);
		// session.setAttribute("height", height);
		// session.setAttribute("weight", weight);
		// session.setAttribute("birthday", birthday);
		// session.setAttribute("address", address);
		// session.setAttribute("aadhaarno", aadhaarno);
		// session.setAttribute("mobilenumber", mobilenumber);
		// session.setAttribute("mailid", mailid);
		// session.setAttribute("studytype", studytype);
		// getServletContext().getRequestDispatcher("/patientreceiving.jsp").forward(request,
		//// response);

//	}

		@Override
			protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception 
			{
		
				// session.invalidate();
//				HttpSession session = request.getSession();
//				BusinessLogic bussinessLogic = new BusinessLogic();
//				bussinessLogic.validateUid(request, response);
//				bussinessLogic.validateFirstname(request, response);
//				bussinessLogic.validateLastname(request, response);
//				bussinessLogic.validateAge(request, response);
//				bussinessLogic.validateGender(request, response);
//				bussinessLogic.validateDob(request, response);
//				boolean result = bussinessLogic.validateHeight(request, response);
//				if (result == false) 
//				{
//					session.setAttribute("valid", 20);
//					request.getRequestDispatcher("/patientdata.jsp").forward(request, response);
//					
//				}
//				bussinessLogic.validateWeight(request, response);
//				bussinessLogic.validateBirthday(request, response);
//				bussinessLogic.validateAddress(request, response);
//				bussinessLogic.validateAadhaarno(request, response);
//				bussinessLogic.validateMobilenumber(request, response);
//				bussinessLogic.validateMailid(request, response);
//				bussinessLogic.validateStudytype(request, response);
//
//				boolean saveResult = bussinessLogic.registerDataOfApplication(request);
//				if(saveResult == true) {
//					// successfully stored in database
//					session.setAttribute("valid", 38);
//
//				} else {
//					session.setAttribute("valid", 39);
//				}
//				request.getRequestDispatcher("/patientdata.jsp").forward(request, response);
		
				ModelAndView model = new ModelAndView("patientdata");
				model.addObject("welcomemessage");
				return model;
		// return null;
	}
}

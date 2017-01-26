
package org.panelcoder.presentationlayer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.panelcoder.businesslogiclayer.BusinessLogic;
import org.panelcoder.dataaccesslayer.PatientLog;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class SubmittedController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		HttpSession session = request.getSession();
		BusinessLogic bussinessLogic = new BusinessLogic();
		//bussinessLogic.validateUid(request, response);
		bussinessLogic.validateFirstname(request, response);
		bussinessLogic.validateLastname(request, response);
		bussinessLogic.validateAge(request, response);
		bussinessLogic.validateGender(request, response);
		bussinessLogic.validateDob(request, response);
		boolean result = bussinessLogic.validateHeight(request, response);
		if (result == false) {
			session.setAttribute("valid", 20);
		}

		bussinessLogic.validateWeight(request, response);
		bussinessLogic.validateBirthday(request, response);
		bussinessLogic.validateAddress(request, response);
		bussinessLogic.validateAadhaarno(request, response);
		bussinessLogic.validateMobilenumber(request, response);
		bussinessLogic.validateMailid(request, response);
		bussinessLogic.validateStudytype(request, response);

		PatientLog saveResult = bussinessLogic.registerDataOfApplication(request);
//		if (saveResult == true) {
//			// successfully stored in database
//			session.setAttribute("valid", 38);
//
//		} else {
//			session.setAttribute("valid", 39);
//		}
//
//		PatientLog pl = new PatientLog();

		ModelAndView model = new ModelAndView("submittedsuccessfully");
		model.addObject("patientLog", saveResult);
		return model;
		// return null;

	}

}

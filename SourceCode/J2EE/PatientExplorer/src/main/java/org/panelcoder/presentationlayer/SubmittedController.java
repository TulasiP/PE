
package org.panelcoder.presentationlayer;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.panelcoder.businesslogiclayer.BusinessLogic;
import org.panelcoder.dataaccesslayer.DataAccess;
import org.panelcoder.dataaccesslayer.PatientLog;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller
public class SubmittedController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder)
	{
		binder.setDisallowedFields(new String[] {"UUID"});
	}
	
	@RequestMapping(value = "/patientisregisterdsuccessfully", method = RequestMethod.POST)
	public ModelAndView formSubmission(@Valid @ModelAttribute("pl") PatientLog pl, BindingResult result) {

		if(result.hasErrors())
		{
			ModelAndView model = new ModelAndView("patientdata");
			return model;
		}
		// HttpSession session = request.getSession();
		DataAccess data = new DataAccess();
		PatientLog log = data.registerDataOfApplication(pl);
		BusinessLogic bussinessLogic = new BusinessLogic();
		// bussinessLogic.validateUid(request, response);
		// bussinessLogic.validateFirstname(request);
		// bussinessLogic.validateLastname(request);
		// bussinessLogic.validateAge(request);
		// bussinessLogic.validateGender(request);
		// bussinessLogic.validateDob(request);
		// boolean result = bussinessLogic.validateHeight(request);
		// if (result == false) {
		// //session.setAttribute("valid", 20);
		// }
		//
		// bussinessLogic.validateWeight(request);
		// bussinessLogic.validateBirthday(request);
		// bussinessLogic.validateAddress(request);
		// bussinessLogic.validateAadhaarno(request);
		// bussinessLogic.validateMobilenumber(request);
		// bussinessLogic.validateMailid(request);
		// bussinessLogic.validateStudytype(request);

		// PatientLog saveResult =
		// bussinessLogic.registerDataOfApplication(request);
		// if (saveResult == true) {
		// // successfully stored in database
		// session.setAttribute("valid", 38);
		//
		// } else {
		// session.setAttribute("valid", 39);
		// }
		//
		// PatientLog pl = new PatientLog();

		ModelAndView model = new ModelAndView("submittedsuccessfully");
		model.addObject("patientLog", log);
		return model;
		// return null;

	}

}

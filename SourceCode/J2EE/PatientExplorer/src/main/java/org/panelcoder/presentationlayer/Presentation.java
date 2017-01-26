package org.panelcoder.presentationlayer;

import org.panelcoder.businesslogiclayer.BusinessLogic;
import org.panelcoder.presentationlayer.contract.IPresentation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet("/patientservlet")

@Controller
public class Presentation
{
	@RequestMapping("/patient")
	public ModelAndView patientRegistration()
	{
		ModelAndView model = new ModelAndView("patientdata");
		model.addObject("welcomemessage");
		return model;
		
	}
}

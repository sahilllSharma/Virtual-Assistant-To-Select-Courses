package com.windsor.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RestController
public class ControllerTest {
	@Autowired
	FormDataInsertion fdi;
	@Autowired
	ContactUsImplementation cui;
	
	
    @RequestMapping("/welcome")
	public ModelAndView alien()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index.html");
		return mv;
		
	}
    @RequestMapping("/submitPage")
   	public ModelAndView pageSubmit(HttpServletRequest request)
   	{
    	
   		ModelAndView mv1=new ModelAndView();
   		
   		String fname=request.getParameter("fname");
   		FormSubmission fb=new FormSubmission();
   		String lname=request.getParameter("lname");
   		String phone=request.getParameter("phone");
   		String email=request.getParameter("email");
   		String application=request.getParameter("application");
   		fb.setLname(lname);
        fb.setFname(fname);
        fb.setEmail(email);
        fb.setPhone(phone);
        fb.setApplication(application);
        mv1.addObject("object", fb);
        fdi.save(fb);
   		mv1.setViewName("blog.html");
   		return mv1;
   	}
    @RequestMapping("/contactus")
   public ModelAndView contactUs(HttpServletRequest request)
    {
    	
    	ModelAndView mv2=new ModelAndView();
    	
    	ContactUs contactus=new ContactUs();
    	String message=request.getParameter("message");
    	String name=request.getParameter("name");
    	String email=request.getParameter("email");
    	String subject=request.getParameter("subject");
    	contactus.setEmail(email);
    	contactus.setMessage(message);
    	contactus.setName(name);
    	contactus.setSubject(subject);
    	cui.save(contactus);
    	mv2.setViewName("ThanksConnect.html");
    	return mv2;
    }
	
}

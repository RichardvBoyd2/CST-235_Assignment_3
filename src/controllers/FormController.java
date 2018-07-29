package controllers;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import beans.User;
import business.MyTimerService;
import business.OrdersBusinessInterface;

@ManagedBean

public class FormController {
	
	@Inject
	OrdersBusinessInterface services;
	
	@EJB
	MyTimerService timer;
	
	public String onSubmit() {
		
		FacesContext context = FacesContext.getCurrentInstance();
		User user = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class);
		//console tells use which service file is selected
		services.test();
		//Start timer
		timer.setTimer(10000);
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		
		
		
		return "TestResponse.xhtml";
	}
	
	public OrdersBusinessInterface getService() {
		
	return services;
	}
	
}

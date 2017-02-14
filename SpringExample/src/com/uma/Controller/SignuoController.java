package com.uma.Controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uma.DAO.SignupDAO;
import com.uma.Model.SignUpDTO;

@Component
@RequestMapping("/")
public class SignuoController {

	SignupDAO dao=new SignupDAO();
	
	public void signupController()
	{
		System.out.println(this.getClass().getSimpleName()+" is Created..");
	}
	@RequestMapping(value="/signup.do")
	public String saveInfo(SignUpDTO dto)
	{
		System.out.println("Inside Signup method");
		dao.saveInfo(dto);
		return "/Success.jsp";
	}
	
}

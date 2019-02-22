package com.jou.frontcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jou.model.Employee;

@Controller
public class FrontController {
	
	
	@RequestMapping("/")
	public String goHome(Model model) {
		
		Employee employee = new Employee();
		employee.setEmployeeId("DE0112544");
		employee.setEmployeeName("Raganira pojirin");
		employee.setData1("3/45 knarmwongwan road 11120 nonthaburi");
		employee.setData2("amght233444@gmail.com");
		employee.setData3("012544700000089");
		
		String msg1 = "spring JSF Integration test";
		
		model.addAttribute("employee", employee);
		model.addAttribute("msg1", msg1);

		return "index";
	}
	
	@RequestMapping("/about")
	public String goAbout() {
		return "about";
	}
	
	
	@RequestMapping("/emp")
	public String goEmpTable() {
		return "emptable";
	}
	
	@RequestMapping("/w3ajax1")
	public String goW3ajax1() {
		return "w3ajax1";
	}
	
	@RequestMapping("/lesson1")
	public String goLesson1() {
		return "lesson1";
	}	
	
	@RequestMapping(value="/w3ajax1", method=RequestMethod.GET,params={"fg2"})
	public String goW3ajax1_requestfg2(HttpServletRequest request) {
		String fg3 = request.getParameter("fg2");
		System.out.println("Show fg3 : "+fg3);
		System.out.println("Invoking request FG2 =============");
		return "w3ajax1";
	}
	
	@RequestMapping(value="/w3ajax1", method=RequestMethod.GET, params= {"fname","lname"})
	public String goW3_2Params(HttpServletRequest request , HttpServletResponse response) {
		String $fname = request.getParameter("fname");
		String $lname = request.getParameter("lname");
		System.out.println("Name :"+$fname+" Lname:"+$lname);
		String date1 = "12/10/2018"; 
		request.setAttribute("date1", date1);
		return "w3ajax1";
	}
	
}

package team2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LeadController {
	
	@RequestMapping("/")
	public String saveLead() {
		
		return "index";
	}
	@RequestMapping("/savelead")
    public String getLead(@RequestParam("firstName") String firstName,@RequestParam("lastName") String lastName,@RequestParam("email") String email,@RequestParam("mobile") String mobile,ModelMap model) {
		
		model.addAttribute("firstName",firstName);
		model.addAttribute("lastName",lastName);
		model.addAttribute("email",email);
		model.addAttribute("mobile",mobile);
		return "view";
	}
}

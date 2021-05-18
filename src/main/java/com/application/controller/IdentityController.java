package com.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.application.model.Identity;

@Controller
public class IdentityController {
	
	@GetMapping("/identity")
	  public String identityForm(Model model) {
	    model.addAttribute("identity", new Identity());
	    return "identity";
	  }

	  @PostMapping("/identity")
	  public String identitySubmit(@ModelAttribute Identity identity, Model model) {
	    model.addAttribute("identity", identity);
	    return "result";
	  }
	
}

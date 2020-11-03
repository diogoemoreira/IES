package pt.lab2_3.SpringBoot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="user", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("user", name);
		return "greeting";
	}

}

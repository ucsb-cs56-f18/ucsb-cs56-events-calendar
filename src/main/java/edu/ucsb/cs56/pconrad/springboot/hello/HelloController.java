package edu.ucsb.cs56.pconrad.springboot.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

	@RequestMapping("/events")
    public String page1() {
        return "Events";
    }

	@RequestMapping("/submitEvent")
	public String page2() {
        return "Submit Your Own Event";
    }

	@RequestMapping("/faq")
	public String page3() {
        return "faq";
    }

	
}

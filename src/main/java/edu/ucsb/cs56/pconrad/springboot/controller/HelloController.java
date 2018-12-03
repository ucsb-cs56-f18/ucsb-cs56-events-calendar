package edu.ucsb.cs56.pconrad.springboot.controller;

import edu.ucsb.cs56.pconrad.springboot.bean.Event;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/events")
    public ModelAndView page1() {
        List<Event> events = new List<Event>;
        events.add(new Event("Name1", "Location1", "Date1"));
        events.add(new Event("Name2", "Location2", "Date2"));

        Map<String, Object> params = new HashMap<>();
        params.put("events", events);

        return new ModelAndView("events", events);
    }

    @RequestMapping("/submitEvent")
    public String page2() {
        return "submitEvent";
    }

    @RequestMapping("/faq")
	public String page3() {
        return "faq";
    }
}

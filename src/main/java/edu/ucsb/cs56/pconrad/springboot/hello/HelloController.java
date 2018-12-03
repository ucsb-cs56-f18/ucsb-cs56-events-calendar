package edu.ucsb.cs56.pconrad.springboot.hello;

import edu.ucsb.cs56.pconrad.springboot.bean.Event;
import edu.ucsb.cs56.pconrad.springboot.hello.ToJava;

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
        List<Event> events;
        try {
            events = ToJava.eventsAsList();
        }
        catch(java.io.IOException) {
            //Do something
        }
        catch(java.net.URISyntaxException) {
            //Do something
        }

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

package main.java.edu.ucsb.cs56.pconrad.springboot.hello;

//import main.java.edu.ucsb.cs56.pconrad.springboot.bean.Event;
import main.java.edu.ucsb.cs56.pconrad.springboot.hello.ToJava;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/events")
    public ModelAndView page1() {
        List<Event> events= new ArrayList<Event> ();
        try {
            events = ToJava.eventsToList();
        }
        catch(java.io.IOException e) {
            //Do something
        }
        catch(java.net.URISyntaxException e) {
            //Do something
        }

        Map<String, Object> params = new HashMap<>();
        params.put("events", events);

        return new ModelAndView("events", params);
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

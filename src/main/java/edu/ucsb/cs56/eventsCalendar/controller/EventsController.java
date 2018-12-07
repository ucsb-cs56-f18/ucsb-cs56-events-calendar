package edu.ucsb.cs56.eventsCalendar.controller;

import edu.ucsb.cs56.eventsCalendar.bean.Event;
import edu.ucsb.cs56.eventsCalendar.service.ToJava;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.logging.Logger;

@Controller
public class EventsController {

    private final static Logger LOGGER = Logger.getLogger(EventsController.class.getName());
    //LOGGER.setLevel(Level.INFO);


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
            LOGGER.info("IOException while trying to display events");
        }
        catch(java.net.URISyntaxException e) {
            LOGGER.info("URISyntaxException while trying to display events");
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

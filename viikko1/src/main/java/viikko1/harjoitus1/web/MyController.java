package viikko1.harjoitus1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    // TEHTÄVÄ 1: Controller and endpoints
    @RequestMapping("/index") 
    @ResponseBody
    public String returnMessage() {
        return "This is the main page";
    }
    
    @RequestMapping("/contact") 
    @ResponseBody
    public String returnMessage2() {
        return "This is the contact page";
    }

    // TEHTÄVÄ 2: Request parameters
    @RequestMapping("/hello")
    @ResponseBody 
    public String returnMessage3(@RequestParam String location, @RequestParam String name) {
        return "Welcome to the " + location + " " + name + "!";
    }
}


    

    
    


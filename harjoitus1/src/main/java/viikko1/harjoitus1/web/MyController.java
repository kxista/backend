package viikko1.harjoitus1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

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
}


    

    
    


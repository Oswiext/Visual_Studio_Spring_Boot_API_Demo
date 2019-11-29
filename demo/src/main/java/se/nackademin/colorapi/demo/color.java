package se.nackademin.colorapi.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class color {

    @RequestMapping("/blue")
    public @ResponseBody String greeting(){
        return "green";
    }
    
}
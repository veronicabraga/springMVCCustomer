package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class mainController {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String welcome() {
        return "main";
    }

}

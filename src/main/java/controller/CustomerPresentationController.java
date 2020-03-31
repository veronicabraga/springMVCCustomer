package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerPresentationController {

    @RequestMapping(method = RequestMethod.GET, value = "/customer")
    public String customerInfos(Model model) {

        Customer customer = new Customer();
        customer.setName("Rui");
        customer.setEmail("rui.ferrao@gmail.com");
        customer.setPhone("99887766");

        model.addAttribute("customer", customer);

        return "customerPresentation";
    }
}

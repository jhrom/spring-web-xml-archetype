#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ${package}.services.UserService;

@Controller
public class HelloWorldController {

    public static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/")
    public String helloWorld(Model model) {
        logger.info("Welcome in hello world controller");

        model.addAttribute(model.addAttribute("users", userService.findAllUsers()));
        return "index";
    }

}

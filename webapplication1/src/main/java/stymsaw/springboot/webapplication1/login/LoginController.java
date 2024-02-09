package stymsaw.springboot.webapplication1.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {


    @RequestMapping("login")
    public String gotoLoginPage(@RequestParam String name) {
        System.out.println(name);
        return "login";
    }

}

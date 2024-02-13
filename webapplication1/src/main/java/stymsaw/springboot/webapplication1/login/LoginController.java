package stymsaw.springboot.webapplication1.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {


    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String gotoLoginPage() {
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String gotoWelcomePage(
            @RequestParam String name,
            @RequestParam String password,
            ModelMap modelMap
    ) {
        if (authenticationService.authenticate(name, password)) {
            modelMap.put("name", name);
            modelMap.put("password", password);
            return "welcome";
        }
        modelMap.put("error","Invalid password, please try again with right credentails");
        return "login";
    }

}

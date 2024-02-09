package stymsaw.springboot.webapplication1.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String name, String password) {
        return name.equalsIgnoreCase("stym") && password.equalsIgnoreCase("root");
    }

}

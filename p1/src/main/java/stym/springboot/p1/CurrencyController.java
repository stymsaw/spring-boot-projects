package stym.springboot.p1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CurrencyController {

    @Autowired
    CurrencyConfiguration currencyConfiguration;

    @RequestMapping("/currency-service")
    public CurrencyConfiguration retrieveAllCourses() {

        return currencyConfiguration;

    }

}

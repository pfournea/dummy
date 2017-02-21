package be.pfournea.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Peter on 21/02/2017.
 */
@RestController
public class ApplicationController {
    @RequestMapping(name = "/hello", method = RequestMethod.GET)
    public String helloWorld() {
        return "Hello World!";
    }
}

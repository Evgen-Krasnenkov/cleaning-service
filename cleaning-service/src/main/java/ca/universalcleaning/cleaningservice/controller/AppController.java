package ca.universalcleaning.cleaningservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

    @RequestMapping(value = {"/"})
    public String root() {
        return "index.html";
    }
}

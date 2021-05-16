package com.example.noaa_2017_version_1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    //Display index.html
    @RequestMapping("/index")
    public String index() {
        return "index";
    }

}

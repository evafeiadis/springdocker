package com.efthimis.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by efthimis on 21/7/2017.
 */

@RestController
public class helloController {

    @RequestMapping("/")
    public String hi(){
        return "hi motherfuckers";


    }


}

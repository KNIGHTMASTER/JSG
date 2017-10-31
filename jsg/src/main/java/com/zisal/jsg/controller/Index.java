package com.zisal.jsg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created on 11/9/2016
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Controller
public class Index {

    @RequestMapping("/index")
    public String showIndex(){
        return "index";
    }
}

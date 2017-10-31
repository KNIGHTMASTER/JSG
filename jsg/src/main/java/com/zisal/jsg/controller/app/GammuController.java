package com.zisal.jsg.controller.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

/**
 * created on 11/10/2016
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Controller
public class GammuController {

    @Value("${path.gammu}")
    String pathGammu;

    @Value("${path.config.file}")
    String pathConfigFile;

    @RequestMapping("/gammu/path")
    public ModelAndView pathGammu(){
        ModelAndView modelAndView = new ModelAndView();
        System.out.println(pathGammu);
        System.out.println(pathConfigFile);
        modelAndView.setViewName("path-gammu");
        modelAndView.addObject("pathGammu", pathGammu);
        modelAndView.addObject("pathConfigFile", pathConfigFile);
        return modelAndView;
    }

    @RequestMapping("/gammu/sms")
    public String sendSmsSample(){
        Runtime runtime = Runtime.getRuntime();
        try {
            runtime.exec(pathGammu+" -c "+pathConfigFile+" TEXT 081294533238 -text \"Halo Tes Gammu Melalui Java\" ");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "gammu-sms";
    }


}

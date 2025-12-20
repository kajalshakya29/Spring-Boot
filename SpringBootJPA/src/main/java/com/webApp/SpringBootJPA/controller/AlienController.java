package com.webApp.SpringBootJPA.controller;

import com.webApp.SpringBootJPA.dao.AlienRepo;
import com.webApp.SpringBootJPA.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AlienController {
    @Autowired
    AlienRepo alienRepo;

    @RequestMapping("/home")
    public String  home(){
        return "home";
    }

    @RequestMapping("/addAlien")
    public String addAlien(Alien alien){
        alienRepo.save(alien);
        return "home";
    }
    @RequestMapping("/getAlien")
    public ModelAndView getAlien(@RequestParam int aid){
        ModelAndView mv=new ModelAndView("showAlien");
        Alien alien = alienRepo.findById(aid).orElse(new Alien());

        System.out.println(alienRepo.findByTech("java"));
        System.out.println(alienRepo.findByAidGreaterThan(102));
        System.out.println(alienRepo.findByTechSorted("java"));
        mv.addObject(alien);
        return mv;
    }
}

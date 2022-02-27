package com.example.marsoverapi.controller;

import com.example.marsoverapi.entity.MarsRoverApiResponse;
import com.example.marsoverapi.service.MarsRoverApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    private MarsRoverApiService roverApiService;

    @GetMapping("/")
    public String getHomeView(ModelMap model){
//        model.addAttribute("name", "Margulan Aubakirov");
//        model.put("address", "9000 Custer rd.");
        MarsRoverApiResponse roverData = roverApiService.getRoverData("Perseverance");
        model.put("roverData", roverData);
        return "index";
    }
}

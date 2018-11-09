package com.bu.controllers;

import com.bu.dao.AuthorDAO;
import com.bu.entity.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {


    @Autowired
    AuthorDAO authorDAO;


    @GetMapping
    public String index(Model model){
        List<Author> all = authorDAO.findAll();
        model.addAttribute("AllAuthors",all);
        System.out.println( all);
        return "index";
    }

}

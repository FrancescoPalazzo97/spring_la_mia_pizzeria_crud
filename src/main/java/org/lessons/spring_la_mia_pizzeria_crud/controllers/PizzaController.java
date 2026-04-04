package org.lessons.spring_la_mia_pizzeria_crud.controllers;

import java.util.List;

import org.lessons.spring_la_mia_pizzeria_crud.models.Pizza;
import org.lessons.spring_la_mia_pizzeria_crud.repos.PizzaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequestMapping("/pizzas")
public class PizzaController {

    @Autowired
    private PizzaRepo repo;

    @GetMapping
    public String index(Model model) {
        List<Pizza> pizzas = repo.findAll();
        model.addAttribute("pizzas", pizzas);

        return "pizzas/index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") Integer id, Model model) {
        Pizza pizza = repo.findById(id).get();
        model.addAttribute("pizza", pizza);

        return "/pizzas/show";
    }

}

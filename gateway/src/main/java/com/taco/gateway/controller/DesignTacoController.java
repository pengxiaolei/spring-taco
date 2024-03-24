package com.taco.gateway.controller;

import com.taco.gateway.data.repository.IngredientRepository;
import com.taco.gateway.model.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/design")
@SessionAttributes("tacoOrder")
public class DesignTacoController {
    private final IngredientRepository ingredientRepo;

    @Autowired
    public DesignTacoController(IngredientRepository ingredientRepo) {
        this.ingredientRepo = ingredientRepo;
    }

    @GetMapping("/get")
    @ResponseBody
    public String getTacoType(String name) {
        name = "CARN";
        Optional<Ingredient> ingredient = ingredientRepo.findById(name);
        return ingredient.isPresent() ? ingredient.get().getType().toString() : "null";
    }

    @ModelAttribute
    public void addIngredientsToModel(Model model) {
        Iterable<Ingredient> ingredients = ingredientRepo.findAll();
        Ingredient.Type[] types = Ingredient.Type.values();
        for (Ingredient.Type type : types) {
            model.addAttribute(type.toString().toLowerCase());
        }
    }
}

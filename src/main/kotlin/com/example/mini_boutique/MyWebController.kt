package com.example.mini_boutique

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class MyWebController {
    @GetMapping("/")
    public fun home(model: Model): String {
        println("Home page!");
        model.addAttribute("articles", myArticles)
        return "index";
    }

    @GetMapping("/Creation")
    fun creation(creationBean: CreationBean): String {
        println("Creation page!");
        return "addCreation";
    }

    @PostMapping("/addArticle")
    fun addCreation(creationBean: CreationBean, model: Model, @RequestParam(value = "pass", defaultValue = "") pass: String): String {
        var creationStatut: Int

        if (pass == "password") {
            creationStatut = 1;

            // Ajout du nouvel l'article dans le set contenant tous les articles.
            myArticles.add(creationBean)

            // On fait transiter les models du contrôleur a la vue
            model.addAttribute("articles", myArticles)
            model.addAttribute("statut", creationStatut)
            return "index"
        } else {
            creationStatut = 0;

            // On fait transiter le model du contrôleur a la vue
            model.addAttribute("statut", creationStatut)
            return "addCreation"
        }

    }
}
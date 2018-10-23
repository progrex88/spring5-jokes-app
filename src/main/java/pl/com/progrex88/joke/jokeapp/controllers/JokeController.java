package pl.com.progrex88.joke.jokeapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.com.progrex88.joke.jokeapp.services.JokeServices;

import javax.jws.WebParam;

@Controller
public class JokeController {

    private JokeServices jokeServices;
@Autowired
    public JokeController(JokeServices jokeServices) {
        this.jokeServices = jokeServices;
    }
    @RequestMapping({"/", ""})
    public String showJoke(Model model){
    model.addAttribute("joke", jokeServices.getJoke());

        return "chucknorris";
    }
}

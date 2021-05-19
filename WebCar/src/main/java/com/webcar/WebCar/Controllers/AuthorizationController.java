package com.webcar.WebCar.Controllers;

import com.webcar.WebCar.Models.Post;
import com.webcar.WebCar.Repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthorizationController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/authorization")
    public String authoMain(Model model){
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        return "authorization";
    }

    @PostMapping("/authorization")
    public String postAdd(@RequestParam String email,
                          @RequestParam String name,
                          @RequestParam String surname,
                          Model model){
        Post post = new Post(name, surname, email);
        postRepository.save(post);

//        model.addAttribute("posts", posts);
        return "rent";
    }

}

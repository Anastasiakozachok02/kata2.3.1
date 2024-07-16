package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.User;
import web.service.UsersService;

@Controller
public class UsersController {

    private final UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @RequestMapping("/users")
    public String index(Model model) {
        model.addAttribute("users", usersService.getAll());
        return "users";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute("user") User user) {
        usersService.add(user);
        return "redirect:users";
    }

    @GetMapping("/add")
    public String add(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "add";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam("id") Long id) {
        usersService.deleteById(id);
        return "redirect:users";
    }

    @GetMapping("/change")
    public String change(@RequestParam("id") Long id, Model model) {
        User user = usersService.getById(id);
        model.addAttribute("user", user);
        return "change";
    }

    @PostMapping("/change")
    public String change(@ModelAttribute("user") User user) {
        usersService.change(user);
        return "redirect:users";
    }
}


package in.sujal.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import in.sujal.ecommerce.model.User;
import in.sujal.ecommerce.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
  private final UserService userService;
  public UserController(UserService userService){this.userService=userService;}

  @GetMapping("/register")
  public String showRegister(Model m){ m.addAttribute("user", new User()); return "register"; }

  @PostMapping("/register")
  public String doRegister(@ModelAttribute User user){
    user.setRole("USER");
    userService.save(user);
    return "redirect:/user/login";
  }

  @GetMapping("/login")
  public String loginPage(){ return "login"; }

}

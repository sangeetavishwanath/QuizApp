package au.com.example.QuizApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import au.com.example.QuizApp.models.domain.ApplicationUser;
import au.com.example.QuizApp.repositories.ApplicationUserRepository;

@RestController
@RequestMapping("users")
public class UserController {

  @Autowired
  private ApplicationUserRepository userRepository;

  @Autowired
  private BCryptPasswordEncoder bCryptPasswordEncoder; 

  @PostMapping("/sign-up")
  public void signUp(@RequestBody ApplicationUser user) {
    user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
    userRepository.save(user);
  }
}
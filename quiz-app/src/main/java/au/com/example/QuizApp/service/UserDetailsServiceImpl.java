package au.com.example.QuizApp.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import au.com.example.QuizApp.models.domain.ApplicationUser;
import au.com.example.QuizApp.repositories.ApplicationUserRepository;

import static java.util.Collections.emptyList;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

  private ApplicationUserRepository applicationUserRepository;

  public UserDetailsServiceImpl(ApplicationUserRepository applicationUserRepository) {
    this.applicationUserRepository = applicationUserRepository;
  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    ApplicationUser user = applicationUserRepository.findByUsername(username);

    if (user == null) {
      throw new UsernameNotFoundException(username);
    } 

    return new User(user.getUsername(), user.getPassword(), emptyList());
  }
}
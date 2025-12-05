package in.sujal.ecommerce.service;

import org.springframework.stereotype.Service;

import in.sujal.ecommerce.model.User;
import in.sujal.ecommerce.repository.UserRepository;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
  private final UserRepository userRepository;
  public UserServiceImpl(UserRepository userRepository){this.userRepository=userRepository;}

  @Override
  public User save(User user){return userRepository.save(user);}
  @Override
  public Optional<User> findByEmail(String email){return userRepository.findByEmail(email);}
}
package good.stuff.webstore.service;

import good.stuff.webstore.model.user.User;
import good.stuff.webstore.repository.UserRepository;
import good.stuff.webstore.utils.PasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public void registerUser(User user) {
        user.setPassword(PasswordEncoder.hashPassword(user.getPassword()));
        userRepository.save(user);
    }
}

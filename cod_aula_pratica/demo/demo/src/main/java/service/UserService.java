package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.UserRepository;
import resource.UserResource;
import resource.exception.ResourceNotFoundException;
//import resource.excption.ResourceNotFoundException;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = userRepository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));//obj.get();
    }

    public User insert(User obj) {
        return userRepository.save(obj);
    }

    public void delete(Long id) {
        //userRepository.deleteById(id);
        if (!userRepository.existsById(id)) {
            throw new ResourceNotFoundException(id);
        }
        userRepository.deleteById(id);
    }

    public User update(Long id, User obj) {
        //User entity = userRepository.getOne(id);
        //updateData(entity, obj);
        //return userRepository.save(entity);
        try {
            User entity = userRepository.getOne(id);
            updateData(entity, obj);
            return userRepository.save(entity);
        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException(id);
        }
    }

    private void updateData(User entity, User obj) {
        // Atualize os dados conforme necessário
    }
}

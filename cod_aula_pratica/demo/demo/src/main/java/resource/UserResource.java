package resource;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(value = "/users")

public class UserResource {
    // Seu código vai aqui

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @PostMapping
    public User insert(@RequestBody User obj) {
        return userService.insert(obj);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        userService.delete(id);
    }

    @PutMapping("/{id}")
    public User update(@PathVariable Long id, @RequestBody User obj) {
        return userService.update(id, obj);
    }
    
}

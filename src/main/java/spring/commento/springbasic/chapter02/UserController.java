package spring.commento.springbasic.chapter02;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chapter02/user")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public List<User> getUserAll() {
        return userService.getUserAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUser(@PathVariable("id") Long id) {
        User user = userService.getUser(id);
        if (user == null) {
            return ResponseEntity.badRequest().body("error");
        }

        return ResponseEntity.ok().body(user);
    }

    @PutMapping("")
    public ResponseEntity<?> putUser(@RequestBody User user) {
        userService.putUser(user);
        if (user == null) {
            return ResponseEntity.badRequest().body("error");
        }

        return ResponseEntity.ok().body(user);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delUser(@PathVariable("id") Long id) {
       User user = userService.delUser(id);
        if (user == null) {
            return ResponseEntity.badRequest().body("error");
        }

        return ResponseEntity.ok().body(user);
    }

    @PostMapping("/update/{id}")
    public ResponseEntity<?> updateUser(@PathVariable("id") Long id, @RequestBody User user) {
        User user1 = userService.updateUser(id, user);
        if (user1 == null) {
            return ResponseEntity.badRequest().body("error");
        }

        return ResponseEntity.ok().body(user1);
    }
}

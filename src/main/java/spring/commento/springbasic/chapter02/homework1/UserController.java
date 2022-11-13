package spring.commento.springbasic.chapter02.homework1;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.commento.springbasic.chapter02.homework1.service.UserService;

import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/user")
public class UserController {

    private final UserService userService;

    @GetMapping("/{userId}")
    public ResponseEntity<?> findUser(@PathVariable("userId") Long userId) {
        User user = userService.findByUserId(userId);
        if(user == null){
            return new ResponseEntity<>("error", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PostMapping("/{userId}")
    public ResponseEntity<?> addUser(@PathVariable("userId") Long userId, @RequestBody @Valid User user) {
        userService.addUser(userId, user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{userId}")
    public ResponseEntity<?> updateUser(@PathVariable("userId") Long userId, @RequestBody @Valid User user) {
        User updateUser = userService.updateUser(userId, user);
        if(user == null){
            return new ResponseEntity<>("error", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(updateUser, HttpStatus.OK);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<?> deleteUser(@PathVariable("userId") Long userId) {
        User user = userService.deleteUser(userId);
        if(user == null){
            return new ResponseEntity<>("error", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}

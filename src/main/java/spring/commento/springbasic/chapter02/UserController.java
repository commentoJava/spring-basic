package spring.commento.springbasic.chapter02;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/chapter02/hw")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;

    @GetMapping("/user/{id}")
    public ResponseEntity<?> getUser(@PathVariable Long id){
        User user = userService.findUserById(id);
        if (user == null) {
            return ResponseEntity.badRequest()
                .body("error");
        }

        return ResponseEntity.ok()
                .body(user.toString());
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<?> modifyUsername(@PathVariable Long id, @RequestBody User user){
        try {
            userService.modifyUsernameById(id, user.getUsername());
        } catch (NullPointerException e) {
            return ResponseEntity.badRequest()
                    .body("error");
        }

        return ResponseEntity.ok()
                .body("");
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id){
        try {
            userService.deleteUserById(id);
        } catch (NullPointerException e) {
            return ResponseEntity.badRequest()
                    .body("error");
        }

        return ResponseEntity.ok()
                .body("");
    }

    @PostMapping("/user")
    @ResponseStatus(HttpStatus.CREATED)
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }
}

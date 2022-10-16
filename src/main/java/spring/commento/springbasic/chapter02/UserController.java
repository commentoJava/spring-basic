package spring.commento.springbasic.chapter02;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/chapter02/hw")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/user/{id}")
    public ResponseEntity<?> getUser(Long id){
        User user = userService.findUserById(id);
        if (user == null) {
            return ResponseEntity.badRequest()
                .body("error");
        }

        return ResponseEntity.ok()
                .body(user.toString());
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<?> modifyUsername(Long id, String username){
        try {
            userService.modifyUsernameById(id, username);
        } catch (NullPointerException e) {
            return ResponseEntity.badRequest()
                    .body("error");
        }

        return ResponseEntity.ok()
                .body("");
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<?> deleteUser(Long id){
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
    public void addUser(User user){
        userService.addUser(user);
    }
}

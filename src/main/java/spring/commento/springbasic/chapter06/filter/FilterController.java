package spring.commento.springbasic.chapter06.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.commento.springbasic.global.Member;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/chap06/filter")
@Slf4j
public class FilterController {

    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/auth/{id}")
    public String auth(@PathVariable String id){
        return "안녕하세요 " + id + "님";
    }

    @GetMapping("/login")
    public String login(HttpSession session){
        session.setAttribute("member", new Member("member","1234",26));
        return "login";
    }
}

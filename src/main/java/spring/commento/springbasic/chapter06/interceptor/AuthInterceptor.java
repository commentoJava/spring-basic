package spring.commento.springbasic.chapter06.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Slf4j
public class AuthInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("\n ==== 인증 인터셉터가 실행 =====");
        HttpSession session = request.getSession(false);
        if(session == null || session.getAttribute("member") == null){
            log.info("\n 미 인증 사용자의 요청");
            response.sendRedirect("/chap06/interceptor/home");
            return false;
        }
        return true;
    }
}

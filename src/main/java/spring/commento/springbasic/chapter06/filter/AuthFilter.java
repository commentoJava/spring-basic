package spring.commento.springbasic.chapter06.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.PatternMatchUtils;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Slf4j
public class AuthFilter implements Filter {

    private static final String[] checkList = {"/chap06/filter/auth/*"};

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        String requestUri = httpServletRequest.getRequestURI();
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;

        try{
            log.info("\n=== 인증필터 시작 ===");
            if(PatternMatchUtils.simpleMatch(checkList,requestUri)){
                log.info("\n 인증 체크를 실행 합니다");
                HttpSession session = httpServletRequest.getSession(false);

                if(session == null || session.getAttribute("member") == null){
                    log.info("\n 미인증 사용자의 요청입니다");
                    httpServletResponse.sendRedirect("/chap06/filter/home");
                    return; // 더진행하지 않고 끝
                }
            }
            chain.doFilter(request,response);
        }catch(Exception e){
            throw e; // 예외 로깅이 가능하지만 톰캣까지
        }
    }
}

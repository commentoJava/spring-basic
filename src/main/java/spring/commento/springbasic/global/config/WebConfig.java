package spring.commento.springbasic.global.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import spring.commento.springbasic.chapter02.SessionLoginArgumentResolver;
import spring.commento.springbasic.chapter06.filter.AuthFilter;
import spring.commento.springbasic.chapter06.interceptor.AuthInterceptor;

import javax.servlet.Filter;
import java.util.List;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
//        resolvers.add(new SessionLoginArgumentResolver());
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AuthInterceptor())
            .order(1)
            .addPathPatterns("/chap06/interceptor/**")
            .excludePathPatterns("/chap06/interceptor/home","/chap06/interceptor/login");
    }

    //    @Bean
//    public FilterRegistrationBean loginCheckFilter(){
//        FilterRegistrationBean<Filter> filterRegistrationBean = new FilterRegistrationBean<>();
//        filterRegistrationBean.setFilter(new AuthFilter());
//        filterRegistrationBean.addUrlPatterns("/*");
//        filterRegistrationBean.setOrder(1);
//        return filterRegistrationBean;
//    }

}

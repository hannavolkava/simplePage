package com.demosoft.onepage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Andrii_Korkoshko on 9/6/2016.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}


@Configuration
class AppConfiguration extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("forward:/index.html");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
        super.addViewControllers(registry);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
       /* registry.setOrder(-1);
        registry.addResourceHandler("/resources/css*//**").addResourceLocations("/WEB-INF/css/");
        registry.addResourceHandler("/resources/js*//**").addResourceLocations("/WEB-INF/js/");
        registry.addResourceHandler("/resources/angular*//**").addResourceLocations("/WEB-INF/js/angular/");
        registry.addResourceHandler("/resources/html*//**").addResourceLocations("/WEB-INF/html/");
        registry.addResourceHandler("/resources/image*//**").addResourceLocations("/WEB-INF/image/");
        System.out.println("ALLIVE!!!!!!!!!!!!!!");*/
        super.addResourceHandlers(registry);
    }
}
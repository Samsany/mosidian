package io.mosidian.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author ZSY
 * @createTime 2020/6/10 14:27
 */
@Configuration
public class MyWebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        String os = System.getProperty("os.name");
        //  如果是Windows系统
        if (os.toLowerCase().startsWith("win")) {
            //  媒体资源绝对路径
            registry.addResourceHandler("/upload/**").addResourceLocations("file:E://upload/");
        } else {
            //  linux 和mac
            //  媒体资源绝对路径
            registry.addResourceHandler("/upload/**").addResourceLocations("file:/data/www/upload/");
        }
    }

}

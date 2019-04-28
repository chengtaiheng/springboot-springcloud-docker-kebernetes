package springboot.springcloud.docker.kebernetes.front;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @author: 程泰恒
 * @date: 2019/4/24 16:59
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class FrontApplication implements ApplicationRunner {

    @Autowired
    private Environment env;

    public static void main(String[] args) {
        SpringApplication.run(FrontApplication.class, args);
    }

    public void run(ApplicationArguments args) throws Exception {
        System.out.println("url-service"+env.getProperty("url.service"));
    }

    @Configuration
    @PropertySource("classpath:/META-INF/url-dev.properties")
    @Profile("dev")
    public static class Dev{

    }

    @Configuration
    @PropertySource("classpath:/META-INF/url-docker.properties")
    @Profile("docker")
    public static class Docker{

    }

}

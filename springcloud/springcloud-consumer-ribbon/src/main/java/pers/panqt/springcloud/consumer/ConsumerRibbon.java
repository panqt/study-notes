package pers.panqt.springcloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//@EnableDiscoveryClient
public class ConsumerRibbon {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerRibbon.class, args);
    }

}
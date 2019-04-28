package springboot.springcloud.docker.kebernetes.front.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * @author: 程泰恒
 * @date: 2019/4/24 17:03
 */

@FeignClient(
        name = "springboot-springcloud-docker-kebernetes-service",
        url = "${url.service}",
        path = "/service"
)
public interface SpringbootCloudFeignClient {

    @GetMapping("/test")
    public Map<String, Object> testService();

}

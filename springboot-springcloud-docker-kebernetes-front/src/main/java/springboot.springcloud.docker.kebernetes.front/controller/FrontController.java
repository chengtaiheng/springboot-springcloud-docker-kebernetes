package springboot.springcloud.docker.kebernetes.front.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.springcloud.docker.kebernetes.front.client.SpringbootCloudFeignClient;

import java.util.Map;

/**
 * @author: 程泰恒
 * @date: 2019/4/24 17:01
 */

@Slf4j
@RestController
public class FrontController {

    @Autowired
    private SpringbootCloudFeignClient springbootCloudFeignClient;

    @GetMapping("/test")
    public Map<String,Object> responseTest(){
        log.debug("进入测试通道");
        return  springbootCloudFeignClient.testService();
    }

}

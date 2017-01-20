package com.example;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.annotation.Resources;
import java.util.List;

/**
 * Created by abinetsky on 20.01.17.
 */
@FeignClient(name="aaa", url="localhost:8080")
public interface RestClient {

    @RequestMapping(method = RequestMethod.GET, value = "/sticks/search/findByIdIn")
    String sticks(@RequestParam("ids") List<Long> ids);

    @RequestMapping(method = RequestMethod.POST, value = "/sticks")
    String create(@RequestBody Stick stick);


}

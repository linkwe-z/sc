package com.linkwe.service;

import com.linkwe.api.HelloService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by lwz on 2018/2/28.
 * desc:调用
 */
@FeignClient(name="demo-feign-serviceimpl", fallback=FeignServiceFallback.class)
public interface FeignService extends HelloService{  //接口继承接口使用extends

}

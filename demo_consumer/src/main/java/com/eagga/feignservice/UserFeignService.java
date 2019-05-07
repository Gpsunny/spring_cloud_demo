package com.eagga.feignservice;

import com.eagga.api.Api;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * Author:luoyujia
 * Date:2019/5/7
 * Description:todo
 */
@FeignClient(name = "demo-provider", fallback = UserServiceFallback.class)
public interface UserFeignService extends Api {
}

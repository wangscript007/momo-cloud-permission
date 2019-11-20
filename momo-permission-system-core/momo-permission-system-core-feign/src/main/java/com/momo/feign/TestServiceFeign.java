/**
 * Copyright (c) 2018-2019, Jie Li 李杰 (mqgnsds@163.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
//package com.momo.feign;
//
//import com.momo.common.common.JSONResult;
//import com.momo.feign.configuration.FeignConfiguration;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.http.MediaType;
//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
///**
// * @program: momo-cloud-permission
// * @description: TODO
// * @author: Jie Li
// * @create: 2019-07-30 09:56
// **/
//@FeignClient(name = "cloud-spring-server", configuration = {FeignConfiguration.class}, fallback = TestServiceFeign.TestServiceFeignImpl.class)
//public interface TestServiceFeign {
//    @PostMapping(value = "/platform/userInfo/v1", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE}, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
//    public JSONResult getUserInfo(@RequestBody SysUser sysUser);
//
//    @Component
//    @Slf4j
//    static class TestServiceFeignImpl implements TestServiceFeign {
//        @Override
//        public JSONResult getUserInfo(SysUser sysUser) {
//            log.error("feign调用异常:");
//            return JSONResult.errorMap("feign调用异常");
//        }
//    }
//}

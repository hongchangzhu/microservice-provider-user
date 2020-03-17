//package com.netsframe.user.ocnfig;
//
//import feign.Contract;
//import feign.Feign;
//import okhttp3.ConnectionPool;
//import org.springframework.boot.autoconfigure.AutoConfigureBefore;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
//import org.springframework.cloud.netflix.feign.FeignAutoConfiguration;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.concurrent.TimeUnit;
//
//@Configuration
//@ConditionalOnClass(Feign.class)
//@AutoConfigureBefore(FeignAutoConfiguration.class)
//public class FeignConfig {
//    // 注入feignContract
//    @Bean
//    public Contract feignContract() {
//        return new feign.Contract.Default();
//    }
//
//    // 注入自定义的okHttpClient
//    @Bean
//    public okhttp3.OkHttpClient okHttpClient() {
//        return new okhttp3.OkHttpClient.Builder()
//                .readTimeout(60, TimeUnit.SECONDS)
//                .connectTimeout(60, TimeUnit.SECONDS)
//                .writeTimeout(120, TimeUnit.SECONDS)
//                .connectionPool(new ConnectionPool())
//                .build();
//    }
//}

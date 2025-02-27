package com.wapgyj.productservice.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MpConfig {
        @Bean
        public MybatisPlusInterceptor mpInterceptor(){
            MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();
            PaginationInnerInterceptor paginationInnerInterceptor = new PaginationInnerInterceptor();
            paginationInnerInterceptor.setDbType(DbType.MYSQL);
            paginationInnerInterceptor.setMaxLimit(500L);
            mybatisPlusInterceptor.addInnerInterceptor(paginationInnerInterceptor);
            return mybatisPlusInterceptor;
        }

}

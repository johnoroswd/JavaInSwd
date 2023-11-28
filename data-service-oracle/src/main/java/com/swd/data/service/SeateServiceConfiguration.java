package com.swd.data.service;

//import io.seata.spring.annotation.AspectTransactionalInterceptor;
import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SeateServiceConfiguration {
//    @Bean
//    public AspectTransactionalInterceptor aspectTransactionalInterceptor () {
//        return new AspectTransactionalInterceptor();
//    }
//
//    @Bean
//    public Advisor txAdviceAdvisor(AspectTransactionalInterceptor aspectTransactionalInterceptor ) {
//        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
//        pointcut.setExpression("配置切点表达式使全局事务拦截器生效");
//        return new DefaultPointcutAdvisor(pointcut, aspectTransactionalInterceptor);
//    }
}

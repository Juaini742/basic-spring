package com.core.basicspring2.scope;


import com.core.basicspring2.singleton.PrototypeBeanSingleton;
import com.core.basicspring2.singleton.SingletonBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfigScope {

    @Bean
    @Scope("singleton")
    public SingletonBean singeSingletonBean() {
        return  new SingletonBean();
    }

    @Bean
    @Scope("prototype")
    public PrototypeBeanSingleton prototypeBeanSingleton() {
        return  new PrototypeBeanSingleton();
    }
}

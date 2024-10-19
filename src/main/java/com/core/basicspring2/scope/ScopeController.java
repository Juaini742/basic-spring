package com.core.basicspring2.scope;

import com.core.basicspring2.singleton.PrototypeBeanSingleton;
import com.core.basicspring2.singleton.SingletonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScopeController {

    private  final SingletonBean singletonBean;

    @Autowired
    public ScopeController(SingletonBean singletonBean) {
        this.singletonBean = singletonBean;
    }

    @GetMapping("singleton") // http://localhost:8080/singleton
    public String singleton() {
        return  this.singletonBean.getMessage();
    }

    @Autowired
    private PrototypeBeanSingleton prototypeBeanSingleton;

    @GetMapping("/prototype") // http://localhost:8080/prototype
    public String prototype() {
        PrototypeBeanSingleton newPrototypeBeanSingleton = prototypeBeanSingleton;
        return newPrototypeBeanSingleton.getMessage();
    }

}

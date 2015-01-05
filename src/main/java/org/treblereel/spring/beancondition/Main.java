package org.treblereel.spring.beancondition;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by chani on 1/5/15.
 */
@Component
public class Main {

    @Autowired
    UserDao userDao;

    private static final Logger LOG = LoggerFactory.getLogger(Main.class);


    public static void main(String[] args){
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(BeanConditionConfiguration.class);
    }

    /**
     *  lets check
     */
    @PostConstruct
    public void initApp(){
        userDao.addUser();
    }
}



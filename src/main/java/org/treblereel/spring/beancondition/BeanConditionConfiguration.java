package org.treblereel.spring.beancondition;

/**
 * Created by chani on 1/5/15.
 */
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = { "org.treblereel.spring.beancondition" })
public class BeanConditionConfiguration {

    @Bean(name="userDao")
    @Conditional(UserDaoOracleCondition.class)
    public UserDao oracleUserDao(){
        return new UserDaoOracleImpl();
    }

    @Bean(name="userDao")
    @Conditional(UserDaoMysqlCondition.class)
    public UserDao mysqlUserDao(){
        return new UserDaoMysqlImpl();
    }

}

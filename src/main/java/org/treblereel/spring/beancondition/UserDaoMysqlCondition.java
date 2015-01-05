package org.treblereel.spring.beancondition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by chani on 1/5/15.
 */
public class UserDaoMysqlCondition implements Condition {
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return Utils.getPropertyValue("db").equals("mysql");
    }
}

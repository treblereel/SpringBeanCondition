package org.treblereel.spring.beancondition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

/**
 * Created by chani on 1/5/15.
 */

@Repository
public class UserDaoOracleImpl implements UserDao{
    private static final Logger LOG = LoggerFactory.getLogger(UserDaoOracleImpl.class);

    public void addUser() {
        LOG.info("UserDaoOracleImpl.addUser");
    }
}

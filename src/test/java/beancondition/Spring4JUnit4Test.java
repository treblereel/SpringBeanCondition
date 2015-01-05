package beancondition;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.treblereel.spring.beancondition.BeanConditionConfiguration;
import org.treblereel.spring.beancondition.UserDao;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BeanConditionConfiguration.class)
public class Spring4JUnit4Test {
  @Autowired
  private UserDao userDao;
  
  @Test
  public void testUserDao(){
    userDao.addUser();
  }

}

package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testTestUser() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./applicationContext.xml");
        UserDao userDao = applicationContext.getBean("userdao", UserDao.class);
        //调用userDao的方法
        userDao.UserSaying();
    }

    public void testUser() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./applicationContext.xml");             ;
        UserService userService =  applicationContext.getBean("userService", UserService.class)                    ;
        //调用userService的方法
        userService.GetUser();
    }
}

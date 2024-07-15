import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import per.huashao.work3.Collage;
import per.huashao.work3.Student;

public class AppTest  extends TestCase {
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
        return  new TestSuite( AppTest.class );
    }


    @org.junit.Test
    public void text03(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("WEB-INF/applicationContext03.xml");             ;
        Collage collage =  applicationContext.getBean("collage", Collage.class);
        Student student= applicationContext.getBean("student",Student.class);
        System.out.println(collage);
        System.out.println(student);
    }

}

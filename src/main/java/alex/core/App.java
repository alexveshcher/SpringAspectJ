package alex.core;

import alex.deanery.Deanery;
import alex.deanery.IDeanery;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("file:src/main/resources/beans.xml");
        IDeanery d = (IDeanery) context.getBean("deanery") ;
        d.addStudent();
    }
}

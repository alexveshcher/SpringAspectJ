package alex.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("execution(* alex.deanery.IDeanery.addStudent(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("logBefore");
    }



}

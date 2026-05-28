package hw_5.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* hw_5.service.*.*(..))")
    public void logServiceMethods(JoinPoint joinPoint) {

        System.out.println(
                "Method: " +
                        joinPoint.getSignature().getName() +
                        " Args: " +
                        Arrays.toString(joinPoint.getArgs())
        );
    }

}
package top.yms.ui.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SecurityAspect {

    @Autowired
    private AuthService authService;

    @Pointcut("execution(* top.yms.ui.aop.ProductService.delete(..))")
    public void adminOnly(){}

    @Before("adminOnly()")
    public void check() {
        System.out.println("I'm Check Auth before do...");
        authService.checkAccess();
    }

    @After("adminOnly()")
    public void doAfter() {
        System.out.println("doAfter");
    }

    @AfterReturning("adminOnly()")
    public void afterReturn() {
        System.out.println("After Return");
    }

    @AfterThrowing("adminOnly()")
    public void throwExce(){
        System.out.println("AfterThrowExceptoin");
    }

    @Around("adminOnly()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        int x = 10;
        System.out.println("x ==> "+x);
        System.out.println("beforeAround");
        Object obj = pjp.proceed();
        System.out.println("afterAround");

        return obj;
    }
}

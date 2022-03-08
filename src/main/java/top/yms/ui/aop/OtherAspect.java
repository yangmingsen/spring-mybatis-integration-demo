package top.yms.ui.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OtherAspect {

    @Pointcut("execution(* top.yms.tx.AccountService.save())")
    public void pointCut1() {

    }

    @Before("pointCut1()")
    public void before() {
        System.out.println("before do Search");
    }

    @After("pointCut1()")
    public void after() {
        System.out.println("after do Search");
    }

    @AfterReturning("pointCut1()")
    public void whenReturn() {
        System.out.println("return do Search");
    }

    @Around("pointCut1()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {

        System.out.println("beforeAround");
        Object obj = pjp.proceed();
        System.out.println("afterAround");

        return obj;
    }
}

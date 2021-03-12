package top.yms.ui.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
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
        authService.checkAccess();
    }
}

package top.yms.ui.aop;

import org.springframework.stereotype.Component;

@Component
public class AuthService {
    public void checkAccess() {
        String user = CheckUserHolder.get();
        if (!"admin".equals(user)) {
            throw new RuntimeException("权限不够");
        }
    }
}
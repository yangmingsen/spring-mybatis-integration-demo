package top.yms.ui.aop;

import org.springframework.stereotype.Service;

@Service
public class SearchService implements AnyService{

    public void doSearch() {
        System.out.println("I'm SearchService, thanks.");
    }

    @Override
    public String getName() {
        System.out.println("Application get Values");
        return "Hello World";
    }
}

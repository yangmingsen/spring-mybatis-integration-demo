package top.yms.ui.aop;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

    public void delete(long id) {
        System.out.println("delete product");
    }
}

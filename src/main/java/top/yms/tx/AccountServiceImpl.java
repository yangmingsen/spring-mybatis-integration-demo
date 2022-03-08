package top.yms.tx;

import org.springframework.jdbc.core.JdbcTemplate;

public class AccountServiceImpl implements AccountService {

    private JdbcTemplate jdbcTemplate;

    private static String insert_sql = "INSERT INTO `dbtest`.`test`(`id`, `username`, `password`, `time`) VALUES (22, 'newAcct', 'newPass', '2022-01-28 15:09:09')";


    @Override
    public void save() throws RuntimeException {
        System.out.println("==开始执行sql");
        jdbcTemplate.update(insert_sql);
        System.out.println("==结束执行sql");

        System.out.println("==准备抛出异常");
        throw new RuntimeException("==手动抛出一个异常");
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
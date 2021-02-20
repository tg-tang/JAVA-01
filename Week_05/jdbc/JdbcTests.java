package com.tg;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@SpringBootTest class JdbcTests {

    @Test
    void testJDBC() throws SQLException {

        Connection connection = JDBCConfig.getConnection();
        Statement statement = connection.createStatement();
        statement.execute("insert into person (name,age) values ('小明',11)");
        statement.close();
        connection.close();
    }

}

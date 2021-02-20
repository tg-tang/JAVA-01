package com.tg;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCConfig {

    private static Connection con;

    private static String driverClass;
    private static String url;
    private static String user;
    private static String password;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            url = "http://localhost:3306/test";
            user = "root";
            password = "root";

        } catch (Exception e) {
            throw new RuntimeException("数据库连接失败");
        }
    }


    public static Connection getConnection() {
        try {
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public static void close(Connection con, Statement stat) {

        if (stat != null) {
            try {
                stat.close();
            } catch (SQLException ex) {
            }
        }

        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
            }
        }

    }

    public static void close(Connection con, Statement stat, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException ex) {
            }
        }

        if (stat != null) {
            try {
                stat.close();
            } catch (SQLException ex) {
            }
        }

        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
            }
        }

    }

}

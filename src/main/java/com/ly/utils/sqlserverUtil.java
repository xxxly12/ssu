package com.ly.utils;

import java.sql.*;

public class sqlserverUtil {


        private static final String DBDRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";// 驱动类类名

        private static final String DBNAME = "practice";// 数据库名
        //	jdbc:sqlserver://localhost:1433;DatabaseName=school","sa","tjw"
        private static final String DBURL = "jdbc:sqlserver://localhost:1433;DatabaseName="+DBNAME;// 连接URL

        private static final String DBUSER = "sa";// 数据库用户名

        private static final String DBPASSWORD = "nsc123456";// 数据库密码

        private static Connection conn = null;

        private static PreparedStatement ps = null;

        private static ResultSet rs = null;

        /*
         * 获取数据库连接
         */
        public static Connection getConnection() {

            try {

                Class.forName(DBDRIVER);// 注册驱动

                conn = DriverManager.getConnection(DBURL,DBUSER,
                        DBPASSWORD);// 获得连接对象
                System.out.println("成功加载SQL Server驱动程序");
            } catch (ClassNotFoundException e) {// 捕获驱动类无法找到异常

                System.out.println("找不到SQL Server驱动程序");
                System.out.println(e.toString());
                e.printStackTrace();

            } catch (SQLException e) {// 捕获SQL异常

                e.printStackTrace();
            }

            return conn;

        }

    public static void main(String[] args) {
        Connection connection = getConnection();
        String s = "declare @num2 int\n" +
                "exec query_GoodsNum '电视机' ,@num2 output ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(s);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println( resultSet.getString("@num2"));
            }
//            System.out.println(resultSet.toString());
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

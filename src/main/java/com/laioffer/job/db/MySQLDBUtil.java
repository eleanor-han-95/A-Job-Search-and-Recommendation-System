package com.laioffer.job.db;

public class MySQLDBUtil {
    private static final String INSTANCE = "jobproject-instance.cwzevovs8xdh.us-east-2.rds.amazonaws.com";
    private static final String PORT_NUM = "3306";
    private static final String DB_NAME = "jobproject";
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "";
    public static final String URL = "jdbc:mysql://"
            + "jobproject-instance.cwzevovs8xdh.us-east-2.rds.amazonaws.com" + ":" + "3306" + "/" + "jobproject"
            + "?user=" + "admin" + "&password=" + ""
            + "&autoReconnect=true&serverTimezone=UTC";


}

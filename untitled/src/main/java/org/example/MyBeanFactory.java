package org.example;

public class MyBeanFactory {
    public static UserDao createDaoBean(){
        return new UserDao();
    }
}
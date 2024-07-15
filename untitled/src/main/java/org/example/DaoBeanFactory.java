package org.example;

public class DaoBeanFactory {
    public UserDao CreateDaoBean(){
        return new UserDao();
    }
}
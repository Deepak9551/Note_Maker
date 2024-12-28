package com.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class FactoryProvider {
    public static SessionFactory factory;
    // sessionfactory connection type ka jiske  pass  se method session ko create karne ke liye


    // ab ek function banega woh iss sessionFactory ka object banakar return karta hai


    public static SessionFactory getSessionFactory() {

        if(factory == null){
            factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        }
        return factory;
    }

    public void closeFactory(){
        if (factory.isOpen()){
            factory.close();
        }
    }
}
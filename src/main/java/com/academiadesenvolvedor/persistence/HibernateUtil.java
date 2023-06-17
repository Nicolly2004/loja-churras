package com.academiadesenvolvedor.persistence;

import com.academiadesenvolvedor.models.Produto;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.lang.module.Configuration;

public class HibernateUtil {
    private  static SessionFactory sessionFactory;
    static {
        try{
            StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .configure("hibernate.cfg.xml")
                    .build();
            MetadataSources metadataSoucers = new MetadataSources(serviceRegistry);
            metadataSoucers.addAnnotatedClass(Produto.class);
            Metadata metadata = metadataSoucers.buildMetadata();
            sessionFactory = metadata.buildSessionFactory();
        }catch (Exception e){
            System.out.println("Erro ao Iniciar Hinernate:" + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public static  SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}

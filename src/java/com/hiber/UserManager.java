/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hiber;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Elcot
 */
public class UserManager {
    
    SessionFactory factory;
    StandardServiceRegistryBuilder sr;
    
    public UserManager()
    {
        try{
            Configuration con=new Configuration();
            con.configure("hibernate.cfg.xml");
            sr=new StandardServiceRegistryBuilder().applySettings(con.getProperties());
            factory=con.buildSessionFactory(sr.build());
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public boolean isExist(int id,String pwd)
    {
     Session session=null;
     Transaction txn=null;
    int flag=0;
     try{
         session=factory.openSession();
         txn=session.beginTransaction();
         String hql="FROM Customer_det WHERE ID='"+id+"' AND PWD='"+pwd+"'";
         Query query=session.createQuery(hql);
         List list=query.list();
         
         if(!list.isEmpty())
             flag=1;
     }
     catch(Exception e)
     {
         e.printStackTrace();
     }
     finally
     {
         session.close();
         return flag==1;
     }
    }
    
    public Customer_det returndet(int id)
            
    {
        Session session=null;
        Transaction txn=null;
        Customer_det cd=null;
        try{
            session=factory.openSession();
            txn=session.beginTransaction();
            String hql="FROM Customer_det WHERE ID='"+id+"'";
            Query query=session.createQuery(hql);
            List list=query.list();
            Iterator ir=list.iterator();
            cd=(Customer_det) ir.next();
        }
        catch(Exception e)
        {
            e.printStackTrace();;
        }
        finally{
            session.close();
            return cd;
        }
    }

    
}

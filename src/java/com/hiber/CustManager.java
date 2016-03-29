/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Elcot
 */
public class CustManager {
    
    SessionFactory factory;
    StandardServiceRegistryBuilder sr;
     public CustManager()
 {
     try{
         
         Configuration cfg = new Configuration();
         cfg.configure("hibernate.cfg.xml");
         sr=new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());
         factory=cfg.buildSessionFactory(sr.build());
         }
     catch(Exception e)
     {
      e.printStackTrace();
      
     }
     
 }

     public void save(String uname,String pwd,String address,int no_of_units,int amount)
     {
     Session session=null;
     Transaction txn=null;     
     try{
         session =factory.openSession();
         txn=session.beginTransaction();
         
         Customer_det cd= new Customer_det(uname,pwd,address,no_of_units,amount);
         session.save(cd);
         txn.commit();
         
     }
     catch(Exception e)
     {
         e.printStackTrace();
     }
     finally
     {
         session.close();
     }
     }
    
     public boolean updateUnit(int id,int units)
     {
         int amt=0;
        Session session=null;
         Transaction txn=null;
     
         try{
            session =factory.openSession();
            txn=session.beginTransaction();
            Customer_det cd=(Customer_det)session.get(Customer_det.class,id);
            
            cd.setNo_of_units(units);
            
            int unit=cd.getNo_of_units();
            if(unit<=200)
            {
                amt=unit*2;
            }
            else if(unit>=201 && unit<=600)
            {
                amt=unit*4;
            }
            else if(unit>=601)
                        {
                            amt=unit*6;
                        }
            cd.setAmount(amt);
            session.update(cd);
            txn.commit();
            return true;
         }
              catch(Exception e)
     {
         e.printStackTrace();
         return false;
     }
     finally
     {
         session.close();
     }

     }
  /*  public static void main(String args[])
    {
     CustManager obj=new CustManager();
     if(obj.updateUnit(12321, 200))
         System.out.println("Updated");
     else
         System.out.println("Error");
    }*/

    /*public boolean updateUnit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
}

package myproject.hiber.DBCreation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	//flights table - data
      flights flight1=new flights(101,"UKFlyair", "INDIA", "UK", "WEDNESDAY", "24000");
      flights flight2=new flights(102,"HelloAir", "USA", "UK", "SUNDAY", "28000");
      flights flight3=new flights(103,"FlyMe", "UK", "USA", "SUNDAY", "35000");
      flights flight4=new flights(104,"IndFly", "INDIA", "UK", "MONDAY", "34000");
      flights flight5=new flights(105,"Minicp", "INDIA", "UK", "SUNDAY", "26000");
      flights flight6=new flights(106,"NothingSerious", "USA", "INDIA", "SUNDAY", "24000");
      flights flight7=new flights(107,"UKFlyair", "INDAI", "USA", "MONDAY", "37800");
      flights flight8=new flights(108,"HelloAir", "INDIA", "USA", "WEDNESDAY", "35000");
      
      //admin table - data
      admin admin=new admin(1,"admin","123");
     
    //places table - data
      places place1=new places(1,"INDIA","UK");
      places place2=new places(2,"INDIA","USA");
      places place3=new places(3,"USA","UK");
      places place4=new places(4,"UK","USA");
      places place5=new places(5,"USA","INDIA");
   
      //airlines table - data
      airlines airline1=new airlines(1,"UKFlyair");
      airlines airline2=new airlines(2,"HelloAir");
      airlines airline3=new airlines(3,"FlyMe");
      airlines airline4=new airlines(4,"IndFly");
      airlines airline5=new airlines(5,"Minicp");
      airlines airline6=new airlines(6,"NothingSerious");
      
      
      Configuration con1=new Configuration().configure().addAnnotatedClass(flights.class);
      Configuration con2=new Configuration().configure().addAnnotatedClass(admin.class);
      Configuration con3=new Configuration().configure().addAnnotatedClass(places.class);
      Configuration con4=new Configuration().configure().addAnnotatedClass(airlines.class);
      SessionFactory sf1=con1.buildSessionFactory();
      SessionFactory sf2=con2.buildSessionFactory();
      SessionFactory sf3=con3.buildSessionFactory();
      SessionFactory sf4=con4.buildSessionFactory();
      Session session1=sf1.openSession();
      Session session2=sf2.openSession();
      Session session3=sf3.openSession();
      Session session4=sf4.openSession();
      Transaction tx1=session1.beginTransaction();
      Transaction tx2=session2.beginTransaction();
      Transaction tx3=session3.beginTransaction();
      Transaction tx4=session4.beginTransaction();
      session1.save(flight1);
      session1.save(flight2);
      session1.save(flight3);
      session1.save(flight4);
      session1.save(flight5);
      session1.save(flight6);
      session1.save(flight7);
      session1.save(flight8);
      session2.save(admin);
      session3.save(place1);
      session3.save(place2);
      session3.save(place3);
      session3.save(place4);
      session3.save(place5);
      session4.save(airline1);
      session4.save(airline2);
      session4.save(airline3);
      session4.save(airline4);
      session4.save(airline5);
      session4.save(airline6);
      tx1.commit();
      tx2.commit();
      tx3.commit();
      tx4.commit();
    }
}

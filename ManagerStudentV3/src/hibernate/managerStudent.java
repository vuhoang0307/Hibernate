package hibernate;
import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by MINHHOANG-PC on 28/05/2017.
 */
public class managerStudent {
    private static SessionFactory factory;
    private static ServiceRegistry serviceRegistry;

    public static void main(String[] args) {
       Configuration configuration = new Configuration();
       configuration.configure();
       serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        factory = configuration.buildSessionFactory(serviceRegistry);
        managerStudent manager = new managerStudent();

        manager.addGrade(8,"grade 8","student 14 years old");
        manager.addGrade(7,"grade 7","student 13 years old");
        manager.addGrade(6,"grade 6","student 12 years old");
        manager.addGrade(5,"grade 5","student 11 years old");
        manager.addGrade(9,"grade 9","student 15 years old");

    }
    private int addGrade(int grade_id, String name,String grade_desc){
        Session session = factory.openSession();
        Transaction tx = null;
        Integer gradeIdSaved = null;
        try {
            tx = session.beginTransaction();
            Grade grade = new Grade(grade_id,name,grade_desc);

            gradeIdSaved = (Integer) session.save(grade);
            tx.commit();
        }catch (HibernateException ex){
            if (ex != null){
                tx.rollback();
            }
            ex.printStackTrace();
        }
        finally {
            session.close();
        }


        return gradeIdSaved;
    }
    private List listUsers()
    {
        Session sesn = factory.openSession();
        Transaction tx = null;
        List users = new ArrayList();
        try
        {
            tx = sesn.beginTransaction();
            users = (List) sesn.createQuery("From Grade").list();
            tx.commit();
        }
        catch (HibernateException e)
        {
            e.printStackTrace();
        }
        finally
        {
            sesn.close();
        }

        return users;
    }

}

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

        manager.addGrade(1,"grade 1","student 7 years old");
        manager.addGrade(2,"grade 2","student 8 years old");
        manager.addGrade(3,"grade 3","student 9 years old");
        manager.addGrade(4,"grade 4","student 10 years old");

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
    private List listGrade()
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

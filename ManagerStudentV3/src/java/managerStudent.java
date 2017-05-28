package java;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.service.ServiceRegistry;


/**
 * Created by MINHHOANG-PC on 28/05/2017.
 */
public class managerStudent {
    private static SessionFactory factory;
    private static ServiceRegistry serviceRegistry;

    public static void main(String[] args) {
        try{
            factory = new Configuration().configure().buildSessionFactory();
        }catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }
        managerStudent mS = new managerStudent();
    }
    public int addGrade(int grade_id, String name,String grade_desc){
        Session session = factory.openSession();
        Transaction tx = null;
        Integer gradeIdSaved = null;


            tx = session.beginTransaction();
            Grade grade = new Grade(grade_id,name,grade_desc);







        return gradeIdSaved;
    }
}

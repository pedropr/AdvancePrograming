import Controllers.AutoPartServices;
import Controllers.UsersServices;
import Domain.AutoPart;
import Domain.Users;
import GUI.LoginFrame;
import org.hibernate.HibernateException;
import org.hibernate.Metamodel;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.*;
import java.util.concurrent.ExecutionException;

import javax.persistence.metamodel.EntityType;

/**
 * Created by Pedro on 5/1/2017.
 */
public class Main {
    private static final SessionFactory ourSessionFactory;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            ourSessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }

    public static void main(final String[] args) throws Exception {
        //This part for testing purpose, to see if connection is make, this will be delete
        //Need to add item to database
        //Folder for gui create, here is where we run project.
        final Session session = getSession();
        session.beginTransaction();
        try {
            AutoPartServices autoPartServices = new AutoPartServices(session);
            UsersServices usersServices = new UsersServices(session);
            /**
             * This testing park and population table, create default values
             */
            Users users = new Users("Default", "Password");
            session.save(users);
            AutoPart a = new AutoPart();
            a.setCarbrand("Toyota");
            a.setCarmodel("343BC");
            a.setPartcost(20.00);
            a.setPartname("Bomber");
            a.setPartprice(300.00);
            a.setQuantity(5);
            session.save(a);
            a = new AutoPart("333", "Bomp", "3bx", "Lexus", 5, 45.99, 90.99, "gif.jpg");
            session.save(a);
            a = new AutoPart("332", "Bomp", "4bx", "Lexus", 5, 45.99, 90.99, "gif.jpg");
            session.save(a);
            a = new AutoPart("330", "Bomp", "3bx", "Lexus", 5, 45.99, 90.99, "gif.jpg");
            session.save(a);
            LoginFrame startFrame = new LoginFrame();

        }catch (Exception e){

        }
    }
}
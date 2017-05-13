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
            /* To use this change in hibernate.cfg.xml update to create
            Users users = new Users("Default", "Password");
            session.save(users);
            users = new Users("Pedro", "1234");
            session.save(users);
            users = new Users("Jorge", "1234");
            session.save(users);
            users = new Users("Richard", "1234");
            session.save(users);
            users = new Users("Test", "1234");
            session.save(users);
            */
            LoginFrame startFrame = new LoginFrame();


        }catch (Exception e){

        }
    }
}
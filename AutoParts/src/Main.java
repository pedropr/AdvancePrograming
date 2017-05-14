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
 * Main Application of the program
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

    /**
     * Get Session from hibernate
     * @return session where the database is connected.
     * @throws HibernateException
     */
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

            //population table, create default values and add them if they don't exist in database
            //Populate for Users
            Users users = new Users("Default", "Password");
            if (!UsersServices.authentication(users.getUsername(), users.getPassword())) {
                session.save(users);
            }

            users = new Users("Pedro", "1234");
            if (!UsersServices.authentication(users.getUsername(), users.getPassword())) {
                session.save(users);
            }
            users = new Users("Jorge", "1234");
            if (!UsersServices.authentication(users.getUsername(), users.getPassword())) {
                session.save(users);
            }
            users = new Users("Richard", "1234");
            if (!UsersServices.authentication(users.getUsername(), users.getPassword())) {
                session.save(users);
            }
            users = new Users("Test", "1234");
            if (!UsersServices.authentication(users.getUsername(), users.getPassword())) {
                session.save(users);
            }
            AutoPart part;

            //Populate Auto Part if database does not found them.

            if (!AutoPartServices.ifAutoPartExits("A2354")) {
                part = new AutoPart("A2354", "Autolite XP Iridium Spark Plug", "New Yorker", "Chrysler", 32, 3.00, 6.99, "temp");
                session.save(part);
            }
            if (!AutoPartServices.ifAutoPartExits("D3453")) {
                part = new AutoPart("D3453", "Duralast Gold Alternator", "Trans Sport", "Pontiac", 15, 75.32, 109.99, "temp");
                session.save(part);
            }
            if (!AutoPartServices.ifAutoPartExits("F8756")) {
                part = new AutoPart("F8756", "Fram Fuel Filter", "Tercel", " Toyota", 40, 11.00, 21.00, "temp");
                session.save(part);
            }
            if (!AutoPartServices.ifAutoPartExits("D8961")) {
                part = new AutoPart("D8961", "Duralast Break Pads", "Accord", "Honda", 25, 10.30, 18.99, "temp");
                session.save(part);
            }
            if (!AutoPartServices.ifAutoPartExits("V7139")) {
                part = new AutoPart("V7139", "Valucraft Oil Pressure Switch", "Futura", "Ford", 32, 3.30, 6.00, "temp");
                session.save(part);
            }
            LoginFrame startFrame = new LoginFrame();


        }catch (Exception e){

        }
    }
}
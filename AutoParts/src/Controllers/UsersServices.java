package Controllers;

import Domain.Users;
import org.hibernate.HibernateException;
import org.hibernate.Metamodel;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import javax.persistence.metamodel.EntityType;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Pedro on 5/3/2017.
 */
public class UsersServices {

    public static boolean authentication(Session session, String userName, String password) throws Exception {
        Query query = session.getNamedQuery("Authentication").setParameter("username", userName)
                .setParameter("password", password);
        ArrayList<Users> results = (ArrayList<Users>) query.list();
        if (results.isEmpty())
            throw new Exception("Invalid Username or Password");
        return true;

    }

    public static boolean createUser(Session session, String userName, String password) throws Exception {
        session.save(new Users(userName, password));
        return true;
    }

    public static boolean updateUser(Session session, String userName, String password) throws Exception {
        Query query = session.getNamedQuery("Authentication").setParameter("username", userName)
                .setParameter("password", password);
        ArrayList<Users> results = (ArrayList<Users>) query.list();
        Users users = results.get(0);
        users.setUsername(userName);
        users.setPassword(password);


        return true;
    }

    public List<Users> getUsers(Session session) {
        Query query = session.getNamedQuery("getAllUsers");
        ArrayList<Users> results = (ArrayList<Users>) query.list();
        return results;
    }

    public Users getUsers(Session session, String userName, String password) {
        Query query = session.getNamedQuery("Authentication").setParameter("username", userName)
                .setParameter("password", password);
        ArrayList<Users> results = (ArrayList<Users>) query.list();
        return results.get(0);
    }

}

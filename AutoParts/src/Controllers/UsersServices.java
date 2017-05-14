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
 * This the connection between domain and gui, controll only the users data
 */
public class UsersServices {
    public UsersServices(Session s){
        session=s;

        //System.out.println(session.isOpen());
    }
    private static Session session;

    /**
     *
     * @param userName
     * @param password
     * @return
     */
    public static boolean authentication(String userName, String password){
        //System.out.println(session.isOpen());
        Query query = session.getNamedQuery("Authentication").setParameter("username", userName)
                .setParameter("password", password);
        ArrayList<Users> results = (ArrayList<Users>) query.list();
        if(results.isEmpty()){
            return false;
        }else {
            return true;
        }

    }

    /**
     *
     * @param userName
     * @param password
     * @return
     */
    public static boolean createUser(String userName, String password) {
        session.save(new Users(userName, password));
        return true;
    }

    /**
     *
     * @param userName
     * @param password
     * @return
     */
    public static boolean updateUser(String userName, String password) {
        Query query = session.getNamedQuery("Authentication").setParameter("username", userName)
                .setParameter("password", password);
        ArrayList<Users> results = (ArrayList<Users>) query.list();
        Users users = results.get(0);
        users.setUsername(userName);
        users.setPassword(password);


        return true;
    }

    /**
     *
     * @param session
     * @return
     */
    public List<Users> getUsers(Session session) {
        Query query = session.getNamedQuery("getAllUsers");
        ArrayList<Users> results = (ArrayList<Users>) query.list();
        return results;
    }

    /**
     *
     * @param session
     * @param userName
     * @param password
     * @return
     */
    public Users getUsers(Session session, String userName, String password) {
        Query query = session.getNamedQuery("Authentication").setParameter("username", userName)
                .setParameter("password", password);
        ArrayList<Users> results = (ArrayList<Users>) query.list();
        return results.get(0);
    }

}

package Controllers;
import Domain.Users;
import org.hibernate.HibernateException;
import org.hibernate.Metamodel;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



import javax.persistence.metamodel.EntityType;


/**
 * Created by Pedro on 5/3/2017.
 */
public class UsersServices {

    public static boolean authentication(Session session){

        return true;

    }

    public static boolean createUser(Session session, Users user){
        return true;
    }

    public static boolean updateUser(Session session, Users users){
        return true;
    }

    public Users getUsers(Session session, String users){
        return null;
    }

}

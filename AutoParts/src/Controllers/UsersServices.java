package Controllers;
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
    private static Session session;

    public UsersServices(Session s){
        session = s;
    }

    public static boolean Authentication(Session session){

        return true;

    }

}

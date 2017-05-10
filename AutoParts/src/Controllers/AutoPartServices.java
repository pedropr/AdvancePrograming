package Controllers;
import Domain.Users;
import org.hibernate.HibernateException;
import org.hibernate.Metamodel;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import Domain.AutoPart;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.metamodel.EntityType;


/**
 * Created by PedroVega on 5/4/17.
 */
public class AutoPartServices {
    public static boolean createAutoParts(Session session, AutoPart autopart) throws Exception{
        session.save(autopart);
        return true;

    }

    public static boolean updateAutoParts(Session session, AutoPart autopart) throws Exception{
        session.update(autopart);
        return true;
    }

    public static List<AutoPart> searchAutoParts(Session session, String name) throws Exception{
        Query query = session.getNamedQuery("searchAutoParts").setParameter("partname", name);
        ArrayList<AutoPart> list =(ArrayList<AutoPart>)query.list();
        return list;
    }

    public static List<AutoPart> getAllAutoParts(Session session) throws Exception{
        Query query = session.getNamedQuery("getAllParts");
        ArrayList<AutoPart> list =(ArrayList<AutoPart>)query.list();
        return list;
    }

    public static AutoPart getAutoPartById(Session session, int id) throws Exception {
        return null;
    }


}

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
    private static Session session;

    /**
     *
     * @param s
     */
    public AutoPartServices(Session s){
        session = s;
    }

    /**
     *
     * @param autopart
     * @return
     * @throws Exception
     */
    public static boolean createAutoParts(AutoPart autopart) throws Exception{
        session.save(autopart);
        return true;

    }

    /**
     *
     * @param autopart
     * @return
     * @throws Exception
     */
    public static boolean updateAutoParts(AutoPart autopart) throws Exception{
        session.update(autopart);
        return true;
    }

    /**
     *
     * @param name
     * @return
     * @throws Exception
     */
    public static List<AutoPart> searchAutoParts(String name) throws Exception{
        Query query = session.getNamedQuery("searchAutoParts").setParameter("partname", name);
        ArrayList<AutoPart> list =(ArrayList<AutoPart>)query.list();
        return list;
    }

    /**
     *
     * @return
     * @throws Exception
     */
    public static List<AutoPart> getAllAutoParts() throws Exception{
        Query query = session.getNamedQuery("getAllParts");
        ArrayList<AutoPart> list =(ArrayList<AutoPart>)query.list();
        return list;
    }

    /**
     *
     * @param id
     * @return
     * @throws Exception
     */
    public static AutoPart getAutoPartById(int id) throws Exception {
        return null;
    }


}

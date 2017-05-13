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
     * @param
     */
    public static void closeSession(){
        session.close();
    }
    public AutoPartServices(Session s){
        session = s;
    }

    /**
     *
     * @param autopart
     * @return

     */
    public static boolean createAutoParts(AutoPart autopart) {
        session.save(autopart);
        return true;

    }

    /**
     *
     * @param autopart
     * @return
     */
    public static boolean updateAutoParts(AutoPart autopart) {
        session.update(autopart);
        return true;
    }

    /**
     *
     * @param partno
     * @return
     * */
    public static List<AutoPart> searchAutoParts(String partno){
        Query query = session.getNamedQuery("searchAutoParts").setParameter("partno", partno);
        ArrayList<AutoPart> list =(ArrayList<AutoPart>)query.list();
        return list;
    }

    /**
     *
     * @param partno
     * @return
     */
    public static List<AutoPart> searchLikeAutoParts(String partno){
        Query query = session.getNamedQuery("searchAutoParts").setParameter("partno", "%"+partno+"%");
        ArrayList<AutoPart> list =(ArrayList<AutoPart>)query.list();
        return list;
    }

    /**
     *
     * @return
     */
    public static List<AutoPart> getAllAutoParts(){
        Query query = session.getNamedQuery("getAllParts");
        ArrayList<AutoPart> list =(ArrayList<AutoPart>)query.list();
        return list;
    }



}

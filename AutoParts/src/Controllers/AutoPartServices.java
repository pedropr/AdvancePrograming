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
 * This controller controls what to send and update between the GUI and model. Only for AutoPart data
 */
public class AutoPartServices {
    private static Session session;

    /**
     * Close session and save all changes into database
     */
    public static void closeSession(){
        session.close();
    }

    /**
     * Default constructore, required an open session to work.
     */


    /**
     * Default constructore, required an open session to work.
     * @param s session
     */
    public AutoPartServices(Session s){
        session = s;
    }

    /**
     * Create autoPart to the database
     * @param autopart
     * @return the status of creation
     */
    public static boolean createAutoParts(AutoPart autopart) {
        session.save(autopart);
        return true;

    }

    /**
     *  Update autopart in database
     *
     * @param autopart
     * @return the status of update
     */
    public static boolean updateAutoParts(AutoPart autopart) {
        session.update(autopart);
        return true;
    }

    /**
     * Search for autopart by name
     * @param partno Part # of the AutoPart
     * @return list of autoparts
     * */
    public static List<AutoPart> searchAutoParts(String partno){
        Query query = session.getNamedQuery("searchAutoParts").setParameter("partno", partno);
        ArrayList<AutoPart> list =(ArrayList<AutoPart>)query.list();
        return list;
    }

    /**
     * Search for autopart that contains the AutoPart #
     * @param partno autopart
     * @return list of autoparts
     */
    public static List<AutoPart> searchLikeAutoParts(String partno){
        Query query = session.getNamedQuery("searchAutoParts").setParameter("partno", "%"+partno+"%");
        ArrayList<AutoPart> list =(ArrayList<AutoPart>)query.list();
        return list;
    }

    /**
     * Get all AutoPart
     * @return list of AutoPart
     */
    public static List<AutoPart> getAllAutoParts(){
        Query query = session.getNamedQuery("getAllParts");
        ArrayList<AutoPart> list =(ArrayList<AutoPart>)query.list();
        return list;
    }

    /**
     * Check if auto part exist in database
     * @param partno part #
     * @return return false is autopart does not exist in datbase, return true if autopart exist
     */
    public static boolean ifAutoPartExits(String partno){
        Query query = session.getNamedQuery("getAutoPart").setParameter("partno", partno);
        if(query.list().isEmpty())
            return false;
        else
            return true;

    }



}

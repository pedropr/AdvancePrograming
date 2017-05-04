package Domain;
import javax.persistence.*;

/**
 * Created by PedroVega on 5/4/17.
 */
@Entity
@Table
public class Images {
    @Id
    @GeneratedValue
    private int Id;

    private String path;

    
    private int autoId;

}

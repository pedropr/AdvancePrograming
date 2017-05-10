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

    private int autoPartId;

    public Images() {

    }

    public int getId() {
        return Id;
    }

    public String getPath() {
        return path;
    }

    public int getAutoPart() {
        return autoPartId;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setAutoPart(int autoPartId) {
        this.autoPartId = autoPartId;
    }


}

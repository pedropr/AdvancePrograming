package Domain;
import javax.persistence.*;

/**
 * Created by Pedro on 5/2/2017.
 */
@NamedQueries({
        @NamedQuery(name = "getAllUsers", query = "select u From Users u"),
        @NamedQuery(name = "Authenticatsion", query = "select u from Users u where u.username = :username and u.password = :password")
})

@Entity
@Table
public class Users {
    @Id
    @GeneratedValue
    private int Id;

    @Column(unique = true)
    private String username;

    private String password;

    public Users(){

    }

    public Users(String username, String password){
        this.username = username;
        this.password = password;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return Id;
    }

    /**
     *
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.Id = Id;
    }

    /**
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Users)) return false;

        Users user = (Users) o;

        if (getId() != user.getId()) return false;
        if (getUsername() != null ? !getUsername().equals(user.getUsername()) : user.getUsername() != null)
            return false;
        return getPassword() != null ? getPassword().equals(user.getPassword()) : user.getPassword() == null;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getUsername() != null ? getUsername().hashCode() : 0);
        result = 31 * result + (getPassword() != null ? getPassword().hashCode() : 0);
        return result;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "User{" +
                "id=" + Id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

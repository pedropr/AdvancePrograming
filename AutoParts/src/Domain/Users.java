package Domain;
import javax.persistence.*;

/**
 * Created by Pedro on 5/2/2017.
 */
@NamedQueries({
        @NamedQuery(name = "getAllUsers", query = "select u From Users u"),
        @NamedQuery(name = "Authentication", query = "select u from Users u where u.username = :username and u.password = :password")
})

@Entity
@Table
public class Users {
    @Id
    @GeneratedValue
    private int Id;

    private String username;

    private String password;

    public Users(){

    }

    public Users(String username, String password){
        this.username = username;
        this.password = password;
    }

    /**
     * Get Id
     * @return
     */
    public int getId() {
        return Id;
    }

    /**
     * Get Username
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     * Get Password
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set Id
     * @param id Integer
     */
    public void setId(int id) {
        this.Id = Id;
    }

    /**
     * Set Username
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Set Password
     * @param password String
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Check if object are equal
     * @param o Objects
     * @return Boolean
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
     * HashCode of object
     * @return Integer
     */
    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getUsername() != null ? getUsername().hashCode() : 0);
        result = 31 * result + (getPassword() != null ? getPassword().hashCode() : 0);
        return result;
    }

    /**
     * To String
     * @return String
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

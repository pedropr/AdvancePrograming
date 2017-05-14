package Domain;

import javax.persistence.*;
@NamedQueries({
        @NamedQuery(name = "getAllParts", query = "select p From AutoPart p"),
        @NamedQuery(name = "searchAutoParts", query = "select p from AutoPart p where p.partno like :partno")

})

/**
 * Created by Pedro on 5/1/2017.
 */


@Entity
@Table
public class AutoPart {
    @Id
    @GeneratedValue
    private int id;

    private String partno;

    private String images;

    private String partname;

    private String carmodel;

    private String carbrand;

    private Integer quantity;

    private Double partcost;

    private Double partprice;

    public AutoPart(){

    }

    /**
     *
     * @param partno
     * @param partname
     * @param carmodel
     * @param carbrand
     * @param quantity
     * @param partcost
     * @param partprice
     */
    public AutoPart(String partno, String partname, String carmodel, String carbrand, Integer quantity, Double partcost, Double partprice, String images) {
        this.partno = partno;
        this.partname = partname;
        this.carmodel = carmodel;
        this.carbrand = carbrand;
        this.quantity = quantity;
        this.partcost = partcost;
        this.partprice = partprice;
        this.images = images;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return
     */
    public String getImages() {
        return images;
    }

    /**
     *
     * @param images
     */
    public void setImages(String images) {
        this.images = images;
    }

    /**
     *
     * @return
     */

    public String getPartno() {
        return partno;
    }

    /**
     *
     * @param partno
     */
    public void setPartno(String partno) {
        this.partno = partno;
    }

    /**
     *
     * @return
     */

    public String getPartname() {
        return partname;
    }

    /**
     *
     * @param partname
     */
    public void setPartname(String partname) {
        this.partname = partname;
    }

    /**
     *
     * @return
     */

    public String getCarmodel() {
        return carmodel;
    }

    /**
     *
     * @param carmodel
     */
    public void setCarmodel(String carmodel) {
        this.carmodel = carmodel;
    }

    /**
     *
     * @return
     */

    public String getCarbrand() {
        return carbrand;
    }

    /**
     *
     * @param carbrand
     */
    public void setCarbrand(String carbrand) {
        this.carbrand = carbrand;
    }

    /**
     *
     * @return
     */

    public Integer getQuantity() {
        return quantity;
    }

    /**
     *
     * @param quantity
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     *
     * @return
     */

    public Double getPartcost() {
        return partcost;
    }

    /**
     *
     * @param partcost
     */
    public void setPartcost(Double partcost) {
        this.partcost = partcost;
    }

    /**
     *
     * @return
     */

    public Double getPartprice() {
        return partprice;
    }

    /**
     *
     * @param partprice
     */
    public void setPartprice(Double partprice) {
        this.partprice = partprice;
    }

    /**
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AutoPart that = (AutoPart) o;

        if (partno != null ? !partno.equals(that.partno) : that.partno != null) return false;
        if (partname != null ? !partname.equals(that.partname) : that.partname != null) return false;
        if (carmodel != null ? !carmodel.equals(that.carmodel) : that.carmodel != null) return false;
        if (carbrand != null ? !carbrand.equals(that.carbrand) : that.carbrand != null) return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;
        if (partcost != null ? !partcost.equals(that.partcost) : that.partcost != null) return false;
        if (partprice != null ? !partprice.equals(that.partprice) : that.partprice != null) return false;

        return true;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int result = partno != null ? partno.hashCode() : 0;
        result = 31 * result + (partname != null ? partname.hashCode() : 0);
        result = 31 * result + (carmodel != null ? carmodel.hashCode() : 0);
        result = 31 * result + (carbrand != null ? carbrand.hashCode() : 0);
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        result = 31 * result + (partcost != null ? partcost.hashCode() : 0);
        result = 31 * result + (partprice != null ? partprice.hashCode() : 0);
        return result;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "AutoPart{" +
                "id=" + id +
                ", partno='" + partno + '\'' +
                ", partname='" + partname + '\'' +
                ", carmodel='" + carmodel + '\'' +
                ", carbrand='" + carbrand + '\'' +
                ", quantity=" + quantity +
                ", partcost=" + partcost +
                ", partprice=" + partprice +
                '}';
    }
}

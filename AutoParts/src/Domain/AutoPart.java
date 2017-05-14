package Domain;

import javax.persistence.*;
@NamedQueries({
        @NamedQuery(name = "getAllParts", query = "select p From AutoPart p"),
        @NamedQuery(name = "searchAutoParts", query = "select p from AutoPart p where p.partno like :partno"),
        @NamedQuery(name = "getAutoPart", query = "select p from AutoPart p where p.partno = :partno")

})

/**
 * Created by Pedro on 5/1/2017.
 * Domain part of AutoPart
 * Simple java class
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
     * @param partno part #
     * @param partname part name
     * @param carmodel car model
     * @param carbrand car brand
     * @param quantity quantity
     * @param partcost part cost
     * @param partprice part price
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
     * Return Id
     * @return return id
     */
    public int getId() {
        return id;
    }

    /**
     *  Return Path of Image
     * @return Image Path
     */
    public String getImages() {
        return images;
    }

    /**
     * Set Images Path
     * @param images String - images images path
     */
    public void setImages(String images) {
        this.images = images;
    }

    /**
     * get Part #
     * @return String Part no#
     */

    public String getPartno() {
        return partno;
    }

    /**
     * Set Part #
     * @param partno
     */
    public void setPartno(String partno) {
        this.partno = partno;
    }

    /**
     * Get Part Name
     * @return String - Part Name
     */

    public String getPartname() {
        return partname;
    }

    /**
     * Set Part Name
     * @param partname String - Part Name
     */
    public void setPartname(String partname) {
        this.partname = partname;
    }

    /**
     * Get Car Model
     * @return String - Car Model
     */

    public String getCarmodel() {
        return carmodel;
    }

    /**
     * Set Carmodel
     * @param carmodel String - Car Model
     */
    public void setCarmodel(String carmodel) {
        this.carmodel = carmodel;
    }

    /**
     * Get Car Brand
     * @return String - Car Brand
     */

    public String getCarbrand() {
        return carbrand;
    }

    /**
     * Set Car Brand
     * @param carbrand
     */
    public void setCarbrand(String carbrand) {
        this.carbrand = carbrand;
    }

    /**
     * Get Quantity
     * @return Integer - Quantity
     */

    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Set Quantity
     * @param quantity Integer - Quantity
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * Get Part Cost
     * @return Double - Part Cost
     */

    public Double getPartcost() {
        return partcost;
    }

    /**
     * Set Part Cost
     * @param partcost Double - Part Cost
     */
    public void setPartcost(Double partcost) {
        this.partcost = partcost;
    }

    /**
     * Get Part Price
     * @return Double - get Part Price
     */

    public Double getPartprice() {
        return partprice;
    }

    /**
     * Set Part Price
     * @param partprice Double - get Part Price
     */
    public void setPartprice(Double partprice) {
        this.partprice = partprice;
    }

    /**
     * Check if they equal
     * @param o objects
     * @return true if they are the same object, false if not
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
     * Hash code of Auto Part
     * @return Integer
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
     * To String of AutoPart Object
     * @return String
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

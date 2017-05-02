package Domain;

import javax.persistence.*;

/**
 * Created by Pedro on 5/1/2017.
 */
@Entity
@Table(name = "AUTOPART", schema = "APP", catalog = "")
public class AutopartEntity {
    @Id
    private int id;
    private String partno;
    private String partname;
    private String partimage;
    private String carmodel;
    private String carbrand;
    private Integer quantity;
    private Double partcost;
    private Double partprice;

    @Basic
    @Column(name = "PARTNO")
    public String getPartno() {
        return partno;
    }

    public void setPartno(String partno) {
        this.partno = partno;
    }

    @Basic
    @Column(name = "PARTNAME")
    public String getPartname() {
        return partname;
    }

    public void setPartname(String partname) {
        this.partname = partname;
    }

    @Basic
    @Column(name = "PARTIMAGE")
    public String getPartimage() {
        return partimage;
    }

    public void setPartimage(String partimage) {
        this.partimage = partimage;
    }

    @Basic
    @Column(name = "CARMODEL")
    public String getCarmodel() {
        return carmodel;
    }

    public void setCarmodel(String carmodel) {
        this.carmodel = carmodel;
    }

    @Basic
    @Column(name = "CARBRAND")
    public String getCarbrand() {
        return carbrand;
    }

    public void setCarbrand(String carbrand) {
        this.carbrand = carbrand;
    }

    @Basic
    @Column(name = "QUANTITY")
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "PARTCOST")
    public Double getPartcost() {
        return partcost;
    }

    public void setPartcost(Double partcost) {
        this.partcost = partcost;
    }

    @Basic
    @Column(name = "PARTPRICE")
    public Double getPartprice() {
        return partprice;
    }

    public void setPartprice(Double partprice) {
        this.partprice = partprice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AutopartEntity that = (AutopartEntity) o;

        if (partno != null ? !partno.equals(that.partno) : that.partno != null) return false;
        if (partname != null ? !partname.equals(that.partname) : that.partname != null) return false;
        if (partimage != null ? !partimage.equals(that.partimage) : that.partimage != null) return false;
        if (carmodel != null ? !carmodel.equals(that.carmodel) : that.carmodel != null) return false;
        if (carbrand != null ? !carbrand.equals(that.carbrand) : that.carbrand != null) return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;
        if (partcost != null ? !partcost.equals(that.partcost) : that.partcost != null) return false;
        if (partprice != null ? !partprice.equals(that.partprice) : that.partprice != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = partno != null ? partno.hashCode() : 0;
        result = 31 * result + (partname != null ? partname.hashCode() : 0);
        result = 31 * result + (partimage != null ? partimage.hashCode() : 0);
        result = 31 * result + (carmodel != null ? carmodel.hashCode() : 0);
        result = 31 * result + (carbrand != null ? carbrand.hashCode() : 0);
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        result = 31 * result + (partcost != null ? partcost.hashCode() : 0);
        result = 31 * result + (partprice != null ? partprice.hashCode() : 0);
        return result;
    }
}

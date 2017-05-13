package GUI;

import Domain.AutoPart;

import javax.swing.*;


/**
 * Created by Pedro on 5/13/2017.
 */
public class DisplayFrame extends JFrame {
    private JPanel MainFrame;
    private JLabel PartNo;
    private JLabel PartName;
    private JLabel CarModel;
    private JLabel CarBrand;
    private JLabel Quantity;
    private JLabel Cost;
    private JLabel Price;
    private JLabel Image;
    private String image;
    private AutoPart autoPart;

    public DisplayFrame(AutoPart a){
        super("AutoPart - " + a.getPartno());
        setSize(500,500);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        add(MainFrame);
        autoPart = a;
        fillFrame();
        setVisible(true);

    }

    private void fillFrame(){
        PartNo.setText("Part No: " + autoPart.getPartno());
        PartName.setText("Part Name: " + autoPart.getPartname());
        CarModel.setText("Car Model: " + autoPart.getCarmodel());
        CarBrand.setText("Car Brand: " + autoPart.getCarbrand());
        Quantity.setText("Quantity: " + autoPart.getQuantity());
        Cost.setText("Cost: $" + autoPart.getPartcost());
        Price.setText("Price: $" + autoPart.getPartprice());
        try {
            image = autoPart.getImages();
            Image.setIcon(new ImageIcon(image));
            //Image.setText("Image not found");
        }catch (Exception e){
            Image.setText("Image not found");
        }

    }
}

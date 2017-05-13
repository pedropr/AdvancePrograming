package GUI;

import Domain.AutoPart;

import javax.swing.*;

/**
 * Created by Pedro on 5/13/2017.
 */
public class DisplayFrame extends JFrame {
    private JPanel panel1;
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
        setSize(500,300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        autoPart = a;
        fillFrame();
        setVisible(true);

    }

    private void fillFrame(){

    }
}

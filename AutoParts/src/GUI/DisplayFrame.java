package GUI;

import Domain.AutoPart;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;


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
        setSize(500,540);
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


            Image.setIcon(new ImageIcon(getScaledImage(new ImageIcon(image).getImage(),280,400)));
            Image.setText("Image not found");
        }catch (Exception e){
            Image.setText("Image not found");
        }


    }
    private Image getScaledImage(Image srcImg, int w, int h){
        BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = resizedImg.createGraphics();

        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(srcImg, 0, 0, w, h, null);
        g2.dispose();

        return resizedImg;
    }
}

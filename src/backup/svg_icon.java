/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backup;
import student_management_system.*;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
public class svg_icon extends JLabel {
    private FlatSVGIcon svgIcon;
    public void setSvgImage (String image, int width, int height)
    { 
        
        svgIcon= new FlatSVGIcon (image, width, height);
        ImageIcon i =  new ImageIcon();
        i=(ImageIcon)svgIcon;
        setIcon(i);
    }
}
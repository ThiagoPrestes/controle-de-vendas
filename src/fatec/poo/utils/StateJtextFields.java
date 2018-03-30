
package fatec.poo.utils;

import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Thiago
 */
public class StateJtextFields {
    
    public static void clearFrame(JFrame Frame) {     
            //limpa os campos     
        for (int i=0; i < Frame.getContentPane().getComponentCount(); i++) {   
            //varre todos os componentes     
            Component c = Frame.getContentPane().getComponent(i);     
            if (c instanceof JTextField) {                           
                JTextField field = (JTextField) c;   
                field.setText("");                      
            }   
        }   
    }
    
    public static void enableJFieldsFrame(JFrame Frame) {     
            //limpa os campos     
        for (int i=0; i < Frame.getContentPane().getComponentCount(); i++) {   
            //varre todos os componentes     
            Component c = Frame.getContentPane().getComponent(i);     
            if (c instanceof JTextField) {                           
                JTextField field = (JTextField) c;   
                field.setEnabled(true);                  
            }   
        }   
    }
    
    public static void disableJFieldsFrame(JFrame Frame) {     
            //limpa os campos     
        for (int i=0; i < Frame.getContentPane().getComponentCount(); i++) {   
            //varre todos os componentes     
            Component c = Frame.getContentPane().getComponent(i);     
            if (c instanceof JTextField) {                           
                JTextField field = (JTextField) c;   
                field.setEnabled(false);                  
            }   
        }   
    }
}

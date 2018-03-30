
package fatec.poo.utils;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static jdk.nashorn.internal.objects.NativeString.trim;

/**
 *
 * @author Thiago
 */
public class Exceptions {
    
    public static boolean fieldIsEmpty(JTextField field, String nameField, String nameJframe){
        if(trim(field.getText()).equals("")){
            JOptionPane.showMessageDialog(null, "Campo "+nameField+" não pode estar em branco", nameJframe, JOptionPane.ERROR_MESSAGE);
            field.requestFocus();
            field.setText("");
            return true;
        }else{
            return false;
        }
    }
    
    public static boolean numberNegative(JTextField field, String nameField, String nameJframe){
            double valueField = Double.parseDouble(trim(field.getText()));
            
            if(valueField < 0){
                field.requestFocus();  
                field.setText("");
                JOptionPane.showMessageDialog(null, "Apenas números\nCampo "+nameField+" não pode ser negativo", "Campo Inválido", JOptionPane.ERROR_MESSAGE);
                return true;
            }else{
                return false;
            }
    }
    
    public static boolean numberGreaterZero(JTextField field, String nameField, String nameJframe){
            double valueField = Double.parseDouble(trim(field.getText()));
            
            if(valueField <= 0){
                field.requestFocus();  
                field.setText("");
                JOptionPane.showMessageDialog(null, "Apenas valores maiores do que zero para o campo "+nameField, "Campo Inválido", JOptionPane.ERROR_MESSAGE);
                return true;
            }else{
                return false;
            }
    }
    
    public static boolean convertStringToInt(JTextField field, String nameField, String nameJframe){
        try{
            Integer.parseInt(trim(field.getText()));
            return true;
        }catch (NumberFormatException e){
            field.setText("");
            field.requestFocus();
            JOptionPane.showMessageDialog(null, "Apenas números\nCampo "+nameField+" não pode estar em branco", nameJframe, JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public static boolean convertStringToDouble(JTextField field, String nameField, String nameJframe){
        try{
            Double.parseDouble(trim(field.getText()));
            return true;
        }catch (NumberFormatException e){
            field.setText("");
            field.requestFocus();
            JOptionPane.showMessageDialog(null, "Apenas números\nCampo "+nameField+" não pode estar em branco", nameJframe, JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public static boolean checkCpf(JFormattedTextField fieldCpf, String nameField, String nameJFrame){
        String cpf = ValidaCpf.removeMask(fieldCpf.getText());
        //System.out.println(cpf);
        if(ValidaCpf.removeMask(fieldCpf.getText()).equals("")){
            JOptionPane.showMessageDialog(null, "Campo "+nameField+" não pode estar em branco", nameJFrame, JOptionPane.ERROR_MESSAGE);
            fieldCpf.requestFocus();
            fieldCpf.setText("");
            return false;
        }else{ 
            if(cpf.length() < 11){
                JOptionPane.showMessageDialog(null, "O cpf informado está incompleto", nameJFrame, JOptionPane.ERROR_MESSAGE);
                fieldCpf.requestFocus();
                return false;
            }else{
                if(!ValidaCpf.isCpf(cpf)){    
                    JOptionPane.showMessageDialog(null, "O cpf informado é inválido", nameJFrame, JOptionPane.ERROR_MESSAGE);
                    fieldCpf.requestFocus();
                     return false;
                }else{
                    return true;
                }
            }
        }
    }
    
    public static boolean cboxisDefault(JComboBox cbox, String nameJFrame){
        if(cbox.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Deve ser selecionado um estado", nameJFrame, JOptionPane.ERROR_MESSAGE);
            cbox.requestFocus();
            return true;
        }else{
            return false;
        }
    }
}

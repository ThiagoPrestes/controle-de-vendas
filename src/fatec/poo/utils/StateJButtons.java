
package fatec.poo.utils;

import javax.swing.JButton;

/**
 *
 * @author Thiago
 */
public class StateJButtons {
    
    public static void consultaEncontrada(JButton btnConsultar, JButton btnIncluir, JButton btnAlterar, JButton btnExcluir){
        btnConsultar.setEnabled(false);
        btnIncluir.setEnabled(false);
        btnAlterar.setEnabled(true);
        btnExcluir.setEnabled(true);
    }
    
    public static void consultaNaoEncontrada(JButton btnConsultar, JButton btnIncluir, JButton btnAlterar, JButton btnExcluir){
        btnConsultar.setEnabled(false);
        btnIncluir.setEnabled(true);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }
    
    public static void incluir(JButton btnConsultar, JButton btnIncluir, JButton btnAlterar, JButton btnExcluir){
        btnConsultar.setEnabled(true);
        btnIncluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }
    
    public static void excluir(JButton btnConsultar, JButton btnIncluir, JButton btnAlterar, JButton btnExcluir){
        btnConsultar.setEnabled(true);
        btnIncluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }
}

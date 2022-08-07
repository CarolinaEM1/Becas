
package iniciobecas;
import javax.swing.JOptionPane;
/**
 *
 * @author Carolina EM
 */
public class InicioBecas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Becas a=new Becas();
        a.leerDatos();
        a.calcular();
        a.mostrar();
        JOptionPane.showMessageDialog(null,a.mostrar());
        System.exit(0);
    }
    
}

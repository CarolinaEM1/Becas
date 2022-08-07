
package iniciobecas;
import javax.swing.JOptionPane;
/**
 *
 * @author Carolina EM
 */
public class Becas {
    String nombre,NumControl;
    double promedio,monto;

    
    void leerDatos() {
        nombre=JOptionPane.showInputDialog("Nombre del Alumno:");
        NumControl=JOptionPane.showInputDialog("Teclea el número de control:");
        promedio=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el promedio actual"));
    }
    String mostrar(){
          String aux; 
        aux="Nombre del Alumno: "+nombre+"\nNúmero de control: "+NumControl+"\nPromedio: "+promedio+"\nMonto de la beca: "+monto;
        return (aux);
     }
    void calcular() {
        if (promedio>=95){
            monto=(3500*1);
        }
        else{
            if(promedio>=85 && promedio<95){
                monto=(2500*1);  
            }
            else{
                if(promedio>=75 && promedio<85){
                    monto=(1500*1);
                }
                else{
                    if(promedio>=70 && promedio<75){
                        monto=(500*1);
                    }
                    else{
                        if (promedio<70){
                            monto=(0.00*1);
                        }
                    }
                }
                
            }
        }
        
                    }
                }
            
        
            
    
     
    


package video_23;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Video_23 {

    public static void main(String[] args) {
        //Excepciones: son problemas o errores que pueden ocurrir mientras se ejecuta nuestra aplicación
        int x, y, i=0;
        int vector[] = {1,4,6,3,2};
        boolean errores = false;
        
        try{ //Código donde puede ocurrir una excepción o error
            x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero entero: ", "Solicitando Datos",3));
            y = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa otro numero entero: ", "Solicitando Datos",3));
            JOptionPane.showMessageDialog(null,"La división de " + x + "/" + y + " es de: " + (x/y), "Mostrando resultado",1);
            
            for (i = 0; i <= 4; i++) {
                System.out.println("{" + vector[i] + "}");
            }
        }catch(HeadlessException | NumberFormatException n){
            errores = true;
            System.out.println(n.getMessage() + " No es un numero entero.");
        }catch(ArithmeticException a){
            errores = true;
            System.out.println(a.getMessage() + " No es posible dividir entre cero");
        }catch(ArrayIndexOutOfBoundsException ar){
            errores = true;
            System.out.println(ar.getMessage() + " El indice " + i + " no existe");
        }finally{
            if (errores == false) {
                System.out.println("");
                System.out.println("Todo concluyo OK");
            }else{
                System.out.println("Todo concluyo con errores.");
            }
            System.out.println("Esta sección siempre se ejecuta.");
        }
    }
}

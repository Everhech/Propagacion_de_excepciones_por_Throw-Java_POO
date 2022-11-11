package video_24;

import javax.swing.JOptionPane;

public class Video_24 {

    public static void main(String[] args) {
        int x, y, i=0;
        
        try {
            x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero entero: ", "Solicitando Datos",3));
            y = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa otro numero entero: ", "Solicitando Datos",3));
            
            //Manejando excepciones mediante throw
            if (y==0) {
                //Creando una excepcion de tipo throw
                throw new ArithmeticException("Error en y = " + y);
            }else{
                JOptionPane.showMessageDialog(null,"La división de " + x + "/" + y + " es de: " + (x/y), "Mostrando resultado",1);
            }
            
        } catch (ArithmeticException ar) {
            System.out.println(ar.getMessage() + " No se puede dividir entre cero.");
        } catch(Exception e){ //Generalizando las excepciones, es decir, cuando no se sepa que excepcion ocurrira
            System.out.println(e.getMessage() + " Error");
        }
    }
    
}

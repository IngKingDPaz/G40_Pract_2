/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g40_poo;

/**
 *
 * @author Ing_Rey
 */
import Modelo.Abanico;
import java.util.*;
public class G40_POO {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opc;
        String y;
        Scanner sc = new Scanner(System.in);
        Abanico obj_1 = new Abanico(); 
         System.out.println(" Abanico 1");
         System.out.println("Marca:"+obj_1.GetMarca());
         System.out.println("Estado:"+obj_1.GetEstado());
        System.out.println(" Abanico 3");
        Abanico obj_3 = new Abanico(true,"Sankey"); 
        System.out.println("Marca:"+obj_3.GetMarca());
         System.out.println("Estado:"+obj_3.GetEstado());
        
//        Abanico obj_2 = new Abanico(); 
//       System.out.println("Ingrese color Abanico 1");
//        String color=sc.next();
//        obj_1.SetColor(color);  
//        obj_1.SetEstado(false);
//          System.out.println("Ingrese color Abanico 2");
//          color=sc.next();
//        obj_2.SetColor(color);
//        obj_2.SetEstado(true);
//        
//         System.out.println("Color: "+obj_1.GetColor());
//         System.out.println("Color: "+obj_2.GetColor());
//         
//         System.out.println("Estado:"+obj_1.GetEstado());
//         System.out.println("Estado:"+obj_2.GetEstado());

do
{
    System.out.println("Seleccione Opcion del Abanico \n 1.Encender \n 2.Apagar \n 3.Ver Estado \n 4.Salir");
    opc=sc.nextInt();
    
    switch(opc)
    {
        case 1:
            obj_1.Prender();
            break;  
        case 2:
            obj_1.Apagar();
            break;
        case 3:
            
            boolean sw=false;
            if(obj_1.GetEstado()==sw)
            {
               System.out.println("El Abanico está: Apagado");
            }
            else
            {
             System.out.println("El Abanico está: Encendido");
            }    
            break;
        case 4:
            opc=4;
            break;  
        default:
            System.out.println("Solo valores del Menu");
             System.out.println("Solo valores del Menu");
            break;
    }    
}
while(opc!=4);

         
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploscasemari;

/**
 *
 * @author Estudiantes
 */
public class EjemplosCaseMari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (source: System.in);
        
System.out.println("ingrese el caso a scannear" );
int dia = scanner.nextINT ();

switch (dia){
    case 1 -> System.out.println("lunes");
       case 2 -> System.out.println("martes");
          case 3 -> System.out.println("miercoles");
             case 4 -> System.out.println("jueves");
                case 5 -> System.out.println("viernes");
                   case 6 -> System.out.println("sabado");
                      case 7 -> System.out.println("domingo");
                      default  -> System.out.println("numero de dia invalido");
}
    }
}

               
}
}

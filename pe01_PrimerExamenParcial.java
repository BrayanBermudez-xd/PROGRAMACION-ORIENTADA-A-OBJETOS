//pe01_PrimerExamenParcial.java - Una escuela ha organizado un curso de técnicas avanzadas de programación y desea llevar el control de la
//inscripción de los participantes y el dinero recaudado.


import java.util.Scanner;


public class pe01_PrimerExamenParcial {
    public static void main(String[] args) {
        String nombre;
        int edad, cont, contH, contM, contA, contD, contT, contR;
        int totH, totM, totA, totD, totT, totR,totp, prom;
        char sexo, participante ,resp ;
        cont = 1;
        edad=contH= contM= contA= contD= contT= contR=0;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();


        do {
        System.out.println("\nconteo: " + cont++);

    
        System.out.println("Dame tu nombre ??"); nombre = obj.next();
        System.out.println("Dame tu edad    ?"); edad = obj.nextInt();
        System.out.println("que sexo eres ?");
        System.out.println("[H]ombre ");
        System.out.println("[M]ujer  ");
        sexo = Character.toUpperCase( obj.next().charAt(0) );
        
        System.out.println("Que tipo de personal eres?");
        System.out.println("[A]lumno      $40");
        System.out.println("[D]ocente     $60");
        System.out.println("[T]rabajador  $80");
        participante = Character.toUpperCase( obj.next().charAt(0) );

       switch (sexo) {
        case 'H': contH = sexo;  
                totH = contH +=1;        
            break;
       case 'M' : contM = sexo;
                totM = contM +=1;
        default:
            break;
       }

        switch (participante) {
            case 'D':System.out.printf("BIENVENIDO " + participante + "" + nombre + " ahora formas parte de nuestras lienas" );
                    contD = participante;
                    totD = contD +=1;
            break;
            case 'T': System.out.printf("BIENVENIDO " + participante + "" + nombre + " ahora formas parte de nuestras lienas" );
                    contT = participante; 
                    totT = contT +=1;
            break;
            case'A': if (edad <= 23) {
                System.out.printf("BIENVENIDO "+ participante + "" + nombre + " ahora formas parte de nuestras lienas" );
                contA = participante; 
                totA = contA +=1;
                break;

            }
                else{
                    System.out.println("lo lamento solo admitimos a mayores de 23");
                    contR = participante;
                    totR = contR +=1;
                    
                
                
            }
            default:
                System.out.println("Por favor escoge una opcion valida");
                break;
        }
        
       
        System.out.print("\nDeseas continuar (S/N)?");
        resp = Character.toUpperCase(obj.next().charAt(0));

    } while (resp != 'N');

    System.out.println("resumen de ingresados ");
    System.out.println("inscripciones realizadas " + (cont - 1));

    totp = totA + totD + totT;
    prom = participante / edad;
    System.out.printf("Total, de Alumnos                              : %d ",totA );
    System.out.printf("Total, de Docentes                             : %d ",totD );
    System.out.printf("Total, de Trabajadores                         : %d ",totT );
    System.out.printf("Total, de Hombres en general                   : %d ",totH );
    System.out.printf("Total, de Mujeres en general                   : %d ",totM );
    System.out.printf("Total, de todos los participantes              : %d ",totp);
    System.out.printf("Promedio de la edad de todos los participantes : %d ",prom );
    System.out.printf("TTotal, de rechazados                          : %d ",totR );

    



    }   
}

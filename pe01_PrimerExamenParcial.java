//pe01_PrimerExamenParcial.java - Una escuela ha organizado un curso de técnicas avanzadas de programación y desea llevar el control de la
//inscripción de los participantes y el dinero recaudado.


import java.util.Scanner;


public class pe01_PrimerExamenParcial {
    public static void main(String[] args) {
        String nombre;
        int edad, cont, contH, contM, a , z, y, fin;
        int contA, contD, contT, contR;
        int totH, totM, totA, totD, totT, totR,totp, prom;
        char sexo, participante ,resp ;
        cont = 1;
        edad= contH= contM= contA= contD= contT= contR= totH= totM= totA= totD= totT= totR=totp= prom= 0;
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
                totH +=1;        
            break;
       case 'M' : contM = sexo;
                totM +=1;
        default:
            break;
       }

        switch (participante) {
            case 'D':System.out.printf("BIENVENIDO " + participante + "" + nombre + " ahora formas parte de nuestras lienas" );
                    contD = participante;
                    totD +=1;
            break;
            case 'T': System.out.printf("BIENVENIDO " + participante + "" + nombre + " ahora formas parte de nuestras lienas" );
                    contT = participante; 
                    totT +=1;
            break;
            case'A': if (edad <= 23) {
                System.out.printf("BIENVENIDO "+ participante + "" + nombre + " ahora formas parte de nuestras lienas" );
                contA = participante; 
                totA +=1;
                break;

            }
                else{
                    System.out.println("lo lamento solo admitimos a mayores de 23");
                    contR = participante;
                    totR +=1;
                    
                
                
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
    prom = edad+edad/participante  ;
    a = totA * 40;
    z = totD * 60;
    y = totT * 80;
    fin = a+z+y;

    System.out.printf("\nTotal, de Alumnos                              : %d ",totA );
    System.out.printf("\nTotal, de Docentes                             : %d ",totD );
    System.out.printf("\nTotal, de Trabajadores                         : %d ",totT );
    System.out.printf("\nTotal, de Hombres en general                   : %d ",totH );
    System.out.printf("\nTotal, de Mujeres en general                   : %d ",totM );
    System.out.printf("\nTotal, de todos los participantes              : %d ",totp);
    System.out.printf("\nPromedio de la edad de todos los participantes : %d ",prom );
    System.out.printf("\nTotal, de rechazados                           : %d ",totR );


    System.out.printf("\ntotal de dinero recaudado por Alumnos                     : %d    ",a);
    System.out.printf("\ntotal de dinero recaudado por Docentes                    : %d    ",z);
    System.out.printf("\ntotal de dinero recaudado por Trabajadores                : %d    ",y);
    System.out.printf("\ntotal de dinero en general de todos los participantes     : %d    ",fin);

    if (fin < 50) {
        System.out.println("\nEl evento concluye con ganacias bajas");
        
    }if (fin > 50 && fin < 1000) {
        System.out.println("\nEl evento concluye con ganacias moderadas");

        
    }if (fin > 1000) {
        System.out.println("\nEl evento concluye con ganacias superadas");

    }
        
    
    }   
}

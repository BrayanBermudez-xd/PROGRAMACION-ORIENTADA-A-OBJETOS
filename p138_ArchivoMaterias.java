import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class p138_ArchivoMaterias {
    public static void capturarDatos(ArrayList<String> datos){
        String dato = "";
        System.out.println("\nIntroduce el  nombre de una materia y presiona <Enter>, dato vacio para terminar: ");
        while (true) {
            dato = new Scanner(System.in).nextLine();
            if (dato.isEmpty()) break;
            datos.add(dato);
            
        }
    }

    public static void mostrarDatos(ArrayList<String> datos){
        System.out.println("\nLos datos hasta el momento son: ");
        for (String dato : datos )
        System.out.println(dato);
    }
    public static void grabarDatos(String archivo, ArrayList<String> datos) throws  IOException{
        BufferedWriter fdatos = new BufferedWriter(new FileWriter(new File(archivo)));
        for (String dato : datos)
        fdatos.write(dato + "\n");
        fdatos.close();
    }
    
    public static ArrayList<String> leerDatos(String archivo) throws IOException{
        ArrayList<String> datos = new ArrayList<>();
        BufferedReader fdatos = new BufferedReader(new FileReader(new File(archivo)));
        String dato;
        while ((dato = fdatos.readLine()) !=null) 
            datos.add(dato);
            return datos;
    }
    public static void main(String[] args) {
        int op=0;
        Scanner obj = new Scanner(System.in);
        ArrayList<String> datos = new ArrayList<>();
        String archivo = "materias.txt";

        do {
            System.out.print("\033[H\033[2J");
            System.out.println("---------Captura de Materias---------");
            System.out.println("Capturar Datos................. [1]");
            System.out.println("Grabar materias en archivo........ [2]");
            System.out.println("Leer materias en archivo.......... [3]");
            System.out.println("Mostrar materias en archivo........[4]");
            System.out.println("S A L I R.......................[5]");
            System.out.print("Seleccionar una opcion? "); op = new Scanner(System.in).nextInt();
            switch (op) {
                case 1:
                System.out.println("\nCaptura de materias..."); 
                capturarDatos(datos); break;

                case 2:
                System.out.println("\nGrabando materias en archivo...");
                try {
                    grabarDatos(archivo, datos);
                    
                } catch (Exception e) {
                   System.out.println("Error al grabar el archivo");
                }
                break;

                case 3:
                System.out.println("\nLeyendo materias en archivo..."); 
                try {
                    datos = leerDatos(archivo);
                } catch (Exception e) {
                    System.out.println("Error leyendo el archivo");
                    break;
                }
                case 4:
                System.out.println("\nMostrando materias en archivo...");
                mostrarDatos(datos); break;
                case 5:
                System.out.println("\nSaliendo del sistema..."); break;
            
                default:
                System.out.println("\nOpcion invalida");
                    break;
            }
            System.out.println("\n<<Presione cualquier tecla para continuar>>"); obj.nextLine(); obj.nextLine();
    
            
        } while (op!=5);
        System.out.println("\nProceso terminado");
    }
    



}
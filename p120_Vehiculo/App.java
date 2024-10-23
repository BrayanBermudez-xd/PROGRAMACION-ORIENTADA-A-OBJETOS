package p120_Vehiculo;

public class App {
    public static void main(String[] args) {
        Sedan miSedan = new Sedan("Vochito","Maria Diaz", 4);
        suv miSuv = new suv("La mamalona", "Carlos Castañeda", 6);

        System.out.print("\033[H\033[2J");
        System.out.println(miSedan);
        miSedan.SistemaElectrico();
        miSedan.CombustionInterna();
        miSedan.Carroceria();
        miSedan.ChasisMonocasco();
        miSedan.repostar();
        miSedan.arrancar();
        miSedan.frenar();
        System.out.println("");

        System.out.println(miSuv);
        miSuv.SistemaElectrico();
        miSuv.CombustionInterna();
        miSuv.Traccion4x4();
        miSuv.ChasisIndependiente();
        miSuv.repostar();
        miSuv.arrancar();
        miSuv.frenar();
        System.out.println("");

    }
}

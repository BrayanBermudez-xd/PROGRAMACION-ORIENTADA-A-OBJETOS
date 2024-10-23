package p119_Organismo;

public class App {
    public static void main(String[] args) {
        Perro miPerro= new Perro("maradona");
        perico mPerico= new perico("Chip");
        System.out.print("\033[H\033[2J");

        System.out.println("Mi perro se llama " + miPerro.getNombre());
        miPerro.respiracion();
        miPerro.movimiento();
        miPerro.crecimiento();
        miPerro.multiCelular();
        miPerro.SangreCaliente();
        miPerro.Correr();
        miPerro.cuatroPatas();
        System.out.println("");


        mPerico.respiracion();
        mPerico.movimiento();
        mPerico.crecimiento();
        mPerico.multiCelular();
        mPerico.SangreCaliente();
        mPerico.Volar();
        mPerico.dosPatas();
        System.out.println("");
    }
}

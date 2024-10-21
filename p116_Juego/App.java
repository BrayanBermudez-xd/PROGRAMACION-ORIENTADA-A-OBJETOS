package p116_Juego;

public class App {
    public static void main(String[] args) {
        JuegosDados miDados = new JuegosDados();


        System.out.print("\033[H\033[2J"); System.out.flush();

        miDados.Iniciar();
        miDados.jugar();
        miDados.Finalizar();

        Juegodivina mJuegodivina = new Juegodivina();
        mJuegodivina.Iniciar();
        mJuegodivina.jugar();
        mJuegodivina.Finalizar();
    }
}

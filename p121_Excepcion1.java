public class p121_Excepcion1 {
    public static void main(String[] args) {
        int a = 100;
        int b = 0;
        
        System.out.print("\033[H\033[2J");


        try {
            int c = a / b;
    
            System.out.println(" el resultado es " + c);
            
        } catch (Exception e) {
            System.out.println(" No se puede dividir entre 0 no seas pendejo...." + e);
        } finally {
            System.out.println("Este mensaje se imptime se genere o no la exepcion...");
        }

        System.out.println("ya estas fuera de peligro pibe xd");
    }
}

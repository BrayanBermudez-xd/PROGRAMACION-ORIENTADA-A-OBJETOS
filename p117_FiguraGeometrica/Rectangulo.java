package p117_FiguraGeometrica;

public class Rectangulo implements FiguraGeometrica,Ajustar{
    private double alto, ancho;

    public Rectangulo(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public double getArea() {
        
        return alto * ancho;
    }

    @Override
    public double getPerimetro() {
        // TODO Auto-generated method stub
        return 2 *alto*ancho;
    }

    @Override
    public void ajustar(double Porcenyaje) {
        // TODO Auto-generated method stub
        alto += alto*Porcenyaje;
        ancho += ancho*Porcenyaje;
    }

    @Override
    public String toString() {
        return "Rectangulo [alto=" + alto + ", ancho=" + ancho + ", getArea()=" + getArea() + ", getPerimetro()="
                + getPerimetro() + "]";
    }

    
    
   
    
}

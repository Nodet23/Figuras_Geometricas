

public class GestorFiguras {
    public double Suma(Figuras[] f){
        double suma=0;
        for (int i=0;i<10;i++) {
            suma=suma+f[i].area();
        }
        return suma;
    }
}

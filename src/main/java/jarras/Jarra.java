package jarras;

public class Jarra {

    private final double capacidad;
    private double contenido;

    // CONSTRUCTOR
    public Jarra(int capacidad){
        if (capacidad <= 0){
            throw new RuntimeException("La capacidad de la Jarra debe ser POSITIVA (MAYOR QUE 0)");
        }
        this.capacidad = capacidad;
        this.contenido = 0;
    }

}

package jarras;

public class Mesa {
    /*public enum Posicion {
        Izquierda,
        Derecha
    }*/

    // CONSTRUCTORES

    private Jarra jarraIzq, jarraDer;

    public Mesa (Jarra jarraIzq, Jarra jarraDer){
        if (jarraIzq==jarraDer){
            throw new RuntimeException("No pueden ser la misma Jarra");
        }
        this.jarraIzq = jarraIzq;
        this.jarraDer = jarraDer;
    }

    public Mesa (int cIzq, int cDer ){
        this.jarraIzq = new Jarra(cIzq);
        this.jarraDer = new Jarra(cDer);
    }

}

package jarras;

public class Mesa {

    public enum Posicion {
        Izquierda,
        Derecha
    }

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

    public int capacidad(Posicion id) {
        return switch (id) {
            case Izquierda -> jarraIzq.capacidad();
            case Derecha -> jarraDer.capacidad();
        };
    }

    public int contenido(Posicion id){
        return switch (id){
            case Izquierda -> jarraIzq.contenido();
            case Derecha -> jarraDer.contenido();
        };
    }

    public void llena (Posicion id){
        switch (id){
            case Izquierda -> jarraIzq.llena();
            case Derecha -> jarraDer.llena();
        };
    }

    public void vacia (Posicion id){
        switch (id){
            case Izquierda -> jarraIzq.vacia();
            case Derecha -> jarraDer.vacia();
        };
    }

    public void llenaDesde (Posicion id){
        switch (id){
            case Izquierda -> jarraIzq.llenaDesde(jarraDer);
            case Derecha -> jarraDer.llenaDesde(jarraIzq);
        };
    }

    @Override
    public String toString(){
        return "M(J("+jarraIzq.capacidad()+","+jarraIzq.contenido()
                +") ,J("+jarraDer.capacidad()+","+jarraDer.contenido()+"))";
    }



}

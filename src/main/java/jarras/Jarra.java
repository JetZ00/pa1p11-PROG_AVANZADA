package jarras;

public class Jarra {

    final int capacidad;
    int  contenido;

    // CONSTRUCTOR
    public Jarra(int capacidad){
        if (capacidad <= 0){
            throw new RuntimeException("La capacidad de la Jarra debe ser POSITIVA (MAYOR QUE 0)");
        }
        this.capacidad = capacidad;
        this.contenido = 0;
    }

    // GETTERS (ALT+INSERT)
    public int capacidad() {
        return capacidad;
    }

    public int contenido() {
        return contenido;
    }

    public void llena() {
        this.contenido = capacidad;
    }

    public void vacia() {
        this.contenido = 0;
    }

    public void llenaDesde(Jarra otra){
        if (this == otra) {
            throw new RuntimeException("No se puede transferir de una Jarra hacia si misma");
        }

        /*
         Comparamos que cantidad se procede a traspasar, es decir:
         ¿Cual de las dos es la cantidad a mover?

         Pues se procederá o bien mediante el espacio que queda en THIS, o bien con lo que tiene OTRA
         Sea cual sea de las dos, traspasará o bien, el maximo permitido en THIS
                                             o bien, el maximo que puede traspasar OTRA
         */

        int espacioDisponible = this.capacidad - this.contenido;
        int cantidadATransvasar = Math.min(espacioDisponible,otra.contenido);

        this.contenido += cantidadATransvasar;
        otra.contenido -= cantidadATransvasar;
    }

    @Override
    public String toString(){
        return ("J("+this.capacidad+","+this.contenido+")");
    }

}

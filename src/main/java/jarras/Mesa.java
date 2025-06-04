package jarras;

public class Mesa {

    // CONSTRUCTOR
    public Mesa(Jarra jarraA, Jarra jarraB){
        if (jarraA==jarraB){
            throw new RuntimeException("No pueden ser ambas Jarras la misma")
        }
        this.jarraA = jarraA;
        this.jarraB = jarraB;
    }

}

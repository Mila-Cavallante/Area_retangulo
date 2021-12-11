//Exercicio 2
package arearetangulo;

/**
 *
 * @author camil
 */
public class Retangulo {
    private int ladoA;
    

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }
    private int ladoB;

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }
    
    public int getArea(){ //método para calcular área
        return ladoA*ladoB;
    }
        
}

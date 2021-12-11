//exerccio 2
package arearetangulo;
/**
 *
 * @author camil
 */
public class AreaRetangulo {

    public static void main(String[] args) {
        
        Retangulo ret = new Retangulo();//instanciando 
        ret.setLadoA(4);//set valor
        ret.setLadoB(5);//set valor
        
        System.out.print("A área do retangulo é " + ret.getArea() + " cm².");
        
    }
    
}

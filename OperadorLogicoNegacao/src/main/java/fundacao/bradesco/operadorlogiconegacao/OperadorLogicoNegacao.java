package fundacao.bradesco.operadorlogiconegacao;

/**
 * Demosntrando o operador logico de negação (!)
 *
 * @author diarley
 */
public class OperadorLogicoNegacao {

    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;
        boolean c = false;

        System.out.println(!a);
        System.out.println(!(b || c));
    }
}
package fundacao.bradesco.arraysimples;

import java.util.Arrays;

/**
 * Demonstração de um array simples
 * Paises do BRICS
 * @author diarley
 */
public class ArraySimples {

    public static void main(String[] args) {
        
        String[] paises = {"Brasil", "Rússia", "India", "China"};
        
        System.out.println(paises[0]);
        System.out.println(Arrays.toString(paises));
        
        int posicao = Arrays.binarySearch(paises, "Brasil");
        System.out.println(posicao);
        
        // Ordena o array e iniciando em zero
        Arrays.sort(paises, 0 , paises.length); 
        System.out.println(Arrays.toString(paises)); // Imprime o resultado
    }
}
import java.util.ArrayList;
import java.util.Collections;

public class ListaDeNumeros {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(456);
        numeros.add(1566);
        numeros.add(12);
        numeros.add(169);

        Collections.sort(numeros);

        System.out.println("Lista de Numeros: " + numeros);
    }
}

import java.util.HashMap;
import java.util.Map;

public class EjerciciosPD {

    public long getFibonaci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return getFibonaci(n - 1) + getFibonaci(n - 2);
        }
    }

    public Long getFibonaciPD(int n) {
        Map<Integer, Long> cache = new HashMap<>();
        return getFibonaciPDHelper(n, cache);
    }

    private Long getFibonaciPDHelper(int n, Map<Integer, Long> arr) {
        if (n <= 1) {
            return (long) n;
        }
        if (arr.containsKey(n)) {
            return arr.get(n);
        }
        Long resultado = getFibonaciPDHelper(n - 1, arr) + getFibonaciPDHelper(n - 2, arr);
        arr.put(n, resultado);
        return resultado;
    }

}

public class EjerciciosPD {

    public int getFibonaci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return getFibonaci(n - 1) + getFibonaci(n - 2);
        }
    }

    public int getFibonaciPD(int n) {
        int[] arr = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            arr[i] = -1;
        }
        return getFibonaciPD(n, arr);
    }

    private int getFibonaciPD(int i, int[] arr) {
        if (arr[i] != -1) {
            return arr[i];
        }

        if (i <= 1) {
            arr[i] = i;
        } else {
            arr[i] = getFibonaciPD(i - 1, arr) + getFibonaciPD(i - 2, arr);
        }

        return arr[i];
    }

}

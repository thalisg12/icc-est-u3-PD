public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Thalia Sagbay");
        runEjerciciosPD();
    }

    private static void runEjerciciosPD() {
        EjerciciosPD ejerciciosPD = new EjerciciosPD();

        System.out.println("Fibonacci Recursivo");
        long inicio1 = System.nanoTime();
        long resultado1 = ejerciciosPD.getFibonaci(100);
        long fin1 = System.nanoTime();
        long duracion1 = fin1 - inicio1;
        System.out.println("Resultado = " + resultado1 + " en tiempo = " + duracion1 + " ns");

        System.out.println("Fibonacci con Caching");
        long inicio2 = System.nanoTime();
        Long resultado2 = ejerciciosPD.getFibonaciPD(100);
        long fin2 = System.nanoTime();
        long duracion2 = fin2 - inicio2;
        System.out.println("Resultado = " + resultado2 + " en tiempo = " + duracion2 + " ns");
    }
}

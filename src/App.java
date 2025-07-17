import java.util.Arrays;
import java.util.List;

import controllers.Maze;
import controllers.MazeSolver;
import controllers.MazeSolverRecursivo;
import models.Cells;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Thalia Sagbay");
        // runEjerciciosPD();
        runEjercicio1PD();
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

    private static void runMaze() {
        boolean[][] predefinedMaze = {
                { true, true, true, true },
                { false, true, true, true },
                { true, true, false, false },
                { true, true, true, true }
        };

        Maze maze = new Maze(predefinedMaze);
        System.out.println("Laberinto cargado:");
        maze.printMaze();

        Cells start = new Cells(0, 0);
        Cells end = new Cells(3, 3);

        List<MazeSolver> solvers = Arrays.asList(
                new MazeSolverRecursivo());

        MazeSolver solver = solvers.get(0);
        List<Cells> path = solver.getPath(maze.getMaze(), start, end);

        System.out.println("Camino encontrado: " + path);
    }

    private static void runEjercicio1PD() {
        runMaze();
    }
}

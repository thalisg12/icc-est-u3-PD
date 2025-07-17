package controllers;

public class Maze {
    private boolean[][] maze;

    public Maze(boolean[][] maze) {
        this.maze = maze;
    }

    public void printMaze() {
        for (boolean[] fila : maze) {
            for (boolean celda : fila) {
                System.out.print(celda ? "-" : "*");
            }
            System.out.println();
        }
    }

    public boolean[][] getMaze() {
        return maze;
    }
}

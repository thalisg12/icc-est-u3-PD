package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Cells;

public class MazeSolverRecursivo implements MazeSolver {

    @Override
    public List<Cells> getPath(boolean[][] grid, Cells start, Cells end) {
        if (grid == null || grid.length == 0) {
            return new ArrayList<>();
        }

        List<Cells> path = new ArrayList<>();
        if (findPath(grid, start, end, path)) {
            return path;
        }
        return new ArrayList<>();
    }

    private boolean findPath(boolean[][] grid, Cells current, Cells end, List<Cells> path) {
        int row = current.row;
        int col = current.col;

        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || !grid[row][col]) {
            return false;
        }

        grid[row][col] = false;

        if (row == end.row && col == end.col) {
            path.add(current);
            return true;
        }

        if (findPath(grid, new Cells(row + 1, col), end, path)) {
            path.add(current);
            return true;
        }

        if (findPath(grid, new Cells(row, col + 1), end, path)) {
            path.add(current);
            return true;
        }

        return false;
    }
}

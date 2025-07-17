package controllers;

import java.util.List;
import models.Cells;

public interface MazeSolver {
    List<Cells> getPath(boolean[][] grid, Cells start, Cells end);
}

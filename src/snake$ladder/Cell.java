package snake$ladder;

public class Cell {
    int cellNumber;
    Jump jump;
    int value;

    Cell(int cellNumber, Jump jump) {
        this.cellNumber = cellNumber;
        this.jump = jump;
    }
}

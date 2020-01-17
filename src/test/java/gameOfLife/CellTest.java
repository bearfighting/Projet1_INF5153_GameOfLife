package gameOfLife;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CellTest {
    Cell cell;
    @Before
    public void createCell() {
        cell = new Cell(Etats.Dead);
    }

    @Test
    public void testToString() {
        assertEquals(cell.toString(), "0");
        cell.setEtat(Etats.Living);
        assertEquals(cell.toString(), "1");
    }
}
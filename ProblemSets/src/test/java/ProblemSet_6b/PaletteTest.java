package ProblemSet_6b;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PaletteTest {

    @Test
    public void testAddColour() {
	Palette p1 = new Palette();
	p1.addColour(P_COLOUR.RED);
	p1.addColour(P_COLOUR.YELLOW);
	assertEquals("RED, YELLOW", p1.getColours());
    }

    @Test
    public void testPalette() {
	P_COLOUR[] colourArray = new P_COLOUR[] { P_COLOUR.BLUE, P_COLOUR.YELLOW, null };
	Palette p2 = new Palette(colourArray);
    }

    @Test
    public void testPaletteColourArray() {
	P_COLOUR[] colourArray = new P_COLOUR[] { P_COLOUR.BLUE, P_COLOUR.YELLOW, null };
	Palette p2 = new Palette(colourArray);
	assertEquals("BLUE, YELLOW", p2.getColours());
    }

    @Test
    public void testPaletteEmpty() {
	Palette p1 = new Palette();
    }

    @Test
    public void testPaletteSizeZero() {
	Palette p1 = new Palette();
	assertEquals("No colours added", p1.getColours());
    }

}

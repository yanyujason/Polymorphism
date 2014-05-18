package bester;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by yyan on 5/15/14.
 */
public class BesterTest {
    private Bester bester;

    @Before
    public void setup() {
        bester = new Bester();
    }

    @Test
    public void shouldReturnBestRectangle() {
        List<Bestable> rectangles = new ArrayList<Bestable>();
        for (int i = 1; i < 5; i++) {
            rectangles.add(new Rectangle(1, i));
        }
        assertEquals(rectangles.get(3), bester.best(rectangles));
    }

    @Test
    public void shouldReturnBestCookie(){
        List<Bestable> cookies = new ArrayList<Bestable>();
        for (int i = 1; i < 5; i++) {
            cookies.add(new Cookie(i));
        }
        assertEquals(cookies.get(3), bester.best(cookies));
    }
}

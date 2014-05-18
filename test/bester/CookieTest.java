package bester;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by yyan on 5/15/14.
 */
public class CookieTest {
    @Test
    public void shouldReturnBetterCookie(){
        assertTrue(new Cookie(2).isBetterThan(new Cookie(1)));
    }
}

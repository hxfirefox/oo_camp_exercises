package github.hxfirefox.guantity;

import org.junit.Test;

import static github.hxfirefox.guantity.LenUnit.*;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QuantityTest {
    @Test
    public void should_1_mile_equals_1_mile() throws Exception {
        // given
        final Quantity<LenUnit> oneMile = new Quantity(1, createMile());
        // when

        // then
        assertThat(oneMile.equals(oneMile), is(true));
    }
}

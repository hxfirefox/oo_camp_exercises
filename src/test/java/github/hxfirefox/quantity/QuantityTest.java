package github.hxfirefox.quantity;

import org.junit.Test;

import static github.hxfirefox.quantity.LenUnit.*;
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

    @Test
    public void should_1_mile_equals_1760_yard() throws Exception {
        // given
        final Quantity<LenUnit> oneMile = new Quantity(1, createMile());
        final Quantity<LenUnit> yard = new Quantity(1760, LenUnit.createYard());
        // when

        // then
        assertThat(oneMile.equals(yard), is(true));
    }

    @Test
    public void should_1762_yard_equals_1_mile_add_2_yard() throws Exception {
        // given
        final Quantity<LenUnit> oneMile = new Quantity(1, createMile());
        final Quantity<LenUnit> totalYard = new Quantity(1762, LenUnit.createYard());
        final Quantity<LenUnit> yard = new Quantity(2, LenUnit.createYard());
        // when

        // then
        assertThat(totalYard.equals(oneMile.add(yard)), is(true));
    }

    @Test
    public void should_1_tbsp_equals_3_tsp() throws Exception {
        // given
        final Quantity<VolUnit> oneTbsp = new Quantity(1, VolUnit.createTbsp());
        final Quantity<VolUnit> threeTsp = new Quantity(3, VolUnit.createTsp());
        // when

        // then
        assertThat(oneTbsp.equals(threeTsp), is(true));
    }
}

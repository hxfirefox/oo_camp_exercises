package github.hxfirefox.lengthunit;

import org.junit.Test;

import static github.hxfirefox.lengthunit.Length.feet;
import static github.hxfirefox.lengthunit.Length.inch;
import static junit.framework.TestCase.assertFalse;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FeetTest {
    @Test
    public void should_3_feet_equals_3_feet() throws Exception {
        // given

        // when

        // then
        assertThat(feet(3).equals(feet(3)), is(true));
    }

    @Test
    public void should_3_feet_not_equals_2_feet() throws Exception {
        // given

        // when

        // then
        assertFalse(feet(3).equals(feet(2)));
    }

    @Test
    public void should_5_feet_equals_1_feet_add_4_feet() throws Exception {
        // given

        // when

        // then
        assertThat(feet(5).equals(feet(1).add(feet(4))), is(true));
    }

    @Test
    public void should_1_feet_equals_3_inch() throws Exception {
        // given

        // when

        // then
        assertThat(feet(1).equals(inch(3)), is(true));
    }
}
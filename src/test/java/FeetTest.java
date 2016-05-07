import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FeetTest {
    @Test
    public void should_3_feet_equals_3_feet() throws Exception {
        // given

        // when

        // then
        assertThat(new Feet(3).equals(new Feet(3)), is(true));
    }

    @Test
    public void should_3_feet_not_equals_2_feet() throws Exception {
        // given

        // when

        // then
        assertFalse(new Feet(3).equals(new Feet(2)));
    }

    @Test
    public void should_5_feet_equals_1_feet_add_4_feet() throws Exception {
        // given

        // when

        // then
        assertThat(new Feet(5).equals(new Feet(1).add(new Feet(4))), is(true));
    }
}

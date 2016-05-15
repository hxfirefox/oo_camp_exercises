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
        assertThat(Length.feet(3).equals(Length.feet(3)), is(true));
    }

    @Test
    public void should_3_feet_not_equals_2_feet() throws Exception {
        // given

        // when

        // then
        assertFalse(Length.feet(3).equals(Length.feet(2)));
    }

    @Test
    public void should_5_feet_equals_1_feet_add_4_feet() throws Exception {
        // given

        // when

        // then
        assertThat(Length.feet(5).equals(Length.feet(1).add(Length.feet(4))), is(true));
    }

    @Test
    public void should_1_feet_equals_3_inch() throws Exception {
        // given

        // when

        // then
        assertThat(Length.feet(1).equals(Length.inch(3)), is(true));
    }
}

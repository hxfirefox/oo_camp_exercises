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
        assertThat(Length.createFeet(3).equals(Length.createFeet(3)), is(true));
    }

    @Test
    public void should_3_feet_not_equals_2_feet() throws Exception {
        // given

        // when

        // then
        assertFalse(Length.createFeet(3).equals(Length.createFeet(2)));
    }

    @Test
    public void should_5_feet_equals_1_feet_add_4_feet() throws Exception {
        // given

        // when

        // then
        assertThat(Length.createFeet(5).equals(Length.createFeet(1).add(Length.createFeet(4))), is(true));
    }

    @Test
    public void should_1_feet_equals_3_inch() throws Exception {
        // given

        // when

        // then
        assertThat(Length.createFeet(1).equals(Length.createInch(3)), is(true));
    }
}

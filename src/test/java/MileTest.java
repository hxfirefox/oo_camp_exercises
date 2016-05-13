import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertTrue;

public class MileTest {
    @Test
    public void should_3_mile_equals_3_mile() throws Exception {
        // given

        // when

        // then
        assertThat(new Mile(3).equals(new Mile(3)), is(true));
    }

    @Test
    public void should_3_mile_not_equals_2_mile() throws Exception {
        // given

        // when

        // then
        assertFalse(new Mile(3).equals(new Mile(2)));
    }

    @Test
    public void should_5_mile_equals_1_mile_add_4_mile() throws Exception {
        // given

        // when

        // then
        assertThat(new Mile(5).equals(new Mile(1).add(new Mile(4))), is(true));
    }

    @Test
    public void should_1_mile_equals_1760_yard() throws Exception {
        // given

        // when

        // then
        assertThat(new Mile(1).equals(new Yard(1760)), is(true));
    }

    @Test
    public void should_1762_yard_equals_1_mile_add_2_yard() throws Exception {
        // given

        // when

        // then
        assertThat(new Yard(1762).equals(new Mile(1).add(new Yard(2))), is(true));
    }
}

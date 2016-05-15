import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MileTest {
    @Test
    public void should_3_mile_equals_3_mile() throws Exception {
        // given

        // when

        // then
        assertThat(Length.mile(3).equals(Length.mile(3)), is(true));
    }

    @Test
    public void should_3_mile_not_equals_2_mile() throws Exception {
        // given

        // when

        // then
        assertFalse(Length.mile(3).equals(Length.mile(2)));
    }

    @Test
    public void should_5_mile_equals_1_mile_add_4_mile() throws Exception {
        // given

        // when

        // then
        assertThat(Length.mile(5).equals(Length.mile(1).add(Length.mile(4))), is(true));
    }

    @Test
    public void should_1_mile_equals_1760_yard() throws Exception {
        // given

        // when

        // then
        assertThat(Length.mile(1).equals(Length.yard(1760)), is(true));
    }

    @Test
    public void should_1762_yard_equals_1_mile_add_2_yard() throws Exception {
        // given

        // when

        // then
        assertThat(Length.yard(1762).equals(Length.mile(1).add(Length.yard(2))), is(true));
    }
}

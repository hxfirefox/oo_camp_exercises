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
        assertThat(Length.createMile(3).equals(Length.createMile(3)), is(true));
    }

    @Test
    public void should_3_mile_not_equals_2_mile() throws Exception {
        // given

        // when

        // then
        assertFalse(Length.createMile(3).equals(Length.createMile(2)));
    }

    @Test
    public void should_5_mile_equals_1_mile_add_4_mile() throws Exception {
        // given

        // when

        // then
        assertThat(Length.createMile(5).equals(Length.createMile(1).add(Length.createMile(4))), is(true));
    }

    @Test
    public void should_1_mile_equals_1760_yard() throws Exception {
        // given

        // when

        // then
        assertThat(Length.createMile(1).equals(Length.createYard(1760)), is(true));
    }

    @Test
    public void should_1762_yard_equals_1_mile_add_2_yard() throws Exception {
        // given

        // when

        // then
        assertThat(Length.createYard(1762).equals(Length.createMile(1).add(Length.createYard(2))), is(true));
    }
}

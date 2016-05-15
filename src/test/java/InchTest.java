import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class InchTest {
    @Test
    public void should_3_inch_equals_3_inch() throws Exception {
        // given

        // when

        // then
        assertThat(Length.inch(3).equals(Length.inch(3)), is(true));
    }

    @Test
    public void should_3_inch_not_equals_2_inch() throws Exception {
        // given

        // when

        // then
        assertFalse(Length.inch(3).equals(Length.inch(2)));
    }

    @Test
    public void should_5_inch_equals_1_inch_add_4_inch() throws Exception {
        // given

        // when

        // then
        assertThat(Length.inch(5).equals(Length.inch(1).add(Length.inch(4))), is(true));
    }
}

package github.hxfirefox.lengthunit;

import org.junit.Test;

import static github.hxfirefox.lengthunit.Length.inch;
import static junit.framework.TestCase.assertFalse;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class InchTest {
    @Test
    public void should_3_inch_equals_3_inch() throws Exception {
        // given

        // when

        // then
        assertThat(inch(3).equals(inch(3)), is(true));
    }

    @Test
    public void should_3_inch_not_equals_2_inch() throws Exception {
        // given

        // when

        // then
        assertFalse(inch(3).equals(inch(2)));
    }

    @Test
    public void should_5_inch_equals_1_inch_add_4_inch() throws Exception {
        // given

        // when

        // then
        assertThat(inch(5).equals(inch(1).add(inch(4))), is(true));
    }
}

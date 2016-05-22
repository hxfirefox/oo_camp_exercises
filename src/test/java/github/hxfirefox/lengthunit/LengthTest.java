package github.hxfirefox.lengthunit;

import org.junit.Test;

import static github.hxfirefox.lengthunit.Length.inch;
import static github.hxfirefox.lengthunit.Length.mile;
import static github.hxfirefox.lengthunit.Length.yard;
import static junit.framework.TestCase.assertFalse;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class LengthTest {
    @Test
    public void should_3_mile_equals_3_mile() throws Exception {
        // given

        // when

        // then
        assertThat(mile(3).equals(mile(3)), is(true));
    }

    @Test
    public void should_3_mile_not_equals_2_mile() throws Exception {
        // given

        // when

        // then
        assertFalse(mile(3).equals(mile(2)));
    }

    @Test
    public void should_5_mile_equals_1_mile_add_4_mile() throws Exception {
        // given

        // when

        // then
        assertThat(mile(5).equals(mile(1).add(mile(4))), is(true));
    }

    @Test
    public void should_1_mile_equals_1760_yard() throws Exception {
        // given

        // when

        // then
        assertThat(mile(1).equals(yard(1760)), is(true));
    }

    @Test
    public void should_1762_yard_equals_1_mile_add_2_yard() throws Exception {
        // given

        // when

        // then
        assertThat(yard(1762).equals(mile(1).add(yard(2))), is(true));
    }

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

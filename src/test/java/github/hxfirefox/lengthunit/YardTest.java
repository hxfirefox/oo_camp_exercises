package github.hxfirefox.lengthunit;

import org.junit.Test;

import static github.hxfirefox.lengthunit.Length.feet;
import static github.hxfirefox.lengthunit.Length.yard;
import static junit.framework.TestCase.assertFalse;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class YardTest {
    @Test
    public void should_3_yard_equals_3_yard() throws Exception {
        // given

        // when

        // then
        assertThat(yard(3).equals(yard(3)), is(true));
    }

    @Test
    public void should_3_yard_not_equals_2_yard() throws Exception {
        // given

        // when

        // then
        assertFalse(yard(3).equals(yard(2)));
    }

    @Test
    public void should_5_yard_equals_1_yard_add_4_yard() throws Exception {
        // given

        // when

        // then
        assertThat(yard(5).equals(yard(1).add(yard(4))), is(true));
    }

    @Test
    public void should_1_yard_equals_12_feet() throws Exception {
        // given

        // when

        // then
        assertThat(yard(1).equals(feet(12)), is(true));
    }
}

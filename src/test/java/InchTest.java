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
        assertThat(Length.createInch(3).equals(Length.createInch(3)), is(true));
    }

    @Test
    public void should_3_inch_not_equals_2_inch() throws Exception {
        // given

        // when

        // then
        assertFalse(Length.createInch(3).equals(Length.createInch(2)));
    }

    @Test
    public void should_5_inch_equals_1_inch_add_4_inch() throws Exception {
        // given

        // when

        // then
        assertThat(Length.createInch(5).equals(Length.createInch(1).add(Length.createInch(4))), is(true));
    }
}

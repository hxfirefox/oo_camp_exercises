import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class YardTest {
    @Test
    public void should_3_yard_equals_3_yard() throws Exception {
        // given

        // when

        // then
        assertThat(new Yard(3).equals(new Yard(3)), is(true));
    }

    @Test
    public void should_3_yard_not_equals_2_yard() throws Exception {
        // given

        // when

        // then
        assertFalse(new Yard(3).equals(new Yard(2)));
    }

    @Test
    public void should_5_yard_equals_1_yard_add_4_yard() throws Exception {
        // given

        // when

        // then
        assertThat(new Yard(5).equals(new Yard(1).add(new Yard(4))), is(true));
    }
}

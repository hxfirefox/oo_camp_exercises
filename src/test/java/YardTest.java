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
        assertThat(Length.createYard(3).equals(Length.createYard(3)), is(true));
    }

    @Test
    public void should_3_yard_not_equals_2_yard() throws Exception {
        // given

        // when

        // then
        assertFalse(Length.createYard(3).equals(Length.createYard(2)));
    }

    @Test
    public void should_5_yard_equals_1_yard_add_4_yard() throws Exception {
        // given

        // when

        // then
        assertThat(Length.createYard(5).equals(Length.createYard(1).add(Length.createYard(4))), is(true));
    }

    @Test
    public void should_1_yard_equals_12_feet() throws Exception {
        // given

        // when

        // then
        assertThat(Length.createYard(1).equals(Length.createFeet(12)), is(true));
    }
}

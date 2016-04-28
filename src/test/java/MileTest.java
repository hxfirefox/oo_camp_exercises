import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertTrue;

public class MileTest {
    @Test
    public void should_3_mile_equals_3_mile() throws Exception {
        // given
        Mile mile = new Mile(3);
        // when

        // then
        assertThat(mile.equals(new Mile(3)), is(true));
    }
    public void should_3_mile_not_equals_2_mile() throws Exception {
        // given
        Mile mile = new Mile(3);
        // when

        // then
        assertFalse(mile.equals(new Mile(2)));
    }



}

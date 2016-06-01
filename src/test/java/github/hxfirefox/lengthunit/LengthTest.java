package github.hxfirefox.lengthunit;

import github.hxfirefox.formatter.FormatHandler;
import github.hxfirefox.formatter.Printable;
import org.junit.Test;

import static github.hxfirefox.lengthunit.Length.*;
import static junit.framework.TestCase.assertFalse;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class LengthTest {
    @Test
    public void should_3_feet_equals_3_feet() throws Exception {
        // given

        // when

        // then
        assertThat(feet(3).equals(feet(3)), is(true));
    }

    @Test
    public void should_3_feet_not_equals_2_feet() throws Exception {
        // given

        // when

        // then
        assertFalse(feet(3).equals(feet(2)));
    }

    @Test
    public void should_5_feet_equals_1_feet_add_4_feet() throws Exception {
        // given

        // when

        // then
        assertThat(feet(5).equals(feet(1).add(feet(4))), is(true));
    }

    @Test
    public void should_1_feet_equals_12_inch() throws Exception {
        // given

        // when

        // then
        assertThat(feet(1).equals(inch(12)), is(true));
    }

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
    public void should_1_yard_equals_3_feet() throws Exception {
        // given

        // when

        // then
        assertThat(yard(1).equals(feet(3)), is(true));
    }

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

    @Test
    public void should_output_0_inch_when_length_value_zero() throws Exception {
        // given

        // when

        // then
        assertThat(inch(0).withFormat(FormatHandler.getInstance()).toString(), is("0 INCH"));
        assertThat(mile(0).withFormat(FormatHandler.getInstance()).toString(), is("0 INCH"));
    }

    @Test
    public void should_output_1_inch() throws Exception {
        // given

        // when

        // then
        assertThat(inch(1).withFormat(FormatHandler.getInstance()).toString(), is("1 INCH"));
    }

    @Test
    public void should_output_1_feet_when_12_inch() throws Exception {
        // given

        // when

        // then
        assertThat(inch(12).withFormat(FormatHandler.getInstance()).toString(), is("1 FEET"));
    }

    @Test
    public void should_output_1_feet_2_inch_when_14_inch() throws Exception {
        // given

        // when

        // then
        assertThat(inch(14).withFormat(FormatHandler.getInstance()).toString(), is("1 FEET 2 INCH"));
    }

    @Test
    public void should_output_1_mile_2_yard_when_1762_yard() throws Exception {
        // given

        // when

        // then
        assertThat(yard(1762).withFormat(FormatHandler.getInstance()).toString(), is("1 MILE 2 YARD"));
    }

    @Test
    public void should_output_36_inch_when_1_yard() throws Exception {
        // given

        // when
        final String out = yard(1).format(length -> length.length * length.unit.getAmountOfBaseUnit() + " INCH");
        // then
        assertThat(out, is("36 INCH"));
    }
}

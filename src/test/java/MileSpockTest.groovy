import spock.lang.Specification

class MileSpockTest extends Specification {
    def "3 mile = 3 mile"() {
        given:

        when:

        expect:
        Length.mile(3).equals(Length.mile(3))
    }

    def "3 mile != 2 mile"() {
        given:

        when:

        expect:
        !Length.mile(3).equals(Length.mile(2))
    }

    def "5 mile = 1 mile + 4 mile"() {
        given:

        when:

        expect:
        Length.mile(5).equals(Length.mile(1).add(Length.mile(4)))
    }
}

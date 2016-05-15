import spock.lang.Specification

class MileSpockTest extends Specification {
    def "3 mile = 3 mile"() {
        given:

        when:

        expect:
        Length.createMile(3).equals(Length.createMile(3))
    }

    def "3 mile != 2 mile"() {
        given:

        when:

        expect:
        !Length.createMile(3).equals(Length.createMile(2))
    }

    def "5 mile = 1 mile + 4 mile"() {
        given:

        when:

        expect:
        Length.createMile(5).equals(Length.createMile(1).add(Length.createMile(4)))
    }
}

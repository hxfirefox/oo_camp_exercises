import spock.lang.Specification

class MileSpockTest extends Specification {
    def "3 mile = 3 mile"() {
        given:

        when:

        expect:
        new Mile(3).equals(new Mile(3))
    }

    def "3 mile != 2 mile"() {
        given:

        when:

        expect:
        !new Mile(3).equals(new Mile(2))
    }

    def "5 mile = 1 mile + 4 mile"() {
        given:

        when:

        expect:
        new Mile(5).equals(new Mile(1).add(new Mile(4)))
    }
}

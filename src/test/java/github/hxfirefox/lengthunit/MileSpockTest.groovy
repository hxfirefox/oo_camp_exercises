package github.hxfirefox.lengthunit

import spock.lang.Specification

import static github.hxfirefox.lengthunit.Length.mile

class MileSpockTest extends Specification {
    def "3 mile = 3 mile"() {
        given:

        when:

        expect:
        mile(3).equals(mile(3))
    }

    def "3 mile != 2 mile"() {
        given:

        when:

        expect:
        !mile(3).equals(mile(2))
    }

    def "5 mile = 1 mile + 4 mile"() {
        given:

        when:

        expect:
        mile(5).equals(mile(1).add(mile(4)))
    }
}

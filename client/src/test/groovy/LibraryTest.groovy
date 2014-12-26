/*
 * This Spock specification was auto generated by running 'gradle init --type groovy-library'
 * by 'MarkPerry' at '26/12/14 8:33 PM' with Gradle 2.2.1
 *
 * @author MarkPerry, @date 26/12/14 8:33 PM
 */

import spock.lang.Specification

class LibraryTest extends Specification{
    def "someLibraryMethod returns true"() {
        setup:
        Library lib = new Library()
        when:
        def result = lib.someLibraryMethod()
        then:
        result == true
    }
}

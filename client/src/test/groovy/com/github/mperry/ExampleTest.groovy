package com.github.mperry

import groovy.transform.TypeChecked
import org.junit.Assert
import org.junit.Test

/**
 * Created by MarkPerry on 26/12/2014.
 */
@TypeChecked
class ExampleTest {

    @Test
    void test1() {
        Assert.assertTrue(Example.callExtension() == [2, 3, 4])
    }

}

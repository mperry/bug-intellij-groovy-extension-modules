package com.github.mperry

import groovy.transform.TypeChecked

/**
 * Created by MarkPerry on 26/12/2014.
 */
@TypeChecked
class Example {


    static List<Integer> callExtension() {
        [1, 2, 3].map { Integer i -> i + 1 }
    }

}

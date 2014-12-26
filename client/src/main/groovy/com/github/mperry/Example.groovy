package com.github.mperry

import groovy.transform.TypeChecked

/**
 * Created by MarkPerry on 26/12/2014.
 */
@TypeChecked
class Example {


    public List<Integer> test1() {
        [1, 2, 3].map { Integer i -> i + 1 }
    }

}

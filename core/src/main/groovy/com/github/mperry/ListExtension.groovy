package com.github.mperry

import groovy.transform.TypeChecked

/**
 * Created by MarkPerry on 26/12/2014.
 */
@TypeChecked
class ListExtension {


    public static <A, B> java.util.List<B> map(java.util.List<A> list, Closure<B> f) {
        list.collect(f)
    }


}

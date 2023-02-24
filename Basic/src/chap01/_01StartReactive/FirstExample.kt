package chap01._01StartReactive

import io.reactivex.Observable

class FirstExample {
    fun emit() {
        Observable.just("Hello", "RxJava 2!!")
            .subscribe(System.out::println)
    }
}
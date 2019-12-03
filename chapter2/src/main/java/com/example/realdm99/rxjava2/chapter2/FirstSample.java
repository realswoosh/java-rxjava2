package com.example.realdm99.rxjava2.chapter2;

import io.reactivex.Observable;

public class FirstSample {
    public void emit() {
        Observable.just("Hello", "RxJava 2!!")
                  .subscribe(System.out::println);
    }

    public static void main(String args[]) {
        System.out.println("main");
        FirstSample demo = new FirstSample();
        demo.emit();
    }
}

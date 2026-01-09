package com.EventEase;

interface ISchedulable {
    void schedule();
    void reschedule(String newDate);
    void cancel();
}

package com.allen.监听器;

/** 事件对象Even
 *  事件对象封装了事件源
 * @author ：jhys
 * @date ：Created in 2021/7/10 22:20
 * @Description ：
 */
public class Event {

    private Person person;

    public Event(Person person) {
        this.person = person;
    }

    public Person getResource() {
        return person;
    }
}

package com.allen.监听器;

/** PersonListener
 * 监听Person事件源的eat和sleep方法
 * @author ：jhys
 * @date ：Created in 2021/7/10 22:16
 * @Description ：
 */
public interface PersonListener {
    void Doeat(Event event);
    void DoSleep(Event event);
}

1.如何创建线程及线程的基本操作
2.可见性及volatile关键字
3.争用条件
4.线程的互斥synchronized
5.线程的同步wait/notifyAll

扩展：
1.Java Memory Mode：
JMM描述了java线程如何通过内存进行交互
happens-before
synchronized，volatile&final
2.Locks&Condition：
java锁机制和等待条件的高层实现
java.util.concurrent.locks
3.线程安全性：
原子性与可见性
java.util.concurrent.atomic
synchronized&volatile
DeadLocks
4.多线程编程常用的交互模型：
Producer-Consumer模型
Read-Write Lock模型
Future模型
Worker Thread模型
有哪些类实现了以上模型
5.java5中并发编程工具
java.util.concurrent
线程池ExecutorService
Callable&Future
BlockingQueue
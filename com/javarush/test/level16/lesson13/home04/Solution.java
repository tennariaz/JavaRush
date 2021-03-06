package com.javarush.test.level16.lesson13.home04;

/**
 * JavaRush.ru
 * Level 16, Lesson 13, Home 04
 * <p/>
 * 1. Разберись, что делает программа.
 * 2. Сделай так, чтоб программа сначала выводила результат нити, а когда нить завершится - продолжила метод main.
 * 3. Пример выходных данных:
 * inside MyThread 0
 * inside MyThread 1
 * ...
 * inside MyThread 9
 * inside main 0
 * inside main 1
 * ...
 * inside main 9
 * <p/>
 * Date: 10.05.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static MyThread t = new MyThread();
    static String message = "inside main ";

    public static void main( String a[] ) throws Exception
    {
        t.start();
        t.join();
        for ( int i = 0; i < 10; i++ )
        {
            System.out.println( message + i );
            sleep();
        }
    }

    static class MyThread extends Thread
    {
        String message = "inside MyThread ";

        public void run()
        {
            for ( int i = 0; i < 10; i++ )
            {
                System.out.println( message + i );
                Solution.sleep();
            }
        }
    }

    public static void sleep()
    {
        try
        {
            Thread.sleep( 10 );
        }
        catch ( InterruptedException e )
        {
        }
    }
}

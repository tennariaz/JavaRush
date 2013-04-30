package com.javarush.test.level14.lesson06.home01;

/**
 * Date: 30.04.13
 * @author Sergey Kandalintsev
 */
public class MoldovanHen extends Hen
{
    @Override
    String getDescription()
    {
        return super.getDescription() + String.format( " Моя страна - %s. Я несу %d яиц в месяц.",
                Country.MOLDOVA, getCountOfEggsPerMonth() );
    }

    @Override
    int getCountOfEggsPerMonth()
    {
        return 18;
    }
}

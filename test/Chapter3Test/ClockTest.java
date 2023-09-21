package chapterthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tdd.Clock;

import static org.junit.jupiter.api.Assertions.*;

class ClockTest {

    Clock myClock;
    @BeforeEach
    public void setUp(){
        myClock = new Clock(12,10,34);
    }
    @Test
    public void testThatClockCanExist(){
        assertNotNull(myClock);
    }

    @Test
    public void testThatClockCanBeSetInSecond(){
        myClock.setSecond(30);
        Assertions.assertEquals(30,myClock.getSecond());
    }

    @Test
    public void testThatClockCanBeSetInMinute(){
        myClock.setSecond(35);
        Assertions.assertEquals(35,myClock.getSecond());

        myClock.setMinute(30);
        Assertions.assertEquals(30,myClock.getMinute());
    }

    @Test
    public void testThatClockCanBeSetInHour(){
        myClock.setSecond(36);
        Assertions.assertEquals(36,myClock.getSecond());

        myClock.setMinute(30);
        Assertions.assertEquals(30,myClock.getMinute());

        myClock.setHour(12);
        Assertions.assertEquals(12,myClock.getHour());
    }
    @Test
    public void testThatClockCanDisplayInHourMinuteSecond(){

    }

}
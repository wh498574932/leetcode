package com.wh498574932.algorithm.lc253;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.wh498574932.algorithm.model.Interval;
import org.junit.jupiter.api.Test;

public class MeetingRoomsIITest {
    @Test
    public void test() {
        Interval[] intervals = new Interval[]{
            new Interval(2, 15),
            new Interval(36, 45),
            new Interval(9, 29),
            new Interval(16, 23),
            new Interval(4, 9)
        };
        assertEquals(2, new MeetingRoomsII().minMeetingRooms(intervals));
    }

    @Test
    public void test2() {
        Interval[] intervals = new Interval[]{
            new Interval(2, 15),
            new Interval(36, 45),
            new Interval(9, 29),
            new Interval(16, 23),
            new Interval(4, 9)
        };
        assertEquals(2, new MeetingRoomsII2().minMeetingRooms(intervals));
    }
}

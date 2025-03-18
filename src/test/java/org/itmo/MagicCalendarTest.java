package org.itmo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MagicCalendarTest {

    MagicCalendar calendar;

    @BeforeEach
    public void setUp() {
        calendar = new MagicCalendar();
    }

    // conflict, replace
    @Test
    public void testReplaceWorkWithPersonal() {
        final String user = "user123";
        final String time = "10:00";

        assertTrue(calendar.scheduleMeeting(user, time, MagicCalendar.MeetingType.WORK));
        assertTrue(calendar.scheduleMeeting(user, time, MagicCalendar.MeetingType.PERSONAL));
    }

    // conflict, no replace
    @Test
    public void testDoNotReplaceWorkWithWork() {
        final String user = "user123";
        final String time = "10:00";

        assertTrue(calendar.scheduleMeeting(user, time, MagicCalendar.MeetingType.WORK));
        assertFalse(calendar.scheduleMeeting(user, time, MagicCalendar.MeetingType.WORK));
    }

    // conflict, no replace
    @Test
    public void testDoNotReplacePersonal() {
        final String user = "user123";
        final String time = "10:00";

        assertTrue(calendar.scheduleMeeting(user, time, MagicCalendar.MeetingType.PERSONAL));

        assertFalse(calendar.scheduleMeeting(user, time, MagicCalendar.MeetingType.WORK));
        assertFalse(calendar.scheduleMeeting(user, time, MagicCalendar.MeetingType.PERSONAL));
    }



    // no conflict
    @Test
    public void testBackToBack() {
        final String user = "user123";

        assertTrue(calendar.scheduleMeeting(user, "00:00", MagicCalendar.MeetingType.WORK));
        assertTrue(calendar.scheduleMeeting(user, "01:00", MagicCalendar.MeetingType.WORK));
        assertTrue(calendar.scheduleMeeting(user, "02:00", MagicCalendar.MeetingType.WORK));
        assertTrue(calendar.scheduleMeeting(user, "03:00", MagicCalendar.MeetingType.WORK));
        assertTrue(calendar.scheduleMeeting(user, "04:00", MagicCalendar.MeetingType.WORK));
        assertTrue(calendar.scheduleMeeting(user, "05:00", MagicCalendar.MeetingType.WORK));
        assertTrue(calendar.scheduleMeeting(user, "06:00", MagicCalendar.MeetingType.WORK));
        assertTrue(calendar.scheduleMeeting(user, "07:00", MagicCalendar.MeetingType.WORK));
        assertTrue(calendar.scheduleMeeting(user, "08:00", MagicCalendar.MeetingType.WORK));
        assertTrue(calendar.scheduleMeeting(user, "09:00", MagicCalendar.MeetingType.WORK));
        assertTrue(calendar.scheduleMeeting(user, "10:00", MagicCalendar.MeetingType.WORK));
        assertTrue(calendar.scheduleMeeting(user, "11:00", MagicCalendar.MeetingType.WORK));
        assertTrue(calendar.scheduleMeeting(user, "12:00", MagicCalendar.MeetingType.WORK));
        assertTrue(calendar.scheduleMeeting(user, "13:00", MagicCalendar.MeetingType.WORK));
        assertTrue(calendar.scheduleMeeting(user, "14:00", MagicCalendar.MeetingType.WORK));
        assertTrue(calendar.scheduleMeeting(user, "15:00", MagicCalendar.MeetingType.WORK));
        assertTrue(calendar.scheduleMeeting(user, "16:00", MagicCalendar.MeetingType.WORK));
        assertTrue(calendar.scheduleMeeting(user, "17:00", MagicCalendar.MeetingType.WORK));
        assertTrue(calendar.scheduleMeeting(user, "18:00", MagicCalendar.MeetingType.WORK));
        assertTrue(calendar.scheduleMeeting(user, "19:00", MagicCalendar.MeetingType.WORK));
        assertTrue(calendar.scheduleMeeting(user, "20:00", MagicCalendar.MeetingType.WORK));
        assertTrue(calendar.scheduleMeeting(user, "21:00", MagicCalendar.MeetingType.WORK));
        assertTrue(calendar.scheduleMeeting(user, "22:00", MagicCalendar.MeetingType.WORK));
        assertTrue(calendar.scheduleMeeting(user, "23:00", MagicCalendar.MeetingType.WORK));

        assertTrue(calendar.scheduleMeeting(user, "00:00", MagicCalendar.MeetingType.PERSONAL));
        assertTrue(calendar.scheduleMeeting(user, "01:00", MagicCalendar.MeetingType.PERSONAL));
        assertTrue(calendar.scheduleMeeting(user, "02:00", MagicCalendar.MeetingType.PERSONAL));
        assertTrue(calendar.scheduleMeeting(user, "03:00", MagicCalendar.MeetingType.PERSONAL));
        assertTrue(calendar.scheduleMeeting(user, "04:00", MagicCalendar.MeetingType.PERSONAL));
        assertTrue(calendar.scheduleMeeting(user, "05:00", MagicCalendar.MeetingType.PERSONAL));
        assertTrue(calendar.scheduleMeeting(user, "06:00", MagicCalendar.MeetingType.PERSONAL));
        assertTrue(calendar.scheduleMeeting(user, "07:00", MagicCalendar.MeetingType.PERSONAL));
        assertTrue(calendar.scheduleMeeting(user, "08:00", MagicCalendar.MeetingType.PERSONAL));
        assertTrue(calendar.scheduleMeeting(user, "09:00", MagicCalendar.MeetingType.PERSONAL));
        assertTrue(calendar.scheduleMeeting(user, "10:00", MagicCalendar.MeetingType.PERSONAL));
        assertTrue(calendar.scheduleMeeting(user, "11:00", MagicCalendar.MeetingType.PERSONAL));
        assertTrue(calendar.scheduleMeeting(user, "12:00", MagicCalendar.MeetingType.PERSONAL));
        assertTrue(calendar.scheduleMeeting(user, "13:00", MagicCalendar.MeetingType.PERSONAL));
        assertTrue(calendar.scheduleMeeting(user, "14:00", MagicCalendar.MeetingType.PERSONAL));
        assertTrue(calendar.scheduleMeeting(user, "15:00", MagicCalendar.MeetingType.PERSONAL));
        assertTrue(calendar.scheduleMeeting(user, "16:00", MagicCalendar.MeetingType.PERSONAL));
        assertTrue(calendar.scheduleMeeting(user, "17:00", MagicCalendar.MeetingType.PERSONAL));
        assertTrue(calendar.scheduleMeeting(user, "18:00", MagicCalendar.MeetingType.PERSONAL));
        assertTrue(calendar.scheduleMeeting(user, "19:00", MagicCalendar.MeetingType.PERSONAL));
        assertTrue(calendar.scheduleMeeting(user, "20:00", MagicCalendar.MeetingType.PERSONAL));
        assertTrue(calendar.scheduleMeeting(user, "21:00", MagicCalendar.MeetingType.PERSONAL));
        assertTrue(calendar.scheduleMeeting(user, "22:00", MagicCalendar.MeetingType.PERSONAL));
        assertTrue(calendar.scheduleMeeting(user, "23:00", MagicCalendar.MeetingType.PERSONAL));
    }





    // validation
    @Test
    public void testInvalidTime() {
        final String user = "user123";

        assertFalse(calendar.scheduleMeeting(user, "24:00", MagicCalendar.MeetingType.WORK));
        assertFalse(calendar.scheduleMeeting(user, "24:00", MagicCalendar.MeetingType.PERSONAL));

        assertFalse(calendar.scheduleMeeting(user, "99:00", MagicCalendar.MeetingType.WORK));
        assertFalse(calendar.scheduleMeeting(user, "99:00", MagicCalendar.MeetingType.PERSONAL));

        assertFalse(calendar.scheduleMeeting(user, "00:60", MagicCalendar.MeetingType.WORK));
        assertFalse(calendar.scheduleMeeting(user, "00:99", MagicCalendar.MeetingType.PERSONAL));
    }

    @Test
    public void testMinMaxTime() {
        final String user = "user123";

        assertTrue(calendar.scheduleMeeting(user, "00:00", MagicCalendar.MeetingType.WORK));
        assertTrue(calendar.scheduleMeeting(user, "00:00", MagicCalendar.MeetingType.PERSONAL));

        assertTrue(calendar.scheduleMeeting(user, "23:59", MagicCalendar.MeetingType.WORK));
        assertTrue(calendar.scheduleMeeting(user, "23:59", MagicCalendar.MeetingType.PERSONAL));
    }


    @Test
    public void testCancel() {
        assertTrue(calendar.scheduleMeeting("a", "10:00", MagicCalendar.MeetingType.WORK));
        assertTrue(calendar.cancelMeeting("a", "10:00"));

        assertTrue(calendar.scheduleMeeting("a", "10:00", MagicCalendar.MeetingType.PERSONAL));
        assertFalse(calendar.cancelMeeting("a", "10:00"));
    }
}

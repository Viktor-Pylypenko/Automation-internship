package junk.jfree;

import static junk.jfree.SerialDate.getFollowingDayOfWeek;

public class TryApp {
    public static void main(String[] args) {
        System.out.println(getFollowingDayOfWeek(7, SerialDate.createInstance(25, 12, 2004)));

    }
}

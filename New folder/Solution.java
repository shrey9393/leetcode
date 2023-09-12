import java.util.*;

class Solution {

    public static void main(String[] args) {
        String s = "08:40 am";
        int hr = Integer.parseInt(s.substring(0, 2));
        int min = Integer.parseInt(s.substring(3, 5));
        String am_pm = s.substring(6).trim();
        int req = 16;
        int delay = 5;

        // Calculate the total delay time in minutes
        int total_delay = (req + 1) * (delay + 1);

        // Add the delay to the current time
        int new_min = (min + total_delay) % 60;
        int carry_hour = (min + total_delay) / 60;

        int new_hr = (hr + carry_hour + (new_min / 60)) % 12; // Use % 12 to handle 12-hour format

        // Handle cases where the hour becomes 0
        if (new_hr == 0) {
            new_hr = 12;
        }

        // Adjust for 12-hour format (AM/PM)
        if (hr + carry_hour + (new_min / 60) >= 12) {
            am_pm = "pm";
        } else {
            am_pm = "am";
        }

        // Ensure hours and minutes are displayed with leading zeros
        String new_hr_str = String.format("%02d", new_hr);
        String new_min_str = String.format("%02d", new_min);

        System.out.println("Original Time: " + hr + ":" + min + " " + am_pm);
        System.out.println("New Time after Delay: " + new_hr_str + ":" + new_min_str + " " + am_pm);
    }
}

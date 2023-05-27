package ProjectGUI;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class CalendarApp extends JFrame {

    private String[] monthNames = {"January", "February", "March", "April", "May", "June", "July",
            "August", "September", "October", "November", "December"};

    private String[] weekdayNames = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

    public CalendarApp() {
        setTitle("Calendar");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel calendarPanel = createCalendarPanel(Calendar.MAY, 2023);
        add(calendarPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    private JPanel createCalendarPanel(int month, int year) {
        JPanel calendarPanel = new JPanel(new GridLayout(0, 7));

        for (String weekday : weekdayNames) {
            JLabel label = new JLabel(weekday, JLabel.CENTER);
            calendarPanel.add(label);
        }

        Calendar cal = Calendar.getInstance();
        cal.set(year, month, 1);
        int firstDayOfMonth = cal.get(Calendar.DAY_OF_WEEK);
        int numDaysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

        for (int i = 1; i < firstDayOfMonth; i++) {
            JLabel label = new JLabel("", JLabel.CENTER);
            calendarPanel.add(label);
        }

        for (int i = 1; i <= numDaysInMonth; i++) {
            JLabel label = new JLabel(String.valueOf(i), JLabel.CENTER);
            calendarPanel.add(label);
        }

        return calendarPanel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CalendarApp::new);
    }
}

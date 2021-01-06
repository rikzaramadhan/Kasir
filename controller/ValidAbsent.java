package controller;

import model.Absent;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class ValidAbsent implements CheckAbsen, ConvertDate {

    private Absent absent;
    private long epochLateDay = 1608379662; // hard code is not good

    public ValidAbsent(Absent absent) {
        this.absent = absent;
    }

    private int checkIn(Absent absent) {
        if (epochLateDay < absent.getAbsenin()) {
            return 1;
        } else if (epochLateDay == absent.getAbsenin()) {
            return 2;
        }
        return 3;
    }

    @Override
    public String checkAbsent(Absent absent) {
        if ( checkIn(absent) == 1) {
            return "on time";
        } else if (checkIn(absent) == 2) {
            return "in time";
        }
        return "late";
    }

    @Override
    public String epochToDate(long epoch) {
        Date date = new Date(epoch);
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        format.setTimeZone(TimeZone.getTimeZone("Etc/UTC"));
        format.setTimeZone(TimeZone.getTimeZone("Indonesia/Surabaya"));
        String formatted = format.format(date);
        return formatted;
    }

    public String showAbsent() {
        return checkAbsent(absent) + " nama " + absent.getUser().getNama() +
                " start time " + epochToDate(absent.getAbsenin());
    }

    public String showLeft() {
        return checkAbsent(absent) + " nama " + absent.getUser().getNama() +
                " start absen " + epochToDate(absent.getAbsenin())+
                " end absen " + epochToDate(absent.getAbsenout());
        }
}

package numberClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println("Masukan Nama : ");
        String nama = scanner.nextLine();

        System.out.println("Masukan Tgl Lahir ");
        String tglLahir = scanner.nextLine();
        Date tglLahirDate = formater.parse(tglLahir);
        System.out.println("tgl Lahir: "+ tglLahirDate);

        Date currentDate = new Date();
        String tglSekarang = formater.format(currentDate);
        System.out.println("tgl Sekarang Date "+ currentDate);
        System.out.println("tgl Sekarang "+ tglSekarang);

        // hitung umur
        Calendar calendar = Calendar.getInstance();
        // tgl date => calender
        calendar.setTime(tglLahirDate);
        System.out.println("calender tgl lahir "+ calendar.getTime());
        Calendar currentCalendar = Calendar.getInstance();
        currentCalendar.setTime(new Date());
        // check calender sekarang
        System.out.println("tgl Sekarang "+ currentCalendar.getTime());
        // ambil selisih
        Long time = (currentCalendar.getTimeInMillis() - calendar.getTimeInMillis())/1000;
        // second => hour => day => week => month => year

        // second => hour
        Long time1 = time/3600;
        // hour => day
        Long time2 = time1/24;
        // day => week
        Long time3 = time2/7;
        // day => month

        // day => year
        Long time4 = (currentCalendar.getTimeInMillis() - calendar.getTimeInMillis())/1000/3600/24/365;
        System.out.println("bentuk Second "+ time);
        System.out.println("bentuk Hour "+ time1);
        System.out.println("bentuk Day "+ time2);
        System.out.println("bentuk Week "+ time3);
        System.out.println("bentuk Year");

    }
}


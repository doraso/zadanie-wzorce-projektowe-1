package pl.javastart.exercise.designpatterns.singleton;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    private File file;

    public Logger() {
        file = new File("log.txt");
        if(file.exists()) {
            file.delete();
        }
    }

    public void log(String info) {
        try {
            Date date = new Date();
            SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
            logInternal(format.format(date), info);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void logInternal(String date, String info) throws IOException {
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter out = new PrintWriter(bw);
        out.println(date + " --> " + info);
        out.close();
    }

}

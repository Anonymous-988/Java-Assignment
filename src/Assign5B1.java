import java.io.*;
public class Assign5B1 extends Thread {
    File f1;
    String fname;
    static String str;
    String line;
    LineNumberReader reader = null;

    Assign5B1(String fname) {
        this.fname = fname;
        f1 = new File(fname);
    }

    public void run() {
        try {
            FileReader fr = new FileReader(f1);
            reader = new LineNumberReader(fr);
            while ((line = reader.readLine()) != null) {
                if (line.indexOf(str) != -1) {
                    System.out.println("string found in " + fname + " at " + "line " + reader.getLineNumber());
                    stop();
                }
            }
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) throws IOException {
        Thread t[] = new Thread[20];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any String to search");
        str = br.readLine();

        FilenameFilter filter = new FilenameFilter() {
            public boolean accept(File file, String name) {
                if (name.endsWith(".txt")) {
                    return true;
                } else {
                    return false;
                }
            }
        };

        File dir1 = new File("/home/TY279/JAVA/ASSIGNMENT_5");
        File[] files = dir1.listFiles(filter);
        if (files.length == 0) {
            System.out.println("String is not present in any text files");
        } else {
            for (int i = 0; i < files.length; i++) {
                for (File aFile : files) {
                    t[i] = new Assign5B1(aFile.getName());
                    t[i].start();
                }
            }
        }
    }
}

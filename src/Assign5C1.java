import java.io.*;
class FileWatcher implements Runnable {
    Thread T;
    String fname;

    FileWatcher(String fn) {
        fname = fn;
        T = new Thread(this, fname);
        System.out.println("\n\nNew = " + T);
        T.start();
    }

    public void run() {
        File f = new File(fname);
        if (f.exists())
            System.out.println(" " + fname + "  File Exist ");
        else
            System.out.println(" " + fname + "  File Not Exist");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException it) {
        }
    }
}

class Assign5C1 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n Enter Several N  files");
        try {
            int n = Integer.parseInt(br.readLine());
            for (int i = 1; i <= n; i++){
		System.out.println("\n Enter File name");
                new FileWatcher(br.readLine());
	    }
        } catch (Exception e) {
            System.out.println("Invalid Input");
        }
    }
}

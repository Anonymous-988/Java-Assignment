import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class Assign1C1 {
    public static void main(String[] args) throws Exception {
        try{
            //To Read File
            final int assumedLineLength = 50;
            Scanner sc = new Scanner(System.in);
            String fname=args[0];
//            System.out.print("Enter file path: ");
//            String fname= sc.next();
            File file = new File(fname);

            //Create ArrayList
            List<String> fileList = new ArrayList<String>((int)(file.length() / assumedLineLength) * 2);
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                String line= reader.nextLine();
                //Add file content to the list
                fileList.add(line);
                //System.out.println(line);
            }
            reader.close();

            int opt;
            System.out.println(fileList);
            while(true){
                System.out.println("\n1. Insert Line \n2. Delete Line \n3. Append Line \n4. Modify Line \n5. Display \n6. Exit \n Enter your choice: ");
                opt=sc.nextInt();
                switch (opt){
                    case 1:
                        System.out.print("Enter line to insert data: ");
                        int line= sc.nextInt();
                        System.out.print("Enter data: ");
                        String element= sc.next();
                        fileList.add(line,element);
                        System.out.println("Element is inserted in the list");
                        break;

                    case 2:
                        System.out.print("Enter line to delete data: ");
                        line= sc.nextInt();
//                        System.out.print("Enter data: ");
//                        element= sc.next();
                        fileList.remove(line);
                        System.out.println("Element is deleted from the list");
                        break;

                    case 3:
                        System.out.print("Enter data to be appended: ");
                        element= sc.next();
                        fileList.add(element);
                        System.out.println("Element is appended to the list");
                        break;

                    case 4:
                        System.out.print("Enter line to modify: ");
                        line= sc.nextInt();
                        System.out.print("Enter data: ");
                        element= sc.next();
                        fileList.set(line,element);
                        System.out.println("Element is modified in the list");
                        break;

                    case 5:
                        System.out.println("The contents of the list are: "+ fileList);
                        break;

                    case 6:
                        FileWriter writer= new FileWriter(fname);
                        Iterator it= fileList.iterator();
                        while(it.hasNext()){
                            writer.write(it.next()+"\n");
                        }
                        writer.close();
                        System.out.println("Changes Saved");
                        exit(0);

                    default:
                        System.out.println("Invalid option ");
                        break;
                }
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}

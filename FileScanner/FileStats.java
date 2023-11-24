package FileScanner;

import javax.activation.MimetypesFileTypeMap;
import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class FileStats {
    static int num_files = 0;
    static int num_dir = 0;
    static String image;
    static ArrayList<File> Images = new ArrayList<>();

    public static void listFilesForFolder(File folder) {
        for (File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                listFilesForFolder((fileEntry));
                FileStats.num_dir++;
            } else {
                //System.out.println("fileEntry.getAbsolutePath()");
                FileStats.num_files++;
                if(new MimetypesFileTypeMap().getContentType(fileEntry).contains("image")){
                    if(fileEntry != null){
                        Images.add(fileEntry);
                        image = image + "<img src=" + fileEntry +" alt=aa height=100>\n";
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        File folder = new File(Utils.selectAFolderDialog(JFileChooser.DIRECTORIES_ONLY));
        FileStats.image = "<html><body>\n";
        listFilesForFolder(folder);
        GUIskeleton GUI = new GUIskeleton(FileStats.Images);
        FileStats.image = FileStats.image + "</body></html>\n";
        File image_html = new File("images.html");
        PrintWriter pw = new PrintWriter(image_html);
        pw.write(image);
        pw.flush();
        pw.close();
        System.out.println("Number of directories: " + FileStats.num_dir );
        System.out.println("Number of files: " + FileStats.num_files );
        //Utils.selectAFolderDialog(JFileChooser.DIRECTORIES_ONLY);
    }
}

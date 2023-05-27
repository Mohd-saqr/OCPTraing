package org.example;



import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.UserPrincipal;
import java.time.Instant;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;

public class StreamApi {


    public static void main(String[] args) throws IOException {

//        /// All NIO throw Io exception
//        Path path =Paths.get("");
//        FileTime fileTime = FileTime.fromMillis(System.currentTimeMillis());
//
//        FileTime fileTime1=Files.getLastModifiedTime(path);
//        Files.move(path,Paths.get(""));
//        Files.size(path);
//        Files.copy(path,new FileOutputStream(new File("")));
//        Files.copy(new FileInputStream(new File("")),path);
//        Files.createDirectories(path);
//        Files.createDirectory(path);
//        Files.delete(path);
//        Files.deleteIfExists(path);
//        Files.isSameFile(path,path);
//        Files.setOwner(path, FileSystems.getDefault().getUserPrincipalLookupService().lookupPrincipalByName(""));
//        Files.isHidden(path);
//        Files.getOwner(path);
//        Files.write(path,new byte[]{});
        basicsFileAttrubuite();
    }

    void noneExceptionThrow(){
        Path path =Paths.get("");
        Files.isDirectory(path);
        Files.isReadable(path);
        Files.isExecutable(path);
        Files.isSymbolicLink(path);
        Files.exists(path);
        Files.isWritable(path);

    }

    void fileMethod() throws URISyntaxException {
        File file = new File(new URI("file::D:\\OCP\\"));
        File file1 = new File("");
        File file2 = new File(file1,"");
  boolean b=      file2.mkdir();
        boolean b2=    file2.mkdirs();
        boolean b3=    file2.delete();
        boolean b1=file2.isAbsolute();
        boolean b4=file2.isHidden();
        String b5 =file2.getName();
        long s =file2.lastModified();
         file2.deleteOnExit();
    }

    void allPathMethod(){
        Path path=Paths.get("");
        path.getFileName();
        path.getName(1);
        path.getNameCount();
        path.getRoot();
      Path path1=  path.getFileName();
        try {
            path1.toRealPath();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


 static    void basicsFileAttrubuite() throws IOException {
        Path path =Paths.get("E:\\fileForRead.txt");
        BasicFileAttributeView basicFileAttributesView =Files.getFileAttributeView(path, BasicFileAttributeView.class);




 }
}




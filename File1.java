import java.io.File;
import java.io.IOException;
class File1{
public static void main(String[] args){
try{
File f=new File("new_file.txt");
f.createNewFile();
System.out.println(f.exists());
System.out.println(f.getName());
System.out.println(f.length());
System.out.println(f.isFile());
System.out.println(f.isDirectory());
//f.delete();
}
catch(IOException e){
System.out.println(e.getMessage());
}
}
}
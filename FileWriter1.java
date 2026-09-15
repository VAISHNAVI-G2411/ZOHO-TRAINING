import java.io.FileWriter;
import java.io.IOException;
class FileWriter1{
public static void main(String[] args){
try(FileWriter fw=new FileWriter("note.txt",true)){
fw.write("\n i am good ");
}
catch(IOException e){
System.out.println(e.getMessage());
}
}
}
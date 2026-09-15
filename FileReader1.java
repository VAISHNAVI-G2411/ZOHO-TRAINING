import java.io.FileReader;
import java.io.IOException;
class FileReader1{
public static void main(String[] args){
try(FileReader fr=new FileReader("note.txt")){
int data=fr.read();
while(fr.ready()){
System.out.println((char)data);
data=fr.read();
}
System.out.println();
}
catch(IOException e){
System.out.println(e.getMessage());
}
}
}
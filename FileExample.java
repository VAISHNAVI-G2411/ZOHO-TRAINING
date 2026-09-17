import java.nio.file.*;
import java.io.IOException;
import java.util.List;
public class FileExample{
public static void main(String[] args) throws IOException{

//creat file
Path file=Path.of("note.txt");

//check existance
if(Files.exists(file)){
System.out.println("file exists");
}

//check it is regular
if(Files.isRegularFile(file)){
System.out.println("it is a regular file");
}

//size
System.out.println("size:"+Files.size(file));

//read all the lines
List<String>lines=Files.readAllLines(file);
for(String line:lines){
System.out.println(line);
}

//copy
Path copy=Path.of("noteCopy.txt");
Files.copy(file,copy,StandardCopyOption.REPLACE_EXISTING);

//move
Path moved=Path.of("noteMoved.txt");
Files.move(copy,moved,StandardCopyOption.REPLACE_EXISTING);
}
}
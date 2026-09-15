import java.io.OutputStreamWriter;
import java.io.IOException;
class OutStreamWriter1{
public static void main(String[] args){
try(OutputStreamWriter osr=new OutputStreamWriter(System.out)){
osr.write("hi i am Vaishnavi");
osw.write(97);
osw.write('A');
char[] arr=" i am good".toCharArray();
osw.write(arr);

catch(IOException e){
System.out.println(e.getMessage());
}
}
}
import java.io.InputStreamReader;
import java.io.IOException;
class InputStreamReader1{
public static void main(String[] args){
try(InputStreamReader isr=new InputStreamReader(System.in)){
System.out.print("enter some data:");
int data=isr.read();
while(isr.ready()){
System.out.println((char)data);
data=isr.read();
}
System.out.println();
}
catch(IOException e){
System.out.println(e.getMessage());
}
}
}

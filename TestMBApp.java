import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestMBApp{

    public static void main(){
        MessageBoard CodingSupport = new MessageBoard("Coding Support");

        CodingSupport.addPost("Alex Adam","Help with Java","Hi, could anyone help me I need to learn how to code in java!");
        CodingSupport.addPost("Belinda Bennett","Help with Java","Hi Alex. Yes I can send some tutorials I found useful.");
        CodingSupport.addPost("Cindy Carter","Coding on a Chromebook","Hi, could anyone help me I need to learn how to code in java!");
        CodingSupport.addPost("Dennis Dobson","Windows problems","My windows laptop is stuck on a reboot loop. Does anyone know what to do!");

        int[] postIDs = CodingSupport.getPostIDs();
        for(int i = 0; i < postIDs.length;i++){
            System.out.println(CodingSupport.getFormattedPost(postIDs[i]));
        }
        
    }
}
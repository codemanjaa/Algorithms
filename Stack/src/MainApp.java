import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class MainApp {

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(30);
        stack.push(70);
        stack.push(50);
        stack.push(90);
        stack.push(100);
        stack.push(150);

        while (!stack.isEmpty()){
            long val = stack.pop();
            System.out.println(val);

        }

        System.out.println(reverseString("MAYURA"));


        }

        public static String reverseString(String str){
          StringStack  stringStack = new StringStack(str.length());
          char ch[] = new char[str.length()];
          if(str.length()>0){
            for(int i=0; i<str.length(); i++){
                char c = str.charAt(i);
                stringStack.push(c);
            }
        }
            int i =0;

            while(!stringStack.isEmpty()) {
                ch[i] = stringStack.pop();
                i++;
            }

            String result = new String(ch);
        return result;
        }
}

package AssignmentQ13;

public class ReplaceCharacter {
    public static void main(String[] args) {
  show ("vilasivlasvil");
    }
    public static void show(String str){

        if(str.length ()>0)
        {
            str=str.replace ("vilas", "");
        }
        if(str.length ()>0){
            str=str.replace ("ivlas", "");
        }
        System.out.println (str);
    }
}

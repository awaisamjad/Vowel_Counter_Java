import java.util.Scanner;

public class Vowel_Counter{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Text:");
        String text = sc.nextLine();
        //String text = "hello my name is awais amjad";
        text = text.toLowerCase();
        int count = 0;
        for(int i = 0;i<text.length();i++){
            switch(text.charAt(i)){
                case 'a':
                count++;
                break;

                case 'e':
                count++;
                break;
                
                case 'i':
                count++;
                break;
                
                case 'o':
                count++;
                break;
                
                case 'u':
                count++;
                break;
               }
        } 
        System.out.println(count);
    }
}
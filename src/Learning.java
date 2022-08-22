import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Learning {
    public static void main(String[] args){
        //PRINTS
        System.out.println("Hello World");

        // Conversions
        String number = "1";
        int secNumber = 10;
        System.out.println( Integer.parseInt(number) +1);
        System.out.println( String.valueOf(secNumber) );
        System.out.println( Double.parseDouble(number));

        if(1 == 1){
            System.out.println("1 == 1");
        }
        if(number.equals("1")){
            System.out.println("number.equals(\"1\")");
        }

        // functions
        System.out.println(sum(1,3));

        // loops
        System.out.println("-----FOR----");
        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }
        System.out.println("-----WHILE----");
        int x = 0;
        while(x < 5){
            System.out.println(x);
            x++;
        }

        System.out.println("-----do while------");
        int y = 0;
        do{
            System.out.println(y);
            y++;
        }while(y < 5);

        System.out.println("----FOREACH----");
        List<Integer> itens = Arrays.asList(1,2,5,4,8);
        for (int item : itens){
            System.out.println(item);
        }
        System.out.println("----FOREACH Lambda----");
        itens.forEach(item-> System.out.println(item) );

        System.out.println("------- SCANF-------");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name);

    }

    static int sum(int x, int y){
        int numbers = x + y;
        return numbers;
    }


}

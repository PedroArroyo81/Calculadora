import java.util.Scanner;

public class TestCalculadora {
	
    public static void main(String[] args)
    {
        System.out.println("Introduce 2 numeros:");
        Scanner input= new Scanner(System.in);
        
        int num1,num2;
        num1 = input.nextInt();
        num2 = input.nextInt();
        
       
        System.out.println("Elige operación: 1)Sumar, 2)Restar, 3)Multiplicar, 4)Dividir");
        int choose;
        choose = input.nextInt();
        
        switch (choose){
        case 1:
            System.out.println(sum( num1,num2));
            break;
        case 2:
            System.out.println(res( num1,num2));
            break;     
        case 3:
            System.out.println(mult( num1,num2));
            break;
        case 4:
            System.out.println(div( num1,num2));
            break;
        default:
                System.out.println("Operación inválida");
        }
        
        
    }
    public static int sum(int x, int y)
    {
        int result = x + y;
        return result;
    }
    public static int res(int x, int y)
    {
        int result = x-y;
        return result;
    }
    public static int mult(int x, int y)
    {
        int result = x*y;
        return result;
    }
    public static int div(int x, int y)
    {
        int result = x/y;
        return result;
    }
    

}

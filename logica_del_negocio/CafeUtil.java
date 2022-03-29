import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
class CafeUtil {


    public int getStreakGoal(int numWeeks){
        int sum = 0;
        for (int i =1; i <= numWeeks; i++){
            sum +=i;
        }
        return sum;
    }

    public static double getOrderTotal(double[] prices){
        double sum = 0;
        for (int i = 0; i < prices.length; i++){
            sum += prices[i];
        }
        return sum;
    }

    // public void displayMenu(ArrayList<String> menuItems){
    //     for (String i : menuItems){
    //         System.out.println(i);
    //     }
    // }

    public static void displayMenu(ArrayList<String> menu){
        for (int i =0 ; i < menu.size(); i++){
            System.out.println(menu.get(i));
        }
    }

    public static  void addCustomer(ArrayList<String> customers) {
        System.out.println("Por favor intresa tu nombre");
        String userName = System.console().readLine();
        System.out.println("Hola, "+userName);
        int numberClients = customers.size();
        System.out.println("Hay "+numberClients+" delante de ti");
        customers.add(userName);
        // for (int i =0; i<customers.size();i++){
        //     System.out.println(customers.get(i));
        // }

        // System.out.println(customers.toString());

        for (String i : customers){
            System.out.println(i);
        }
    }


}
import java.util.Scanner;

public class Store {

    Scanner input = new Scanner(System.in);
    public void run() {
        System.out.println("-------------");
        System.out.println("PatikaStore Product Management Panel");
        System.out.println();

        System.out.println("1 - Notebook");
        System.out.println("2 - Mobile Phone");
        System.out.println("3 - List Brands");
        System.out.println("0 - Exit");

        System.out.print("Choice: ");


        boolean check = true;
        int choice = 0;
        while (check){
            choice = input.nextInt();
            if(choice == 0 || choice == 1 || choice == 2 || choice == 3){
                check = false;
                break;
            }
            else
                System.out.println("Please enter valid value!\nChoice: ");
        }

        String[] brands = {"Samsung", "Lenovo", "Apple", "Huawei", "Casper", "Asus", "HP", "Xiaomi", "Monster"};
        for (int i = 0; i < brands.length; i++) {
            Brand.addBrand(brands[i], i);
        }

        switch (choice){
            case 1:
                System.out.println("------------NOTEBOOK------------");
                Product.process(1);
                break;
            case 2:
                System.out.println("------------MOBILE PHONE------------");
                Product.process(2);
                break;
            case 3:
                Brand.printBrand();
            case 0:
                System.out.println("You left the store!");
                break;
            default:
        }
    }
}
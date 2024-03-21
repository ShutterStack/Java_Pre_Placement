import java.util.*;

public class ShoppingCart {
    Scanner sc = new Scanner(System.in);
    ArrayList itemName = new ArrayList();
    ArrayList price = new ArrayList();

    void addItem() {
        System.out.println("Enter the price and item name of the item: ");
        price.add(sc.nextInt());
        sc.nextLine(); // Consume newline character
        itemName.add(sc.nextLine());
    }

    void showItems() {
        System.out.println("The item list is as follows: ");
        System.out.println("Item No.\tItem Name\tPrice");
        for (int i = 0; i < itemName.size(); i++) {
            System.out.println(i + "\t" + itemName.get(i).toString() + "\t" + price.get(i).toString());
        }
    }

    void deleteItems() {
        System.out.println("Enter the index of the element to be deleted: ");
        int indexToRemove = sc.nextInt();
        sc.nextLine();
        itemName.remove(indexToRemove);
        price.remove(indexToRemove);
    }

    void updateItems() {
        System.out.println("Enter the index of the item to be updated: ");
        int indexToUpdate = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the price and name of the new item: ");
        price.set(indexToUpdate, sc.nextInt());
        sc.nextLine();
        itemName.set(indexToUpdate, sc.nextLine().toString());
    }

    void orderMenu() {
        System.out.println("The order menu is as follows: ");
        System.out.println("Item No.\tItem Name\tPrice");
        for (int i = 0; i < itemName.size(); i++) {
            System.out.println(i + "\t" + itemName.get(i).toString() + "\t" + price.get(i).toString());
        }

    }

    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        ShoppingCart shopsy = new ShoppingCart();
        while (true) {
            System.out.println("Enter the operation to be performed: ");
            System.out.println("1. Add Item.");
            System.out.println("2. Show Items.");
            System.out.println("3. Delete Items.");
            System.out.println("4. Update Items.");
            System.out.println("5. Order Menu.");
            System.out.println("6. Exit.");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    shopsy.addItem();
                    break;

                case 2:
                    shopsy.showItems();
                    break;

                case 3:
                    shopsy.deleteItems();
                    break;

                case 4:
                    shopsy.updateItems();
                    break;

                case 5:
                    shopsy.orderMenu();
                    break;

                case 6:
                    System.out.println("Exiting application.");
                    System.exit(0);
            }
        }

        // sc.close();
    }
}

import java.util.ArrayList;
import java.util.Scanner;

class Item {
    private int itemNo;
    private String itemName;
    private double price;

    public Item(int itemNo, String itemName, double price) {
        this.itemNo = itemNo;
        this.itemName = itemName;
        this.price = price;
    }

    public int getItemNo() {
        return itemNo;
    }

    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName)
    {
        this.itemName=itemName;
    }
    public void  setPrice(double price){this.price=price;}

    public double getPrice() {
        return price;
    }
}

public class ShoppingCart {
    private ArrayList<Item> cart;

    public ShoppingCart() {
        cart = new ArrayList<>();
    }

    public void addItems(int itemNo, String itemName, double price) {
        Item newItem = new Item(itemNo, itemName, price);
        cart.add(newItem);
        System.out.println("Item added to cart.");
    }

    public void showItems() {
        System.out.println("Item No\tItem Name\tPrice");
        for (Item item : cart) {
            System.out.println(item.getItemNo() + "\t\t" + item.getItemName() + "\t\t" + item.getPrice());
        }
    }

    public void deleteItem(int itemNo) {
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).getItemNo() == itemNo) {
                cart.remove(i);
                System.out.println("Item deleted from cart.");
                return;
            }
        }
        System.out.println("Item not found in cart.");
    }

    public void updateItem(int itemNo, String itemName, double price) {
        for (Item item : cart) {
            if (item.getItemNo() == itemNo) {
                item.setItemName(itemName);
                item.setPrice(price);
                System.out.println("Item updated successfully.");
                return;
            }
        }
        System.out.println("Item not found in cart.");
    }

    public void orderMenu() {
        // Implement order menu functionality here
        System.out.println("Order Menu");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart shoppingCart = new ShoppingCart();
        boolean exit = false;
        while (!exit) {
            System.out.println("1. Add Items\n2. Show Items\n3. Delete Item\n4. Update Item\n5. Order Menu\n6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter item number: ");
                    int itemNo = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter item name: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter item price: ");
                    double price = scanner.nextDouble();
                    shoppingCart.addItems(itemNo, itemName, price);
                    break;
                case 2:
                    shoppingCart.showItems();
                    break;
                case 3:
                    System.out.print("Enter item number to delete: ");
                    int deleteItemNo = scanner.nextInt();
                    shoppingCart.deleteItem(deleteItemNo);
                    break;
                case 4:
                    System.out.print("Enter item number to update: ");
                    int updateItemNo = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new item name: ");
                    String updatedItemName = scanner.nextLine();
                    System.out.print("Enter new item price: ");
                    double updatedPrice = scanner.nextDouble();
                    shoppingCart.updateItem(updateItemNo, updatedItemName, updatedPrice);
                    break;
                case 5:
                    shoppingCart.orderMenu();
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        scanner.close();
    }
}


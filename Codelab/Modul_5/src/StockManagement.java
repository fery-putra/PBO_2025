import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StockManagement {
    public static void main(String[] args) {
        ArrayList<Item> ItemList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        ItemList.add(new Item("Pencil", 20));
        ItemList.add(new Item("Pen", 15));
        ItemList.add(new Item("Book", 30));

        int option;

        while (true) {
            System.out.println("\n=== Stock Management Menu ===");
            System.out.println("1. Add New Item");
            System.out.println("2. Show All Items");
            System.out.println("3. Reduce Item Stock");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            try {
                option = scanner.nextInt();
                scanner.nextLine();

                switch (option) {
                    case 1:

                        System.out.print("Item Name: ");
                        String nama = scanner.nextLine();
                        System.out.print("Initial Stock: ");
                        try {
                            int stock = scanner.nextInt();
                            scanner.nextLine();
                            ItemList.add(new Item(nama, stock));
                            System.out.println("Item added successfully!");
                        } catch (InputMismatchException e) {
                            System.out.println("Stock inputs must be numbers!");
                            scanner.nextLine();
                        }
                        break;

                    case 2:

                        if (ItemList.isEmpty()) {
                            System.out.println("Item Stock List is empty.");
                        } else {
                            System.out.println("\nItem List:");
                            for (int i = 0; i < ItemList.size(); i++) {
                                Item b = ItemList.get(i);
                                System.out.println(i + ". " + b.getName() + " - Stock: " + b.getStock());
                            }
                        }
                        break;

                    case 3:

                        if (ItemList.isEmpty()) {
                            System.out.println("No items to deduct.");
                            break;
                        }

                        System.out.println("\nSelect items to deduct:");
                        for (int i = 0; i < ItemList.size(); i++) {
                            Item b = ItemList.get(i);
                            System.out.println(i + ". " + b.getName() + " - Stock: " + b.getStock());
                        }

                        try {
                            System.out.print("Input Item Index: ");
                            int index = scanner.nextInt();

                            System.out.print("Amount to be taken: ");
                            int amount = scanner.nextInt();

                            Item selectedItem = ItemList.get(index);

                            if (amount > selectedItem.getStock()) {
                                throw new OutOfStockException(
                                        "The stock for " + selectedItem.getName() +
                                                " is only " + selectedItem.getStock());
                            }

                            selectedItem.setStock(selectedItem.getStock() - amount);
                            System.out.println("Stock successfully reduced.");
                        } catch (InputMismatchException e) {
                            System.out.println("Inputs must be numbers!");
                            scanner.nextLine();
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("Item Index out of bounds!");
                        } catch (OutOfStockException e) {
                            System.out.println("Failed: " + e.getMessage());
                        }

                        break;

                    case 0:
                        System.out.println("Thank you for using Stock Management!");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Option not found.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Inputs must be numbers!");
                scanner.nextLine();
            }
        }
    }
}

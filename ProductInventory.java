/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productinventory;
import java.util.LinkedList;
import java.util.Scanner;
/**
 *
 * @author Nitro 5
 */

// This code defines a ProductInventory class that represents an inventory of products. 
//It allows the user to add, remove, and view products from the inventory. 
public class ProductInventory {
    private LinkedList<String> productList; // Encapsulated data structure using LinkedList
 
    // Constructor initializes the product list
    public ProductInventory() {
        productList = new LinkedList<String>();
     }
 
    // Public method for adding a product to the inventory
    public void addProduct(String productName) {
        // Check if the product is not already in the list
        if (!productList.contains(productName)) {
            productList.add(productName);
            System.out.println(productName + " is added to the inventory.");
       } else {
            System.out.println(productName + " is already in the inventory.");
       }
    }
 
    // Public method for removing a product from the inventory
    public void removeProduct(String productName) {
        // Check if the product is in the list
        if (productList.contains(productName)) {
            productList.remove(productName);
            System.out.println(productName + "  has been removed from the inventory.");
        } else {
            System.out.println(productName + " is not in the inventory.");
        }
    }
 
    // Public method for viewing all products in the inventory
    public void viewProducts() {
        // Check if the inventory is not empty
            if (!productList.isEmpty()) {
                System.out.println("Products in the inventory:");
                for (String product : productList) {
                System.out.println("- " + product);
            }
        } else {
            System.out.println("The inventory is empty.");
        }
    }
 
 // Main method that allows the user to interact with the inventory
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

       ProductInventory inventory = new ProductInventory(); // Create a new instance of the class

       byte choice = 0;
       // Display a menu and prompt the user for a choice until they choose to exit
       while (choice != 4) {
            System.out.println( "\n------------------------------\n"
            + "Dela Cerna's Product Inventory"
            + "\n------------------------------\n");

            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. View Products");
            System.out.println("4. Exit");
            System.out.print("Enter choice:");
            choice = scanner.nextByte();
            scanner.nextLine(); // Consume the newline character

            // Handle the user's choice
            switch (choice) {
                case 1:
                System.out.print("Enter the name of the product:");
                String productName = scanner.nextLine();
                System.out.print("\n------------------------------\n");
                inventory.addProduct(productName);
                break;
                
                case 2:   
                System.out.print("Enter the name of the product:");
                productName = scanner.nextLine();
                System.out.print("\n------------------------------\n");
                inventory.removeProduct(productName);
                break;
                
                case 3:
                System.out.print("\n------------------------------\n");
                inventory.viewProducts();
                break;
                
                case 4:
                System.out.print("\n------------------------------\n");
                System.out.println("Exit Successfully");
                break;
                
                default:
                System.out.print("\n------------------------------\n");
                System.out.print("Invalid choice.");
            }
        }

       scanner.close(); // Close the scanner to prevent resource leak
    }
}
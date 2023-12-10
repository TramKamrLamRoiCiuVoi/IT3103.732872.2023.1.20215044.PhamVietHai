// Pham Viet Hai 20215044
package lab_02;

import java.util.Scanner;

public class Aims {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Store store = new Store(10); // Change the capacity as needed
    private static final Cart cart = new Cart();

    public static void main(String[] args) {
        int choice;

        do {
            showMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    viewStore();
                    break;
                case 2:
                    updateStore();
                    break;
                case 3:
                    seeCurrentCart();
                    break;
                case 0:
                    System.out.println("Exiting the AIMS system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        } while (choice != 0);
    }

    private static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    private static void viewStore() {
        store.display();
        int choice;

        do {
            storeMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    seeMediaDetails();
                    break;
                case 2:
                    addToCart();
                    break;
                case 3:
                    playMedia();
                    break;
                case 4:
                    System.out.println("Current Cart:");
                    cart.print();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        } while (choice != 0);
    }

    private static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }

    private static void seeMediaDetails() {
        System.out.println("Enter the title of the media:");
        String title = scanner.nextLine();
        Media media = store.searchByTitle(title);

        if (media != null) {
            System.out.println(media);
            mediaDetailsMenu(media);
        } else {
            System.out.println("Media not found with title: " + title);
        }
    }

    private static void mediaDetailsMenu(Media media) {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (choice) {
            case 1:
                cart.addMedia(media);
                System.out.println("Media added to cart.");
                break;
            case 2:
                if (media instanceof Playable) {
                    ((Playable) media).play();
                } else {
                    System.out.println("Cannot play this type of media.");
                }
                break;
            case 0:
                break;
            default:
                System.out.println("Invalid choice. Please choose a valid option.");
        }
    }

    private static void addToCart() {
        System.out.println("Enter the title of the media to add to cart:");
        String title = scanner.nextLine();
        Media media = store.searchByTitle(title);

        if (media != null) {
            cart.addMedia(media);
            System.out.println("Media added to cart.");
        } else {
            System.out.println("Media not found with title: " + title);
        }
    }

    private static void playMedia() {
        System.out.println("Enter the title of the media to play:");
        String title = scanner.nextLine();
        Media media = store.searchByTitle(title);

        if (media != null && media instanceof Playable) {
            ((Playable) media).play();
        } else {
            System.out.println("Cannot play this type of media or media not found with title: " + title);
        }
    }

    private static void updateStore() {
        // Implement the logic to add or remove a media from the store
    }

    private static void seeCurrentCart() {
        System.out.println("Current Cart:");
        cart.print();

        int choice;
        do {
            cartMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    filterMediasInCart();
                    break;
                case 2:
                    sortMediasInCart();
                    break;
                case 3:
                    removeMediaFromCart();
                    break;
                case 4:
                    playMediaFromCart();
                    break;
                case 5:
                    placeOrder();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        } while (choice != 0);
    }

    private static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }

    private static void filterMediasInCart() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter by ID");
        System.out.println("2. Filter by title");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (choice) {
            case 1:
                System.out.println("Enter the ID to filter:");
                int id = scanner.nextInt();
                cart.filterById(id);
                break;
            case 2:
                System.out.println("Enter the title to filter:");
                String title = scanner.nextLine();
                cart.filterByTitle(title);
                break;
            case 0:
                break;
            default:
                System.out.println("Invalid choice. Please choose a valid option.");
        }
    }

    private static void sortMediasInCart() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Sort by title");
        System.out.println("2. Sort by cost");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (choice) {
            case 1:
                cart.sortByTitle();
                break;
            case 2:
                cart.sortByCost();
                break;
            case 0:
                break;
            default:
                System.out.println("Invalid choice. Please choose a valid option.");
        }
    }

    private static void removeMediaFromCart() {
        System.out.println("Enter the title of the media to remove from cart:");
        String title = scanner.nextLine();
        cart.removeMedia(title);
    }

    private static void playMediaFromCart() {
        System.out.println("Enter the title of the media to play from cart:");
        String title = scanner.nextLine();
        cart.playMedia(title);
    }

    private static void placeOrder() {
        System.out.println("Order placed successfully!");
        cart.clear();
    }
}


package org.example;

import java.util.ArrayList;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /* //Animal.java code
        ArrayList<Animal> animals = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the name of your animal (or press Enter to stop): ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            if (isNumeric(name)) {
                System.out.println("Invalid input. Name cannot be a number.");
                continue;
            }

            String isDogInput;
            while (true) {
                System.out.print("Is the animal a dog? (yes/no): ");
                isDogInput = scanner.nextLine();
                if (isDogInput.equalsIgnoreCase("yes") || isDogInput.equalsIgnoreCase("no")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                }
            }

            boolean isDog = isDogInput.equalsIgnoreCase("yes");

            Animal animal = new Animal(name, isDog);
            animals.add(animal);
        }

        scanner.close();

        System.out.println("Animal List:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    private static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        } */


        /* //TvShow.java code
        ArrayList<TvShow> tvShows = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Ask the user for the name of the TV show
            System.out.print("Enter the name of the TV show (or press Enter to stop): ");
            String showName = scanner.nextLine();

            // If the user enters nothing, break the loop
            if (showName.isEmpty()) {
                break;
            }

            // Ask the user for the number of episodes
            int numberOfEpisodes;
            while (true) {
                System.out.print("Enter the number of episodes: ");
                String episodesInput = scanner.nextLine();
                try {
                    numberOfEpisodes = Integer.parseInt(episodesInput);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number of episodes.");
                }
            }

            // Ask the user for the genre
            System.out.print("Enter the genre: ");
            String genre = scanner.nextLine();

            // Create a new TvShow object and add it to the list
            TvShow tvShow = new TvShow(showName, numberOfEpisodes, genre);
            tvShows.add(tvShow);
        }

        // Close the scanner
        scanner.close();

        // Print the TV show objects to the console
        System.out.println("TV Show List:");
        for (TvShow tvShow : tvShows) {
            System.out.println(tvShow);
        } */

        // Book.java code
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the title of the book (or press Enter to stop): ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            int numberOfPages = 0;
            while (true) {
                System.out.print("Enter the number of pages: ");
                String pagesInput = scanner.nextLine();
                try {
                    numberOfPages = Integer.parseInt(pagesInput);
                    if (numberOfPages <= 0) {
                        throw new NumberFormatException();
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a positive integer for the number of pages.");
                }
            }

            int publicationYear = 0;
            while (true) {
                System.out.print("Enter the publication year: ");
                String yearInput = scanner.nextLine();
                try {
                    publicationYear = Integer.parseInt(yearInput);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid integer for the publication year.");
                }
            }

            Book book = new Book(title, numberOfPages, publicationYear);
            books.add(book);
        }

        String printOption = "";
        while (true) {
            System.out.print("What would you like to print? (everything/name): ");
            printOption = scanner.nextLine();

            if (printOption.equalsIgnoreCase("everything") || printOption.equalsIgnoreCase("name")) {
                break;
            } else {
                System.out.println("Invalid option. Please enter 'everything' or 'name'.");
            }
        }

        scanner.close();

        if (printOption.equalsIgnoreCase("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        } else if (printOption.equalsIgnoreCase("name")) {
            for (Book book : books) {
                System.out.println("Title: " + book.getTitle());
            }
        }
    }
}

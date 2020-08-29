package com.company.restaurant;


import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

   public static void main(String[] args) {

      //create menu items
      MenuItem greekSalad = new MenuItem("Greek salad", 5.0, "tomato, cucumbers, feta, onions, parsley, olives, " +
              "olive oil", Category.APPETIZER, true);
      MenuItem chickenSoup = new MenuItem("Chicken soup", 7.0, "soup from made home chicken, potato, dill", Category.MAIN_COURSE, true);
      MenuItem tiramisuCake = new MenuItem("Tiramisu", 3.0, "cocoa, cognac, coffee, mascarpone, cookies, sugar, eggs",
              Category.DESERT, true);

      //create list of menu items
      List<MenuItem> menuItemList = new ArrayList<MenuItem>();
      menuItemList.add(greekSalad);
      menuItemList.add(chickenSoup);
      menuItemList.add(tiramisuCake);

      //add date
      LocalDate date = LocalDate.now();

      // create menu
      Menu menu = new Menu(menuItemList, date);

      //add item to menu
      menu.addMenuItem("Bishturma", 10.0, "Lamb, onion, garlic, paper", Category.MAIN_COURSE, true);
      menu.addMenuItem("Plov", 5.0, "Rice, lamb, onion, garlic, paper", Category.MAIN_COURSE, true);
      menu.addMenuItem("Vareniki", 3.5, "Сottage cheese, eggs, sugar", Category.MAIN_COURSE, true);
      menu.addMenuItem("Tiramisua", 3.5, "milk, cognac, coffee, mascarpone, cookies, sugar, eggs", Category.DESERT, true);

      //check for adding duplicates
      System.out.println("-----------------------------------");
      menu.addMenuItem("Tiramisu", 3.0, "cocoa, cognac, coffee, mascarpone, cookies, sugar, eggs", Category.DESERT, true);

      //delete item from menu
      System.out.println("---------------------------------");
      menu.deleteMenuItem(6);

      //print one item by id
      System.out.println("---------------------------------");
      System.out.println("PRINT ONE MENU ITEM:");
      printMenuItem(menu, 3);
      System.out.println("---------------------------------\n");

      //print menu
      System.out.println("OUR MENU: ");
      System.out.println("---------");
      printMenu(menu);

      //check equality of menu items
      System.out.println("---------------------------------");
      isEqual(menu, 3, 7);
   }

   private static void printMenu(Menu menu) {
      System.out.println("APPETIZERS: ");
      printMenuCategory(menu, Category.APPETIZER);
      System.out.println("------------------------------");

      System.out.println("MAIN COURSES : ");
      printMenuCategory(menu, Category.MAIN_COURSE);
      System.out.println("------------------------------");

      System.out.println("DESERTS: ");
      printMenuCategory(menu, Category.DESERT);
      System.out.println("------------------------------");

      System.out.println("Data: "+ menu.getData() +"\n");

   }




   public static void printMenuCategory(Menu menu, Category category) {
      for (MenuItem item : menu.getMenuItems()) {
         String aNew = isNew(item);
         if (item.getCategory() == category) {
            printItem(item, aNew);
         }
      }
   }

   private static String isNew(MenuItem item) {
      String aNew = "";
      if (item.isNew()) {
         aNew = "New";
      }
      return aNew;
   }

   private static void printItem(MenuItem item, String aNew) {
      System.out.println("id. "+item.getId() + ". " + item.getName() + " (" + item.getDescription() + ") " + " (" + aNew + ") -    " +
              " $" + item.getPrice()+"\n");
   }

   public static void printMenuItem(Menu menu, int id){
      for (MenuItem item : menu.getMenuItems()) {
         String aNew = isNew(item);
         if (item.getId() == id) {
            printItem(item, aNew);
         }
      }

   }

   public static void isEqual(Menu menu, int id1, int id2){
      MenuItem item1 = null, item2 = null;

      for (MenuItem item: menu.getMenuItems()) {
         if (item.getId() == id1) {
            item1 = item;
         }
         if (item.getId() == id2) {
            item2 = item;

         }
      }
      assert item1 != null;
      if(item1.equals(item2)) {
         System.out.println("Menu items "+id1+" and "+id2+" are equals");
      }else{
         System.out.println("Menu items "+id1+" and "+id2+" are NOT equals");
      }

   }
}

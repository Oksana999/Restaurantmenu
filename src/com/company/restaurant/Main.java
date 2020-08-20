package com.company.restaurant;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

   public static void main(String[] args) {

      MenuItem greekSalad = new MenuItem("Greek salad", 5.0, "tomato, cucumbers, feta, onions, parsley, olives, " +
              "olive oil", Category.APPETIZER, true);
      MenuItem chickenSoup = new MenuItem("Chicken soup", 7.0, "soup from made home chicken, potato, dill", Category.MAIN_COURSE, true);
      MenuItem tiramisuCake = new MenuItem("Tiramisu", 3.0, "cocoa, cognac, coffee, mascarpone, cookies, sugar, eggs",
              Category.DESERT, true);
      List<MenuItem> menuItemList = new ArrayList<MenuItem>();
      menuItemList.add(greekSalad);
      menuItemList.add(chickenSoup);
      menuItemList.add(tiramisuCake);

      LocalDate date = LocalDate.now();

      System.out.println("OUR MENU ");

      Menu menu = new Menu(menuItemList, date);

      for (MenuItem item :menu.getMenuItems()) {
         String aNew = "";
         if(item.isNew() == true) {
            aNew = "New";
         }
         if(item.getCategory() == Category.APPETIZER){
               System.out.println("APPETIZERS: ");
            }else if(item.getCategory() == Category.MAIN_COURSE) {
            System.out.println("MAIN COURSES : ");
         }else {
            System.out.println("DESERTS: ");
         }

            System.out.println(item.getName() + " (" + item.getDescription() + ") "+ " ("+aNew+") -    " +
                    " $"+item.getPrice() );
         }
      System.out.println("Data: "+ menu.getData() );

   }
}

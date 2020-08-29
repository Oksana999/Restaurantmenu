package com.company.restaurant;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Oksana
 */
public class Menu {
   private List<MenuItem> menuItems = new ArrayList<MenuItem>();
   private LocalDate data;

   public Menu(List<MenuItem> menuItems, LocalDate data) {
      this.menuItems = menuItems;
      this.data = data;
   }

   public List<MenuItem> getMenuItems() {
      return menuItems;
   }

   public void setMenuItems(List<MenuItem> menuItems) {
      this.menuItems = menuItems;
   }

   public LocalDate getData() {
      return data;
   }

   public void setData(LocalDate data) {
      this.data = data;
   }

   public void addMenuItem (String name, double price, String description, Category category, boolean isNew ){
      MenuItem item = new MenuItem(name, price, description, category, isNew);
      if (!menuItems.contains(item)) {
         menuItems.add(item);
      }else{
         System.out.println("ADDING DUPLICATE: Menu item \""+item.getName()+"\" already exists in menu !");
      }
   }

   public void deleteMenuItem(int id){
      MenuItem itemToDelete = null;
      for (MenuItem item: this.menuItems) {
         if(item.getId() == id){
            itemToDelete = item;
         }
      }

      this.menuItems.remove(itemToDelete);
      System.out.println("DELETE: Menu item \""+itemToDelete.getName()+"\" has been removed from menu");
   }

}

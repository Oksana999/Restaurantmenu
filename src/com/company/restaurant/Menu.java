package com.company.restaurant;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
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
}

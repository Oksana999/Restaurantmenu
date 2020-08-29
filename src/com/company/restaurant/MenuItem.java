package com.company.restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Oksana
 */
public class MenuItem {
   private int id;
   private String name;
   private double price;
   private String description;
   private Category category;
   private boolean isNew;
   private static int counter = 0;

   public MenuItem(String name, double price, String description, Category category, boolean isNew) {
      this.name = name;
      this.price = price;
      this.description = description;
      this.category = category;
      this.isNew = isNew;
      counter++;
      this.id = counter;

   }

   public MenuItem(){
      id++;
   }


   public int getId() {
      return id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public double getPrice() {
      return price;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public Category getCategory() {
      return category;
   }

   public void setCategory(Category category) {
      this.category = category;
   }

   public boolean isNew() {
      return isNew;
   }

   public void setNew(boolean aNew) {
      isNew = aNew;
   }

   @Override
   public String toString() {
     return  "id. "+id + ". " + name+ " (" + description + ") " + " (" + isNew()+ ") -    " +
              " $" + price+"\n";
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      MenuItem menuItem = (MenuItem) o;
      return Double.compare(menuItem.price, price) == 0 &&
              isNew == menuItem.isNew &&
              Objects.equals(name, menuItem.name) &&
              Objects.equals(description, menuItem.description) &&
              category == menuItem.category;
   }

   @Override
   public int hashCode() {
      return Objects.hash(id, name, price, description, category, isNew);
   }
}

package com.company.restaurant;

/**
 * @author Oksana
 */
public class MenuItem {
   private String name;
   private double price;
   private String description;
   private Category category;
   private boolean isNew;

   public MenuItem(String name, double price, String description, Category category, boolean isNew) {
      this.name = name;
      this.price = price;
      this.description = description;
      this.category = category;
      this.isNew = isNew;
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
}

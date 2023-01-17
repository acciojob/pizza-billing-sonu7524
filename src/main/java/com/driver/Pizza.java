package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        System.out.print("Base Price Of The Pizza: ");
    }

    public int getPrice(){
        if(isVeg){
            this.price = 300;
        }
        else {
            this.price = 400;
        }
        return price;
    }
    public void addExtraCheese(){
        System.out.println("Extra Cheese Added: 80");
        price += 80;
    }

    public void addExtraToppings(){
        if(isVeg == true){
            price += 70;
            System.out.println("Extra Cheese Added: 70");
        }
        else{
            System.out.println("Extra Cheese Added: 120");
            price += 120;
        }

    }

    public void addTakeaway(){
        System.out.println("Paperbag Added: 20");
        price += 20;
    }

    public String getBill(){
        bill = "Total bill :"+price;
        return this.bill;
    }
}

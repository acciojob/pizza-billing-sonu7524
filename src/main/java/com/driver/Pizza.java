package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int toppings;
    private int cheese;

    boolean isExtraCheeseAdded;
    boolean isExtraToppingAdded;
    boolean isTakeAwayAdded;
    boolean isbillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.bill = "";
        if(isVeg){
            this.price = 300;
            this.toppings = 70;
        }
        else {
            this.price = 400;
            this.toppings = 120;
        }
        this.cheese = 80;
        this.bill = "Base Price Of The Pizza: "+price;
    }

    public int getPrice(){
        return this.price;
    }
    public void addExtraCheese(){
        if(!isExtraCheeseAdded){
            price+= cheese;
            isExtraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(!isExtraToppingAdded){
            price+= toppings;
            isExtraToppingAdded = true;
        }
    }

    public void addTakeaway(){
        if(!isTakeAwayAdded){
            price+= 20;
            isTakeAwayAdded = true;
        }
    }

    public String getBill(){
        if(!isbillGenerated){
            if(isExtraCheeseAdded) this.bill += "\nExtra Cheese Added: "+ this.cheese;
            if(isExtraToppingAdded) this.bill += "\nExtra Toppings Added: "+this.toppings;
            if(isTakeAwayAdded) this.bill += "\nPaperbag Added: 20";
            this.bill += "\nTotal Price: "+this.price+"\n";
            isbillGenerated = true;
        }
        return this.bill;
    }
}

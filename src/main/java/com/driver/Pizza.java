package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean cheese;
    private boolean paperbag;
    private boolean extratopping;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg == true){
            this.price = 300;
        }
        else {
            this.price = 400;
        }
    }

    public int getPrice(){
        return this.price;
    }
    public void addExtraCheese(){
        if(cheese == false) {
            this.price += 80;
            this.cheese = true;
        }
    }

    public void addExtraToppings(){
        if(extratopping==false){
            if(isVeg == true){
                this.price += 70;
            }
            else{
                this.price += 120;
            }
            this.extratopping = true;
        }
    }

    public void addTakeaway(){
        this.paperbag = true;
        this.price += 20;
    }

    public String getBill(){
        if(isVeg) System.out.println("Base Price Of The Pizza: 300");
        else System.out.println("Base Price Of The Pizza: 400");
        if(cheese==true) System.out.println("Extra Cheese Added: 80");
        if(extratopping== true){
            if(isVeg) System.out.println("Extra Toppings Added: 70");
            else System.out.println("Extra Toppings Added: 120");
        }
        if(paperbag == true) System.out.println("Paperbag Added: 20");
        this.bill = "Total bill :"+this.price;
        return this.bill;
    }
}

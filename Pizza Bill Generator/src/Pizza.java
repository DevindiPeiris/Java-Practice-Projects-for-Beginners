public class Pizza {
    private int price;
    private Boolean veg;
    private int cheese = 100;
    private int toppings=150;
    private int pack=20;
    private int basePizzaPrice;
    private Boolean isExtraCheeseAdded = false;
    private Boolean isExtraToppingsAdded=false;
    private Boolean isTakeAway=false;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price=300;
        }
        else{
            this.price=400;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese(){
        isExtraCheeseAdded=true;
        this.price += cheese;
    }

    public void addExtraToppings(){
        isExtraToppingsAdded=true;
        this.price += toppings;
    }

    public void takeAway(){
        isTakeAway=true;
        this.price += pack;
    }

    public void getBill(){
        String bill = "";
        System.out.println("Pizza:   "+basePizzaPrice);
        if(isExtraCheeseAdded){
            bill += "Extra cheese added:  "+cheese+"\n";
        }
        if(isExtraToppingsAdded){
            bill += "Extra toppings added:  "+toppings+"\n";
        }
        if(isTakeAway){
            bill += "Take away:  "+pack+"\n";
        }
        bill += "Bill  :"+this.price + "\n";
        System.out.println(bill);
    }
}

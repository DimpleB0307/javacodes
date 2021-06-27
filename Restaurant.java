class Restaurant
{
String item;
int cost;
String vegOrNonVeg;
boolean isNonVeg;
int deliveryTime;

public static void main(String a[])
{
System.out.println("Main method started");

Restaurant food=new Restaurant();
food.item="Gobi Manchuri";
food.cost=50;
food.vegOrNonVeg="Veg";
food.isNonVeg=false;
food.deliveryTime=7;
System.out.println(food.item+" "+food.cost+" "+food.vegOrNonVeg+" "+food.isNonVeg+" "+food.deliveryTime);

Restaurant mast=new Restaurant();
mast.item="Chicken Lollipop";
mast.cost=250;
mast.vegOrNonVeg="Non Veg";
mast.isNonVeg=true;
mast.deliveryTime=6;
System.out.println(mast.item+" "+mast.cost+" "+mast.vegOrNonVeg+" "+mast.isNonVeg+" "+mast.deliveryTime);

Restaurant love=new Restaurant();
love.item="Chicken Biryani";
love.cost=200;
love.vegOrNonVeg="Non Veg";
love.isNonVeg=true;
love.deliveryTime=9;
System.out.println(love.item+" "+love.cost+" "+love.vegOrNonVeg+" "+love.isNonVeg+" "+love.deliveryTime);

System.out.println("Main method ended");
}
}


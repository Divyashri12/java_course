class Refrigerator{
String company;
String color;
int price;
void cool(){
System.out.println(color+" "+company+" "+price+" refrigerator used to cooling ....!");
}
void storeFood(){
System.out.println(color+" "+company+" "+price+" refrigerator used to storefood ....!");
}
public static void main(String[] args){

Refrigerator samsung = new Refrigerator();
samsung.company="samsung";
samsung.color="red";
samsung.price=25000;
samsung.cool();
samsung.storeFood();
}
}
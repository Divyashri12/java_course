class Flower{
String name;
String color;
int noofPetals;
void bloom(){
System.out.println(color+""+name+"is blooming....!");
}
void shedFragrance(){
System.out.println(color+""+name+"is blooming....!");
}
public static void main(String[] args){

Flower rose = new Flower();
rose.name="Rose";
rose.color="red";
rose.noofPetals=16;
rose.bloom();
rose.shedFragrance();
}
}
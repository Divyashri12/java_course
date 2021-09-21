class Cycle{
String name;
String color;
int gears;

void racing(){
System.out.println(color+" "+name+" "+gears+" is racing");
}
void travel(){
System.out.println(color+" "+name+" "+gears+" travled");
}
public static void main(String[] args){

Cycle cycle = new Cycle();
cycle.name="avon";
cycle.color="green";
cycle.gears=3;
cycle.racing();
cycle.travel();
}
}
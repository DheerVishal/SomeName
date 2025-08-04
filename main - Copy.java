interface I1{
    void show();
}
interface I2 extends I1{
    void display();
}
class Abc implements I2{
    public void show(){
        System.out.println("In interface1");
    }
   public void display(){
        System.out.println("In interface2");
    }
}
class Main{
    public static void main(String args[]){
        Abc a=new Abc();
        a.show();
        a.display();
    }
}
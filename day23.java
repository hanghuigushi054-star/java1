public class day23 {
    class Example {
private int valueA;
private int valueB;
public int getValueA() {
return valueA;
}
public void setValueA(int a) {
valueA = a;
}
public int getValueB() {
return valueB;
}
public void setValueB(int b) {
valueB = b;
}
}
public static void main(String[] args) {
day23 d = new day23();
Example e = d.new Example();
e.setValueA(10);
e.setValueA(20);
e.setValueB(30);
System.out.println("valueA = " + e.getValueA());
System.out.println("valueB = " + e.getValueB());
    
}
}

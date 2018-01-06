package std1.strings;

import java.util.Formatter;

public class Receipt {
    private double total =0;
    static int width=15;
    final static String FORM1 ="%-"+width+"s %5s %10s\n";
    final static String FORM2 ="%-"+width+".15s %5d %10.2f\n";
    final static String FORM3 ="%-"+width+"s %5s %10.2f\n";
    
    
    private Formatter f =new Formatter(System.out);
    public void printTitle(){
        f.format(FORM1, "Item", "Qty", "Price");
        f.format(FORM1, "----", "---", "-----");
    }
    public void print(String name, int qyt, double price){
        f.format(FORM2, name, qyt, price);
        total+=price;
    }
    public void printTotal(){
        f.format(FORM3, "Tax", "", total*0.06);
        f.format(FORM1, "", "", "-----");
        f.format(FORM3, "Total", "", total*1.06);
    }

    public static void main(String[] args) {
        Receipt receipt=new Receipt();
        receipt.printTitle();
        receipt.print("Jack'k Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3,5.1);
        receipt.print("Tree Bears Porridge",1 , 14.29);
        receipt.printTotal();

    }
}

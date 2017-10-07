
// import basis.za.adt.*;

public class BaumTest {
    private BinarySearchTree<Zahl> baum;
    private Zahl einzufuegendeZahl;
    private int[] wert = { 20, 28, 35, 31, 9, 4, 13, 17, 37, 25, 1, 12, 10, 16,
            27, 19, 42, 32, 30, 36 };
    private BaumZeichner zeichner;

    public BaumTest() {
        baum = new BinarySearchTree();
        //zeichner = new BaumZeichner(600,400,this.gibBaum(baum));
        zeichner = new BaumZeichner(600,400,baum);
    }

    public void fuehreAus() {
        System.out.println("Baumtest");
        for (int i = 0; i < wert.length; i++) {
            einzufuegendeZahl = new Zahl(wert[i]);
            baum.insert(einzufuegendeZahl);
            System.out.println("eingefuegt: " + einzufuegendeZahl.getZahl());
            //this.ausgabe(baum, "");
        }
        this.ausgabe(baum,"");
        
        System.out.print("inorder-Traversierung: ");
        this.inorder(baum);
        //zeichner.zeigeBaum(this.gibBaum(baum));
        zeichner.zeigeBaum(baum);
    }

    public void inorder(BinarySearchTree<Zahl> b){
        //li Teilbaum, Wurzel, re Teilbaum
        // System.out.println("inorder");
        if (!b.isEmpty()) {
            if (b.getLeftTree() != null){
                inorder(b.getLeftTree());
                // System.out.print("l");
            }
            System.out.print( b.getContent().getZahl() + "  ");
            if (b.getRightTree() != null){
                inorder(b.getRightTree());
                // System.out.print("r");
            }
        } else {
            // System.out.println("Baum leer");
        }
    }

    public void ausgabe(BinarySearchTree<Zahl> b, String s) {
        //System.out.println("Ausgabe");
        if (!b.isEmpty()) {
            if (b.getRightTree() != null)
                this.ausgabe(b.getRightTree(), s + "-");
            System.out.println(s + b.getContent().getZahl());
            if (b.getLeftTree() != null)
                this.ausgabe(b.getLeftTree(), s + "-");

        } else {
            //System.out.println("Baum leer");
        }
    } // ausgabe


}


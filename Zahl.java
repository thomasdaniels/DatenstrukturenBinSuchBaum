
public class Zahl implements ComparableContent<Zahl>{
    int z;

    public Zahl(int zahl){
        z = zahl;
    }

    public int getZahl() {
        return this.z;
    }

    public boolean isEqual(Zahl pContent) {

        if (z == pContent.getZahl()) {
            System.out.print("=");
            return true;
        } else {
            return false;
        }
    }

    public boolean isGreater(Zahl pContent) {

        if (z > pContent.getZahl()) {
            System.out.print(">");
            return true;
        } else {
            return false;
        }
    }

    public boolean isLess(Zahl pContent) {

        if (z <= pContent.getZahl()) {
            System.out.print("<");
            return true;
        } else {
            return false;
        }
    }

    public String toString(){
        return Integer.toString(z);
    }

}
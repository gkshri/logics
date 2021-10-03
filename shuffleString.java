import java.util.Arrays; 
public class suffle {
    public static  String restoreString(String s, int[] indices) {
        StringBuilder res = new StringBuilder(s);
        for(int i =0; i < indices.length; ++i)
             res.setCharAt(indices[i],s.charAt(i));
        return res.toString();
    }
  public static void main(String[] args) {
    String s="art";  
    int [] arr = {1,0,2}; 
    String ans=  restoreString(s,arr);
    System.out.println(ans);
  }
}

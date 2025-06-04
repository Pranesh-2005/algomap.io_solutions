public class IsSubsequence {
    public static void main(String[] js){
        String s1 = "Jeya";
        String s2 = "DomarJeya";
        System.out.print(isSubsequence(s1,s2));
    }
    public static boolean isSubsequence(String s1,String s2){
        int i=0;
        int j=0;
        while(i<s1.length() && j<s2.length()){
            if(s1.charAt(i)== s2.charAt(j)){
                i++;
            }
            j++;
        }
        return i == s1.length();
    }
}

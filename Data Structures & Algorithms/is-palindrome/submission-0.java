class Solution {
    public boolean isPalindrome(String s) {
        String cleanstr=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String res=new StringBuilder(cleanstr).reverse().toString();
        return cleanstr.equals(res);
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String LCP = "";
         if(strs.length == 0 || strs == null) return LCP;
         //this index represent the caracter we're ont it in any word
        int index = 0;
        //we go through the caracters in the first word
        for(char c:strs[0].toCharArray()){
            // we go through all the others words and make sure they have the same caracter as c    
            for(int i =1; i<strs.length; i++){
                if(strs[i].length() <= index || c != strs[i].charAt(index)){
                    return LCP;
                }
            }
            LCP +=c;
            index++;
        }
        return LCP;
    }
}


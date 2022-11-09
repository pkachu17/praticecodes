public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder s = new StringBuilder();
        for(String str : strs)
            s.append(str.length()).append('#').append(str);
        return s.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        ArrayList<String> list = new ArrayList<>();
        int i=0;
        while(i<s.length()){
            int j=i;
            while(s.charAt(j)!='#') j++;
            int length = Integer.valueOf(s.substring(i,j));
            i = j+1+length;
            list.add(s.substring(j+1, i));
        }
        return list;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));
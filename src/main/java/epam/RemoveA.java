package epam;

public class RemoveA {
    public String remove(String str)
    {
        String result = str;
        String temp = str;
        if(str.length()==0)
        {
            result = "";
        }
        else if(str.length()==1)
        {
            if(str.charAt(0)=='A')
                result = "";
        }
        else if(str.length()==2)
        {
            if(str.charAt(0)=='A' && str.charAt(1)=='A')
                result = "";
            else if(str.charAt(0)=='A')
                result = str.substring(1);
            else if(str.charAt(1)=='A')
                result = str.charAt(0)+"";
        }
        else {
            if (str.charAt(0) == 'A') {
                result = temp.substring(1);
                temp = temp.substring(1);
            }

            if (str.charAt(1) == 'A' && temp.length() == str.length()) {
                result = temp.charAt(0) + temp.substring(2);
            } else if (str.charAt(1) == 'A') {
                result = temp.substring(1);
            }
        }
        return result;
    }
}

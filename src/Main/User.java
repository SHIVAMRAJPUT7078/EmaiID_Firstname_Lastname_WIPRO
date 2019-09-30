package Main;

public class User {
    private String firstname;
    private String lastname;
    private int pincode;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public User(String firstname, String lastname, int pincode) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.pincode = pincode;
    }
    public String greaterstring(){
        String a = getFirstname();
        String b = getLastname();
        if ((a.compareTo(b))>0){
            return a;
        }
        else if(a.compareTo(b) == 0){
            return b;
        }
        else{
            return b;
        }
    }
    public String smallerstring(){
        String a = getFirstname();
        String b = getLastname();
        if ((a.compareTo(b))>0){
            return b;
        }
        else{
            return a;
        }
    }
    public int greaterstringlength(){
        return greaterstring().length();
    }
    public String pincodeforwardtraverse(){
        //int[] arr = getPincode();
        String a = String.valueOf(getPincode());
        int pincodelength = a.length();
        int stringlength = greaterstringlength();
        if(stringlength>pincodelength){
            return a.substring(pincodelength-1);
        }
        else if(stringlength == pincodelength){
            return a;
        }
        else{
            return (a.substring(stringlength,stringlength+1));
        }
/*
        StringBuilder sb = new StringBuilder(getPincode());
        int value = greaterstringlength();
        if(greaterstringlength() > sb.length()){
            int val = sb.length()-1;
            return (sb.charAt(val));
        }
        else{
            return sb.charAt(value);
        }*/
    }
    public String pincodebackwardtraverse(){
        String sr = String.valueOf(getPincode());
        StringBuilder sb = new StringBuilder(sr);
        StringBuilder st  = sb.reverse();
        String reversepincode = st.toString();
        int pincodelength = reversepincode.length();
        int stringlength = smallerstring().length();
        if(stringlength>pincodelength){
            return reversepincode.substring(0,1);
        }
        else if(stringlength == pincodelength){
            return sr;
        }
        else {
            return (reversepincode.substring(stringlength, stringlength + 1));
        }
    }
    public String getpincodecharacter(){
        String c1 = pincodeforwardtraverse();
        String c2 = pincodebackwardtraverse();
        return (c1+c2);
    }

    public String getEmailID(){
        String s1 = greaterstring().substring(0,2);
        String s2 = smallerstring().substring(0,2);
        String s3 = getpincodecharacter();
        return (s1+s2+s3);
    }

}

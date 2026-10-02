public class Name {
    String first;
    String last;
    public Name(String f , String l){
        this.last = l;
        this.first = f;
    }

    public String fullName(){
        return first + " " + last;

    }

    public String fixCase(String part){
        if(part.equals("")){
            part = part.toLowerCase();
            return part.substring(0,1).toUpperCase() + part.substring(1);
        }
        return part;
    }

    public static void main(String[] args) {
        Name n = new Name("Sean", "");
        System.out.println(n.fullName());
    }
}

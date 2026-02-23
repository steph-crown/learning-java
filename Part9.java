void main() {
    Fuck<String> x = new Fuck<>();
    ArrayList<String> y = new ArrayList<>();

    x.add("3");
    y.add("38");
    System.out.println(x.toString());
    System.out.println(y.toString());

    String text = "text";
    Object textString = "another string";
    text.toLowerCase();
    
}

class Fuck<E> extends ArrayList<E> {

}
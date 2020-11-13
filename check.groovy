class check {
    static void main(String[] args) {
        String a = "HelloWorld";
        String[] str;
        str = a.split('-');

        for( String values : str )
            println(values);
    }
}
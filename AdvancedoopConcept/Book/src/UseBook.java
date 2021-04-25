public class UseBook {

    public static void main(String[] args) {
            
        //Creating and Object to Fiction Class
        Fiction f=new Fiction("Harry Potter");
        
        //calling the toString() method on the Fiction class Object
        System.out.println(f.toString());
            
        //Creating and Object to Non-Fiction Class
        NonFiction nf=new NonFiction("Bible");
        
        //calling the toString() method on the Non-Fiction class Object
        System.out.println(nf.toString());
    }

}

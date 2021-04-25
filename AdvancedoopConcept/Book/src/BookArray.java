public class BookArray {

    public static void main(String[] args) {
        
        //Creating Book array which stores Fiction and Non-Fiction Book Objects
        Book bookArray[]={new Fiction("Jane Eyre"),
                            new Fiction("Beloved"),
                            new Fiction("To kill a Mockingbird"),
                            new Fiction("The four Winds"),
                            new Fiction("Outlander"),
                            new NonFiction("Silent Spring"),
                            new NonFiction("In cold bBlood"),
                            new NonFiction("Becoming"),
                            new NonFiction("Into Thin air"),
                            new NonFiction("Not Responding")};

        //This for loop will displays the Each Fiction and Non-Fiction book details
        for(int i=0;i<bookArray.length;i++)
        {
            //Displaying the information of each book
            System.out.println(bookArray[i].toString());
        }
    }

}

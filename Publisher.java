class Publisher {
    String name;
    
    public Publisher(String name) {
        this.name = name;
    }
}

class Book {
    String title;
    int year;
    Publisher publisher;
    
    public Book(String title, int year, Publisher publisher) {
        this.title = title;
        this.year = year;
        this.publisher = publisher;
    }
    
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Year: " + year);
        System.out.println("Publisher: " + publisher.name);
    }
}

class Literature extends Book {
    public Literature(String title, int year, Publisher publisher) {
        super(title, year, publisher);
    }
}

class Fiction extends Book {
    public Fiction(String title, int year, Publisher publisher) {
        super(title, year, publisher);
    }
}
 class Main {
    public static void main(String[] args) {
      
        Publisher penguin = new Publisher("Penguin");
        Publisher randomHouse = new Publisher("Random House");
        
        
        Literature litBook = new Literature("To Kill a Mockingbird", 1960, penguin);
        Fiction fictionBook = new Fiction("Harry Potter and the Philosopher's Stone", 1997, randomHouse);
        
        
        System.out.println("Literature Book Details:");
        litBook.displayDetails();
        System.out.println();
        
        System.out.println("Fiction Book Details:");
        fictionBook.displayDetails();
    }
}


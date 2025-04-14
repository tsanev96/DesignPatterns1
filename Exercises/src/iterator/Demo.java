package iterator;

public class Demo {
   public static void main(String[] args) {
       var product1 = new Product(1, "Headphones");
       var product2 = new Product(2, "MacBook");
       var product3 = new Product(3, "Mouse");

       var collection = new ProductCollection();
       collection.add(product1);
       collection.add(product2);
       collection.add(product3);

       var iterator = collection.createIterator();

       while (iterator.hasNext()) {
           System.out.println(iterator.current());
           iterator.next();
       }
   }
}

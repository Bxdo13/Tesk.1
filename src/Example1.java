public class Example1 {

    public class Autor{
        private String name;
        private String email;
        char gender;
        public Autor(String name, String email, char gender) {
            this.name = name;
            this.email = email;
            this.gender = gender;
        }
        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public char getGender() {
            return gender;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public String toString() {
            return "'name :"+getName() +" , email:"+ getEmail()+"'" ;
        }
    }
    public class Book extends Autor{
        private String name;
        private double price;
        private int qtyInStock;
        private Autor autor;

        public Book(String name,Autor autor, double price) {
            super(autor.getName(),autor.getEmail(),autor.getGender());
            this.name = name;
            this.price = price;
        }

        public Book(Autor autor, String name, double price, int qtyInStock) {
            super(autor.getName(),autor.getEmail(),autor.getGender());
            this.name = name;
            this.price = price;
            this.qtyInStock = qtyInStock;
        }

        @Override
        public String getName() {
            return name;
        }
        public Autor getAutor(){
            return autor;
        }
        public double getPrice() {
            return price;
        }

        public int getQtyInStock() {
            return qtyInStock;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setQtyInStock(int qtyInStock) {
            this.qtyInStock = qtyInStock;
        }

        @Override
        public String toString() {
            return "'autor name :"+getName() +" , autor email:"+ autor.getEmail()+"'" ;
        }
    }
}

public class Student implements Comparable<Integer> {

    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private String books;





//    public Student(String firstName, String lastName, String address,String books) {
//    }


    public Student() {
    }

    public Student(int id,String firstName, String lastName, String address, String books) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.books = books;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBooks() {
        return books;
    }

    public void setBooks(String books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", books='" + books + '\'' +
                '}';
    }



    @Override
    public int compareTo(Integer o) {
        return 0;
    }
}

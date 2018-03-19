import java.util.*;

/**
* when we change int to long, float ,double .. or any other number based types not working
* it says "AdditionalFunctionality" not a ParameterTypeChange
*
*/

public class Parameter_Type_Change_Left{
  Book book1;

  public static void main (String[] args){

  }

  public void foo(int a, int b){

  }

  public void setBook(Book book){
    book1 = book;
  }

}

class Book{
  String name;
  int numberOfPages;
  String writer;

  public Book(String name, int numberOfPages, String writer){
    this.name = name;
    this.numberOfPages = numberOfPages;
    this.writer = writer;
  }
}

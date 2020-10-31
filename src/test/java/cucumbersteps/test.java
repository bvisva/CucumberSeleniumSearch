package cucumbersteps;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.cucumber.java.DataTableType;
import io.cucumber.java.DocStringType;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class test {
	
	private static ObjectMapper objectMapper = new ObjectMapper();
	
	@DataTableType
    public Author authorEntry(Map<String, String> entry) {
        return new Author(
            entry.get("firstName"),
            entry.get("lastName"),
            entry.get("famousBook"));
    }
	
	@Given("these are following authors")
	public void these_are_following_authors(List<Author> authors) {

		for(Author author : authors) {
		System.out.println(author.get_firstName()+" - "+author.get_lastName()+" - "+author.get_famourBook());
		}
	    
	}
	
	@ParameterType(".*")
    public Book book(String bookName) {
    	return new Book(bookName);
    }
	
	@ParameterType("red|blue|yellow")  // regexp
	public Color color(String color){  // type, name (from method)
	    return new Color(color);       // transformer function
	}
	
	@DocStringType
    public JsonNode json(String docString) throws JsonProcessingException {
        return objectMapper.readValue(docString, JsonNode.class);
    }
	
	@Given("this is my javadoc below")
	public void this_is_my_javadoc_below(JsonNode docNode) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(docNode.get("hello"));
	    
	}

	
	
	@Given("I have launched URL")
	public void i_have_launched_url() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}	
	
	@Given("my name is {string}")
	public void my_name_is(String str) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(str);
	}	

	@Given("^my nationality is (.*)$")
	public void my_nationality_is(String strreg) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(strreg);
	}
	
	@Given("The i have {color} in pocket")
	public void the_i_have_red_in_pocket(Color c) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(c.get_color()); 
	}
	
	@Given("I have my favourite {book}")
	public void i_have_my_favourite_javabook(Book book) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(book.get_book());
	}
	
	
	

	
	@Given("this is my javadoc stringtext below")
	public void this_is_my_javadoc_stringtext_below(String docString) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(docString);
	}

}


class Book{
	
	private String _book;
	
	Book(String book){
		this._book = book;
	}

	public String get_book() {
		return _book;
	}

	public void set_book(String _book) {
		this._book = _book;
	}
	
}

class Color{
	
	private String _color;
	
	Color(String color){
		this._color = color;
	}

	public String get_color() {
		return _color;
	}

	public void set_color(String _color) {
		this._color = _color;
	}
	
}

class Author{
	private String _firstName;
	private String _lastName;
	private String _famourBook;
	
	Author(String firstName,String lastName,String famousBook){
		this._firstName = firstName;
		this._lastName = lastName;
		this._famourBook = famousBook;
	}

	public String get_firstName() {
		return _firstName;
	}

	public void set_firstName(String _firstName) {
		this._firstName = _firstName;
	}

	public String get_lastName() {
		return _lastName;
	}

	public void set_lastName(String _lastName) {
		this._lastName = _lastName;
	}

	public String get_famourBook() {
		return _famourBook;
	}

	public void set_famourBook(String _famourBook) {
		this._famourBook = _famourBook;
	}
	
	
}

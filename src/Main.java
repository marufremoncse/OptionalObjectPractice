import java.io.NotActiveException;
import java.util.Optional;

public class Main {
	public static void main(String[] args) {
		Optional<String> empty =  Optional.ofNullable(null);
		
		String orElseString =  empty
				.map(String::toUpperCase)
				.orElse("Anni");
		
		
		System.out.println(orElseString);
		System.out.println(empty.isPresent());
		System.out.println(empty.isEmpty());
		
		empty.ifPresent(word -> System.out.println(word));
		
		empty.ifPresentOrElse(System.out::println, ()-> System.out.println("Anni"));
		
		Person person = new Person("Remon", "Remon@GMAIL.com");
		System.out.println(person.getEmail().map(String::toLowerCase).orElse("email is not provided"));
	}
}

class Person{
	private final String name;
	private final String email;
	public Person(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public Optional<String> getEmail() {
		return Optional.ofNullable(email);
	}
}

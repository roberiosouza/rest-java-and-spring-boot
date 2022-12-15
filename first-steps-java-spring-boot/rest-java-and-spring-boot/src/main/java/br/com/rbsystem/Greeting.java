package br.com.rbsystem;

public class Greeting {
	
	private final Long id;
	private final String name;
	
	public Greeting(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}	

}

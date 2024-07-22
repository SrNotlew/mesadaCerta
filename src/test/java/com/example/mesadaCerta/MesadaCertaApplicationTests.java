package com.example.mesadaCerta;

import com.example.mesadaCerta.user.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MesadaCertaApplicationTests {

	@Test
	public void testUserConstructor() {
		// Act
		User user = new User();

		String username = "john_doe";
		String firstName = "John";
		String lastName = "Doe";
		String email = "john.doe@example.com";
		String password = "securePassword";

		// Arrange
		user.setUsername("john_doe");
		user.setFirstName("John");
		user.setLastName("Doe");
		user.setEmail("john.doe@example.com");
		user.setPassword("securePassword");


		// Assert
		assertEquals(username, user.getUsername());
		assertEquals(firstName, user.getFirstName());
		assertEquals(lastName, user.getLastName());
		assertEquals(email, user.getEmail());
		assertEquals(password, user.getPassword());
	}

}

package com.bookstore;

import com.bookstore.config.SecurityUtility;
import com.bookstore.domain.Book;
import com.bookstore.domain.ShoppingCart;
import com.bookstore.domain.User;
import com.bookstore.domain.security.Role;
import com.bookstore.domain.security.UserRole;
import com.bookstore.service.BookService;
import com.bookstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;
	
	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user1 = new User();
		user1.setFirstName("Shimul");
		user1.setLastName("Hosen");
		user1.setUsername("shimul");
		user1.setPassword(SecurityUtility.passwordEncoder().encode("p"));
		user1.setEmail("shimulhosen.cse@gmail.com");
		Set<UserRole> userRoles = new HashSet<>();
		Role role1 = new Role();
		role1.setRoleId(1);
		role1.setName("ROLE_USER");
		userRoles.add(new UserRole(user1, role1));

		userService.createUser(user1, userRoles);
		
		/*Book b=new  Book();
		long a=1;
		b.setId(a);
		b.setTitle("এরদোয়ানঃ দ্যা চেইঞ্জ মেকার");
		b.setAuthor("হাফিজুর রহমান (পিএইচডি)");
		b.setPublisher("গার্ডিয়ান পাবলিকেশন্স");
		b.setPublicationDate("February,2018");
		b.setLanguage("Bengali");
		b.setCategory("Politics");
		b.setNumberOfPages(256);
		b.setFormat("Hard Cover");
		b.setIsbn(111);
		b.setShippingWeight(0.25);
		b.setListPrice(10);
		b.setOurPrice(6);
		b.setDescription("এরদোয়ানঃ দ্যা চেইঞ্জ মেকার বইটি ১৬ই ফেব্রুয়ারী ২০১৮ বই মেলায় প্রথম গার্ডিয়ান পাবলিকেশন্স থেকে প্রকাশিত হয়। এরদোয়ানঃ দ্যা চেইঞ্জ মেকার বইটির লেখক হাফিজুর রহমান বর্তমানে তুরস্কে পি এইচ ডি করছেন। ২০১৮ এর বই মেলায় বইটি বেস্ট সেলার এর সম্মান অর্জন করে। বইবাজার ডট কম এবং গার্ডিয়ান পাবলিকেশন্স এ বইটি পাওয়া যাচ্ছে।");
		b.setInStockNumber(100);
		b.setActive(true);
		
		bookService.save(b);
		*/
		
	}
}

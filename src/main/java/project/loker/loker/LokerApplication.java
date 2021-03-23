package project.loker.loker;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class LokerApplication {



	public static void main(String[] args) {
		SpringApplication.run(LokerApplication.class, args);
	}

}

////////////////////////////////////////////////////////////////////////////

// untuk input role di database postgres heroku

// package project.loker.loker;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.CommandLineRunner;
// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.jdbc.core.JdbcTemplate;



// @SpringBootApplication  
// public class LokerApplication implements CommandLineRunner {

//     @Autowired
// 	private JdbcTemplate jdbcTemplate;
	
// 	public static void main(String[] args) {
// 		SpringApplication.run(LokerApplication.class, args);
// 	}
	
// 	@Override
// 	public void run(String... args) throws Exception {
// 	    String sql = "INSERT INTO roles (name) VALUES ("
// 	            + "'ROLE_ADMIN')";
		 
// 	    int rows = jdbcTemplate.update(sql);
// 	    if (rows > 0) {
// 	        System.out.println("A new role has been inserted.");
// 	    }
// 	}

// }
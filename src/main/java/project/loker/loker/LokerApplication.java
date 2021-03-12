package project.loker.loker;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import project.loker.loker.model.Role;
import project.loker.loker.repository.RoleRepository;

@SpringBootApplication
public class LokerApplication implements CommandLineRunner {

	
	@Autowired
	private RoleRepository roleRepository ;

	public static void main(String[] args) {
		SpringApplication.run(LokerApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Creating Roles object: roleAdmin");
		Role role= new Role();
		roleAdmin.setName("ROLE_ADMIN");
		
		System.out.println("roleAdmin created.");

		this.roleRepository.save(roleAdmin);

}


}
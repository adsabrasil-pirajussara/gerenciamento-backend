package br.org.adsabrasil.pirajussara.gerenciamento;

import br.org.adsabrasil.pirajussara.gerenciamento.model.Cargo;
import br.org.adsabrasil.pirajussara.gerenciamento.model.Departamento;
import br.org.adsabrasil.pirajussara.gerenciamento.model.Igreja;
import br.org.adsabrasil.pirajussara.gerenciamento.model.Setor;
import br.org.adsabrasil.pirajussara.gerenciamento.service.CargoService;
import br.org.adsabrasil.pirajussara.gerenciamento.service.DepartamentoService;
import br.org.adsabrasil.pirajussara.gerenciamento.service.IgrejaService;
import br.org.adsabrasil.pirajussara.gerenciamento.service.SetorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class GerenciamentoApplication implements CommandLineRunner {

	@Autowired
	IgrejaService igrejaService;

	@Autowired
    CargoService cargoService;

	@Autowired
    SetorService setorService;

	@Autowired
    DepartamentoService departamentoService;

	public static void main(String[] args) {
		SpringApplication.run(GerenciamentoApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/api/**")
						.allowedOrigins("http://localhost:4200")
						.allowedMethods("GET", "POST", "PUT", "DELETE", "HEAD")
						.allowCredentials(true);
			}
		};
	}

	@Override
	public void run(String... args) throws Exception {

        System.err.println("\n##########################################################################################\n");

		igrejaService.removeAll();

		igrejaService.cadastrar(new Igreja("Pirajussara", "Rua dolores Romero", false));
		igrejaService.cadastrar(new Igreja("Paria", "Rua Adao Costa Mendes", false));
		igrejaService.cadastrar(new Igreja("Novo Campo Limpo", "Rua Tapajos", false));


		for(Igreja igreja : igrejaService.listarAll()){
			System.err.println(igreja);
		}

		System.err.println("\n##########################################################################################\n");

		cargoService.removeAll();

		cargoService.cadastrar(new Cargo("Lider"));
		cargoService.cadastrar(new Cargo("Membro"));
		cargoService.cadastrar(new Cargo("Pastor"));


        for(Cargo cargo : cargoService.listarAll()){
            System.err.println(cargo);
        }

        System.err.println("\n##########################################################################################\n");

        setorService.removeAll();

        setorService.cadastrar(new Setor("Pirajussara"));
        setorService.cadastrar(new Setor("Vila Remo"));
        setorService.cadastrar(new Setor("Calu"));
        setorService.cadastrar(new Setor("Capão Redondo"));
        setorService.cadastrar(new Setor("Parque Santo Antonio"));


        for(Setor setor : setorService.listarAll()){
            System.err.println(setor);
        }

        System.err.println("\n##########################################################################################\n");

        departamentoService.removeAll();

        departamentoService.cadastrar(new Departamento("ADSA Kids"));
        departamentoService.cadastrar(new Departamento("GEADSA"));
        departamentoService.cadastrar(new Departamento("JUADSA"));
        departamentoService.cadastrar(new Departamento("CIADSA"));
        departamentoService.cadastrar(new Departamento("SEMADSA"));


        for(Departamento departamento: departamentoService.listarAll()){
            System.err.println(departamento);
        }

        System.err.println("\n##########################################################################################\n");
	}

}
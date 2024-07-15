package api_rest_2.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


/**
	 * 
	 * TODO:
	 * 
	 * In nuovo progetto SpringBoot, definire un etita' da salvare
	 * in DB, definita come segue:
	 * 
	 * Employee:
	 * - id : INT
	 * - name : STRING
	 * - surname : STRING
	 * - salary : INT
	 * - bonus : INT
	 * 
	 * Dopo aver creato l'entita' con relativi repository
	 * e service, definire controller per permettere all'utente
	 * le seguenti interazioni:
	 * - lettura di tutti i dati presenti in tablla
	 * - aggiunta di un nuovo employee
	 * - modifica di un vecchio employee
	 * - eliminiazione di un employee
	 * 
	 * Dove necessario definire gli opportuni DTO per permttere
	 * la corretta trasformazione dei dati in input.
	 * 
	 * BONUS:
	 * ----------------------------------------------------------
	 * Aggiungere una tabella Role collegata 1-a-N con
	 * Employee con i seguenti attributi:
	 * - id : INT
	 * - name : STRING
	 * 
	 * Mofidificare il motodo che legge tutta la tabella Employee
	 * per ritornare tutti gli Employee con il/i relativi ruolo/i.
	 * 
	 */
}

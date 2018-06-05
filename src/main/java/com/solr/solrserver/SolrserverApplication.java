package com.solr.solrserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class SolrserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SolrserverApplication.class, args);
	}
	
	@RestController
	class SolrServer {
	    
	    @RequestMapping("/")
	    String startserver() {
	        return "Solr Server Started";
	    }
	    
	    @RequestMapping("/results")
	    String fetchresults() {
	        return "Fetching all results from Solr Index";
	    }
	    
	    @RequestMapping("/index")
	    String indexresults() {
	        return "Indexing all results from Solr Index";
	    }
	}
}

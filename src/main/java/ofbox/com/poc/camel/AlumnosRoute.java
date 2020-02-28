package ofbox.com.poc.camel;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.bindy.csv.BindyCsvDataFormat;
import org.springframework.stereotype.Component;

import ofbox.com.poc.model.Alumno;

@Component
public class AlumnosRoute extends RouteBuilder{
	
	private static final String DATASOURCE = 
			"?dataSource=#dataSource";
	
	private static final String OUPUT_CLASS = 
			"&outputClass=ofbox.com.poc.model.Alumno";
	
	private static final String SELECT = 
			"sql:select * from alumno";
	
	@Override
	public void configure() throws Exception {
		BindyCsvDataFormat bindy = new BindyCsvDataFormat(ofbox.com.poc.model.Alumno.class);
		
		from("direct:inicioRuta")
		.to("activemq:alumno.convert");
		
		from("activemq:alumno.convert")
			.to(SELECT + DATASOURCE + OUPUT_CLASS)
			.split().body(Alumno.class)
			.log("${body}")
			.marshal(bindy)
			.to("ftp:developer@192.168.16.20?password=5secret10meperla")
			;
	}
}

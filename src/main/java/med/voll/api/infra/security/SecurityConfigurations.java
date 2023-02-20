package med.voll.api.infra.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfigurations {

	@Autowired
	private SecurityFilter securityFilter;
	
	/**
	 * Desabilitar a proteção do spring contra CSRF já que foi usado uma API REST
	 * stateless.
	 * 
	 * @param http
	 * @return
	 * @throws Exception
	 */
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		return http.csrf().disable().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
				.and().authorizeHttpRequests()
				.requestMatchers(HttpMethod.POST,"/login").permitAll()
				.requestMatchers("/v3/api-docs/**","swagger-ui.html","/swagger-ui/**").permitAll()
			    .requestMatchers(HttpMethod.DELETE, "/medicos").hasRole("ADMIN")
//			    .requestMatchers(HttpMethod.DELETE, "/pacientes").hasRole("ADMIN")
				.anyRequest().authenticated()			    
				.and().addFilterBefore(securityFilter, UsernamePasswordAuthenticationFilter.class)
                .build();
	}

	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
		return configuration.getAuthenticationManager();
	}
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}

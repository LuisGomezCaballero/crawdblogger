package craw.crawdblogger.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operaciones")
public class MainController {

	@PostMapping("/registraroperacion")
	public Boolean registrarOperacion(@RequestBody String requestParam) {

		Boolean exito = Boolean.FALSE;

		if (true) {
			exito = Boolean.TRUE;
		}

		System.out.println("registraroperacion: " + requestParam);

		return exito;
	}
}

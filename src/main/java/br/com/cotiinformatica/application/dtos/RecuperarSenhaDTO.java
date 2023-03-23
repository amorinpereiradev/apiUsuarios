package br.com.cotiinformatica.application.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RecuperarSenhaDTO {

	@Email(message = "Informe um endereço de email válido.")
	@NotBlank(message = "Email do usuário é obrigatório.")
	private String email;
}

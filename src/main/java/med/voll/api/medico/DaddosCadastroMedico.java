package med.voll.api.medico;

import med.voll.api.endereco.DadosEnereco;

public record DaddosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEnereco endereco) {
}

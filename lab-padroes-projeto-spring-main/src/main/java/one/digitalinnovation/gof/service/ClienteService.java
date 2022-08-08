package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Cliente;

//DEfine o padrão Strategy - Pode ser implementada inúmeras vezes
public interface ClienteService {

	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);

}

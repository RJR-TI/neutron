package br.ucsal.neutron.user.dao;

import java.util.ArrayList;
import java.util.List;

import br.ucsal.neutron.user.model.User;

public class UserDAO {

	private static List<User> usuarios = new ArrayList<>();
	private User tester = new User();
	private int count;

	public static void Save(User usuario) {
		usuarios.add(usuario);
	}

	public static void delete(Long id) {
		User tester = null;
		for (User user : usuarios) {
			if (user.getId() == id) {
				tester = user;
			}
		}
		usuarios.remove(tester);
	}
	
	
	public List<User> Listar(){ 
		usuarios.add(new User("Teste", "123"));
		return usuarios; 
	}

	public User ListarUm(Long id) {
		int contador = 0;
		for (User user : usuarios) {
			contador++;
			if (user.getId() == id) {
				this.tester = user;

			}
		}
		this.count = contador;
		return this.tester;
	}

	public void update(String userName, String passWord) {
		this.tester.setUsername(userName);
		this.tester.setPassword(passWord);
		usuarios.set((this.count-1), tester);
	}
}
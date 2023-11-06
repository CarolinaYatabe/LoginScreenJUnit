/*
Classe pra autenticação do usuário, simulando a userDatabase
*/
import java.util.HashMap;
import java.util.Map;

public class LoginScreen {
    private final Map<String, String> userDatabase; //Simulação da userDatabase que recebe username e password .

    /*
    *Crição da nova instância em loginScreen e inicializa a database.
    */
    public LoginScreen(){
        userDatabase = new HashMap<>();
        userDatabase.put("john", "password123");
        userDatabase.put("alice", "securepass");        
    }
    
    /*
    *Tentativa de autenticar o usuário basenando-se no username e password.
    *
    *@param username: Usuário tenta logar com seu username
    *@param password: Usuário coloca sua senha.
    *@return {@code true} se ambos estiverem de acordo, {@code false} se um ou ambos os campos estiverem incorretos.
    */
    public boolean login(String username, String password){
        
        if(userDatabase.containsKey(username)){
            String storedPassword = userDatabase.get(username);
            if(storedPassword.equals(password)){
                return true; //Sucesso na autenticação.
            }
        }
        return false; //Falha na autenticação.
    }

    /*
    *Adiciona um novo usuário a userDatabase.
    *Esse métono não é recomendado o uso já que não há medidas de segurança apropriadas.
    *
    *@param usename: username do usuário.
    *@param password: senha do usuário.
    */
    void addUser(String username, String password) {
        userDatabase.put(username, password);
    }
    
}

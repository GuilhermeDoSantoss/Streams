package br.com.guilherme.streams;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class StreamsApplication {

	public static void main(String[] args) {
		try{
			String jsonStr = new String (Files.readAllBytes(Paths.get("Pessoa.json")));
			Gson gson = new Gson();
			Type type = new TypeToken<List<Pessoa>>() {}.getType();
			List<Pessoa> lista = gson.fromJson(jsonStr, type);

			lista.forEach(p->System.out.println(p));
			Pessoa novaPessoa = new Pessoa(151, "Guilherme", "guilherme@santos.com", "987.456.321-80", 30);

			//List<Pessoa> res1 = lista.stream().toList();
			List<Pessoa> res2 = lista.stream().collect(Collectors.toList());

			res2.add(novaPessoa);
			System.out.println(res2);

		} catch(Exception ex){
			ex.printStackTrace();
		}
	}

}

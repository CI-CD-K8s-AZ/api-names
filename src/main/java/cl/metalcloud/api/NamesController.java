package cl.metalcloud.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/names")
@CrossOrigin("*")
public class NamesController {

	private static ArrayList<String> names = new ArrayList<>(Arrays.asList("Pedro","Antonio","Roberto", "Juan", "Luis"));
	
	@GetMapping("/")
	public ArrayList<String> getAll() {
		return names;
	}
	
	private int getRandomNumber(int min, int max) {
	    Random random = new Random();
	    return random.nextInt(max - min) + min;
	}
	
	@GetMapping("/random")
	public String getRandom() {
	    int index = getRandomNumber(1, names.size()) - 1;
	    if(index < 0) index = 0;
	    if(index > names.size()) index = names.size()-1;
		return "\"" + names.get(index) + "\"";
	}
}

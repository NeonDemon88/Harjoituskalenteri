package projekti.harkkakalenteri.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import projekti.harkkakalenteri.domain.HarkkaRepo;

@Controller
public class HarkkaController {
	
	@Autowired
	private HarkkaRepo rep;
	
	

}

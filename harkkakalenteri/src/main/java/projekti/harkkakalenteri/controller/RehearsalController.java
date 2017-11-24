package projekti.harkkakalenteri.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import projekti.harkkakalenteri.domain.Rehearsal;
import projekti.harkkakalenteri.domain.RehearsalRepo;

@Controller
public class RehearsalController {

	@Autowired
	private RehearsalRepo rep;

	// show all rehearsals
	@RequestMapping(value = "/rehearsalList", method = RequestMethod.GET)
	public String bookList(Model model) {
		model.addAttribute("rehearsals", rep.findAll());
		return "rehearsalList";
	}


	// REST for all rehearsals
	@RequestMapping(value="/rehearsals", method = RequestMethod.GET)
	public @ResponseBody List<Rehearsal> rehearsalListRest(){
		return (List<Rehearsal>) rep.findAll();
	}

	//REST for id
	@RequestMapping(value="/rehearsal/{id}", method = RequestMethod.GET)
	public @ResponseBody Rehearsal findRehearsalRest(@PathVariable("id") Long rehearsalId){
		return rep.findOne(rehearsalId);
	}

	// creating new rehearsal
	@RequestMapping(value = "/add")
	public String addRehearsal(Model model) {

		model.addAttribute("rehearsal", new Rehearsal());
		return "addrehearsal";
	}


	// save new rehearsal to repository
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveRehearsal(Rehearsal rehearsal) {
		rep.save(rehearsal);

		return "redirect:rehearsalList";
	}


	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String deleteRehearsal(@PathVariable("id") Long rehearsalId, Model model) {

		rep.delete(rehearsalId);
		return "redirect:../rehearsalList";
	}

	@RequestMapping(value="/")
	public String redirect() {
		return "login";
	} 
	
	@RequestMapping(value="/login")
	public String login() {
		return "login";
	} 
//	
//	@RequestMapping(value="forgot")
//	public String forgotPassword() {
//		return "forgotPassword";
//	} 



}

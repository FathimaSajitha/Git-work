

package sgic.bt.controller;


import java.util.ArrayList;
import java.util.List;



import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import sgic.bt.domain.Issue;

@RestController
public class IssueController {

@RequestMapping("/issues")
public List<Issue>issue() {
	List<Issue> issueList = new ArrayList<>();
	Issue issueOne = new Issue();
	issueOne.setDiscription("Issue One Description is here");
	issueOne.setTitle("Wrong Pronounciation in Headlines.");
	issueOne.setId("1");
	
	Issue issueTwo = new Issue();
	issueTwo.setDiscription("Issue Two discription here");
	issueTwo.setTitle("Wrong Color palatte");
	issueTwo.setId("2");
	
	issueList.add(issueOne);
	issueList.add(issueTwo);
			
	return issueList;
}
@PostMapping("/issues")
public String createIssue(@Validated Issue issue) {
	System.out.print("In the post method create a issue.");
	return "Succes";
	
}
}
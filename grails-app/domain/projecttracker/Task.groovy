package projecttracker

import java.util.Date;

class Task {
    
	String name
	String description
	Date dueDate
	String toString(){
		"${name}"
	}
	
	//connect to other models
	static belongsTo = [assignee:EndUser, project:Project]
	
    static constraints = {
		//sets the order
		name()
		description()
		dueDate()
    }
}

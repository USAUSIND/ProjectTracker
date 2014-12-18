package projecttracker

class Project {
	
	// put all column names 
	String name 
	String description
	Date dueDate
	String billingType
	//drop down list
	String toString(){
		"${name}"
	}
	
	//project will point to end user
	static belongsTo = [owner:EndUser]
    static hasMany = [tasks:Task]
	
    static constraints = {
		// name cannot be blank and should be unique
		name(blank:false,unique:true)
		description()
		dueDate(min:new Date())
		billingType(nullable:true, inList:["Hourly","Milestone","NonBillable"])
    }
}

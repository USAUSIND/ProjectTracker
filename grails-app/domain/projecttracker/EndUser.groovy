package projecttracker

class EndUser {

	String userName
	String passWord
	String fullName
	static hasMany = [projects:Project, tasks:Task]
	String toString(){
		"${fullName}"
	}
    static constraints = {
		fullName()
		userName()
		passWord()
    }
}

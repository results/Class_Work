package pack.dao.controller;

public enum StudentSQL {
	
	INSERT_NEW("INSERT INTO student (id, firstname, lastname,street) VALUES (?,?,?,?)"),
	FIND_ALL("SELECT * FROM STUDENT"),
	UPDATE_ADDRESS("UPDATE STUDENT SET street = ?  WHERE id = ?"),
	FIND_BY_STATE("SELECT * FROM STUDENT WHERE state = ?"),
	FIND_BY_ID("SELECT * FROM STUDENT WHERE id = ?");
	
    private String statement;
    
    StudentSQL(String statement) {
        this.statement = statement;
    }
 
    public String getStatement() {
        return this.statement;
    }
    


}

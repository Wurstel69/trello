package progetto.lavorogruppo;

public class Status {
	
	public int idStatus;
	public String nameStatus;
	
	public Status() {};
	
	public Status(int idStatus, String nameStatus) {
		this.idStatus = idStatus;
		this.nameStatus = nameStatus;
	}

	public int getIdStatus() {
		return idStatus;
	}

	public void setIdStatus(int idStatus) {
		this.idStatus = idStatus;
	}

	public String getNameStatus() {
		return nameStatus;
	}

	public void setNameStatus(String nameStatus) {
		this.nameStatus = nameStatus;
	}

}

package com.projectTrello;
import java.time.LocalDate;

public class Projects {
	public int idProject;
	public int idTask;
	public int idUser;
	public String projectName;
	public String description;
	LocalDate dateStart;
	LocalDate dateOpening;
	LocalDate dateFinishEstimated;
	LocalDate dateFinishEffective;
	
public Projects() {};

public Projects(int idProject, int idTask, int idUser, String projectName, String description, LocalDate dateStart, LocalDate dateOpening,
LocalDate dateFinishEstimated,LocalDate dateFinishEffective ) {
	
	this.idProject = idProject;
	this.idTask = idTask;
	this.idUser = idUser;
	this.projectName = projectName;
	this.description = description;
	this.dateStart = dateStart;
	this.dateOpening = dateOpening;
	this.dateFinishEstimated = dateFinishEstimated;
	this.dateFinishEffective = dateFinishEffective;
	
}
	
	
}

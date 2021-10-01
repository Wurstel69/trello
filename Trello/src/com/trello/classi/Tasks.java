package com.trello.classi;

import java.time.LocalDate;

public class Tasks {
	int id_task;
	int id_project;
	int id_user;
	int id_status;
	String task_name;
	String descriptions;
	LocalDate date_start;
	LocalDate date_finish;
	
	public Tasks () {}
	
	public Tasks (int id_task, int id_project, int id_user, int id_status, String task_name, 
				  String descriptions, LocalDate date_start, LocalDate date_finish) {
		this.id_task = id_task;
		this.id_project = id_project;
		this.id_user = id_user;
		this.id_status = id_status;
		this.task_name = task_name;
		this.descriptions = descriptions;
		this.date_start = date_start;
		this.date_finish = date_finish; 
	}

	
	public int getId_task() {
		return id_task;
	}

	public void setId_task(int id_task) {
		this.id_task = id_task;
	}

	public int getId_project() {
		return id_project;
	}

	public void setId_project(int id_project) {
		this.id_project = id_project;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public int getId_status() {
		return id_status;
	}

	public void setId_status(int id_status) {
		this.id_status = id_status;
	}

	public String getTask_name() {
		return task_name;
	}

	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}

	public LocalDate getDate_start() {
		return date_start;
	}

	public void setDate_start(LocalDate date_start) {
		this.date_start = date_start;
	}

	public LocalDate getDate_finish() {
		return date_finish;
	}

	public void setDate_finish(LocalDate date_finish) {
		this.date_finish = date_finish;
	}
	
}

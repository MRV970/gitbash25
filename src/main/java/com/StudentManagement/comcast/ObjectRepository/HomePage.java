package com.StudentManagement.comcast.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(xpath="//span[text()='My Profile']")
	private WebElement profilelink;
	@FindBy(xpath="//span[text()='Grade']")
	private WebElement gradelink;
	@FindBy(xpath="//span[text()='Subject']")
	private WebElement subjectlink;
	@FindBy(xpath="//span[text()='Teacher']")
	private WebElement teacherlink;                             
	@FindBy(xpath="//span[text()='Subject Routing']")
	private WebElement subjectRoutelink;
	@FindBy(xpath="//span[text()='Timetable']")
	private WebElement timetablelink;
	@FindBy(xpath="//span[text()='Event']")
	private WebElement eventlink;
	@FindBy(xpath="//a[text()=' Add Teacher']")
	private WebElement addteacherlink;
	@FindBy(xpath="//a[text()=' All Teacher']")
	private WebElement allteacherlink;
	@FindBy(xpath="//a[text()=' Add Student']")
	private WebElement addstudentlink;
	@FindBy(xpath="//a[text()=' My Events']")
	private WebElement myeventslink;
	@FindBy(xpath="//a[text()=' All Student']")
	private WebElement allstudentlink;
	@FindBy(xpath="//a[text()=' All Events']")
	private WebElement alleventslink;
	public WebElement getProfilelink() {
		return profilelink;
	}
	public WebElement getGradelink() {
		return gradelink;
	}
	public WebElement getSubjectlink() {
		return subjectlink;
	}
	public WebElement getTeacherlink() {
		return teacherlink;
	}
	public WebElement getSubjectRoutelink() {
		return subjectRoutelink;
	}
	public WebElement getTimetablelink() {
		return timetablelink;
	}
	public WebElement getEventlink() {
		return eventlink;
	}
	public WebElement getAddteacherlink() {
		return addteacherlink;
	}
	public WebElement getAllteacherlink() {
		return allteacherlink;
	}
	public WebElement getAddstudentlink() {
		return addstudentlink;
	}
	public WebElement getMyeventslink() {
		return myeventslink;
	}
	public WebElement getAllstudentlink() {
		return allstudentlink;
	}
	public WebElement getAlleventslink() {
		return alleventslink;
	}
	
	

}

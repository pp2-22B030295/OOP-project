package users;

import java.util.HashSet;

import Enums.UsersAction;
import other.Course;
import other.News;
import other.Order;

public class Data {
    private static Data instance;
    
    
    private HashSet<Student> students;
    private HashSet<Teacher> teachers;
    private HashSet<Manager> managers;
    private HashSet<ORManager> orManagers;
    private HashSet<DinOfficeManager> dinOfficeManagers;
    private HashSet<TechSupportSpecialist> techSupportSpecialists;
    private HashSet<News> newsSet;
    private HashSet<Course> courses;
    private HashSet<Order> orders;
    private HashSet<UsersAction> usersActions;
    private HashSet<GraduateStudent> graduateStudents;
    public String acsess = "Yes";
    private HashSet<StudentOrganization> studentOrganizations;
    private HashSet<Admin> admins;

    private Data() {
    	
        students = new HashSet<>();
        teachers = new HashSet<>();
        managers = new HashSet<>();
        orManagers = new HashSet<>();
        dinOfficeManagers = new HashSet<>();
        techSupportSpecialists = new HashSet<>();
        newsSet = new HashSet<>();
        courses = new HashSet<>();
        orders = new HashSet<>();
        usersActions = new HashSet<>();
        graduateStudents = new HashSet<>();
        studentOrganizations = new HashSet<>();
        admins = new HashSet<>();
    }

    public static synchronized Data getInstance() {
        if (instance == null) {
            instance = new Data();
        }
        return instance;
    }
    
    public User findUserById(String userId) {
        for (User user : students) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }
        for (User user : teachers) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }
        for (User user : managers) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }
        for (User user : orManagers) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }
        for (User user : dinOfficeManagers) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }
        for (User user : techSupportSpecialists) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }
        for (User user : graduateStudents) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }
        for (User user : admins) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }

        return null;
    }



    public HashSet<Student> getStudents() {
        return students;
    }

    public HashSet<Teacher> getTeachers() {
        return teachers;
    }

    public HashSet<Manager> getManagers() {
        return managers;
    }

    public HashSet<ORManager> getOrManagers() {
        return orManagers;
    }

    public HashSet<DinOfficeManager> getDinOfficeManagers() {
        return dinOfficeManagers;
    }

    public HashSet<TechSupportSpecialist> getTechSupportSpecialists() {
        return techSupportSpecialists;
    }

    public HashSet<News> getNewsSet() {
        return newsSet;
    }

    public HashSet<Course> getCourses() {
        return courses;
    }

    public HashSet<Order> getOrders() {
        return orders;
    }
    
    public HashSet<UsersAction> getUsersActions() {
        return usersActions;
    }
    
    public HashSet<GraduateStudent> getGraduateStudents() {
        return graduateStudents;
    }
    
    public void changeRegistrationAcsess(String acsess) {
    	if(acsess == "Yes" | acsess == "No") {	
    		this.acsess = acsess;
    	}
    }
    
    public HashSet<StudentOrganization> getStudentOrganizations() {
        return studentOrganizations;
    }

    public HashSet<Admin> getAdmins() {
        return admins;
    }


    public Student getStudentInfo(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    public Teacher getTeacherInfo(String id) {
        for (Teacher teacher : teachers) {
            if (teacher.getId().equals(id)) {
                return teacher;
            }
        }
        return null;
    }

    public Manager getManagerInfo(String id) {
        for (Manager manager : managers) {
            if (manager.getId().equals(id)) {
                return manager;
            }
        }
        return null;
    }

    // Add similar methods for News, Course, and Order classes
    public News getNewsInfo(String theme) {
        for (News news : newsSet) {
            if (news.theme.equals(theme)) {
                return news;
            }
        }
        return null;
    }

    public Course getCourseInfo(String courseCode) {
        for (Course course : courses) {
            if (course.getCourseCode().equals(courseCode)) {
                return course;
            }
        }
        return null;
    }

    public Order getOrderInfo(String orderId) {
        for (Order order : orders) {
            if (order.orderId.equals(orderId)) {
                return order;
            }
        }
        return null;
    }
    
    public GraduateStudent getGraduateStudentInfo(String id) {
        for (GraduateStudent graduateStudent : graduateStudents) {
            if (graduateStudent.getId().equals(id)) {
                return graduateStudent;
            }
        }
        return null;
    }
    
    public Admin getAdminInfo(String adminId) {
        for (Admin admin : admins) {
            if (admin.getId().equals(adminId)) {
                return admin;
            }
        }
        return null;
    }

    public StudentOrganization getStudentOrganizationInfo(String organizationName) {
        for (StudentOrganization organization : studentOrganizations) {
            if (organization.getName().equals(organizationName)) {
                return organization;
            }
        }
        return null;
    }
}

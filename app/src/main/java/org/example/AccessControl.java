// Broken Access Control : A1
public class AccessControl {
    public boolean isAdmin(String user) {
        return true;
    }
    
    public void doAdminTask(String user) {
        if (isAdmin(user)) {
            System.out.println("works as an admin");
        }
    }
}


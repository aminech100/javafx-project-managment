package App.dao.entities;

public class Employee {
    private String empId;
    private String empName;
    private String empDept;
    private String empDesignation;
    private String empPhone;
    private String empEmail;

    public Employee() {
    }

    public Employee(String empId, String empName, String empDesignation) {
        this.empId = empId;
        this.empName = empName;
        this.empDesignation = empDesignation;
    }

    public Employee(String empId, String empName, String empDept, String empDesignation, String empPhone, String empEmail) {
        this.empId = empId;
        this.empName = empName;
        this.empDept = empDept;
        this.empDesignation = empDesignation;
        this.empPhone = empPhone;
        this.empEmail = empEmail;

    }
    public String getEmpId() { return empId; }
    public void setEmpId(String empId) { this.empId = empId; }

    public String getEmpName() { return empName; }
    public void setEmpName(String empName) { this.empName = empName; }

    public String getEmpDept() { return empDept; }
    public void setEmpDept(String empDept) { this.empDept = empDept; }

    public String getEmpDesignation() { return empDesignation; }
    public void setEmpDesignation(String empDesignation) { this.empDesignation = empDesignation; }

    public String getEmpPhone() { return empPhone; }
    public void setEmpPhone(String empPhone) { this.empPhone = empPhone; }

    public String getEmpEmail() { return empEmail; }
    public void setEmpEmail(String empEmail) { this.empEmail = empEmail; }

    public String getEmployeeId() { return empId; }
    public String getEmployeeName() { return empName; }
    public String getDesignation() { return empDesignation; }

    @Override
    public String toString() {
        return empName != null ? empName : "";
    }
}